/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.barsopen.plsqlconverter.ast.transforms;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.barsopen.plsqlconverter.Main;
import ru.barsopen.plsqlconverter.ast.typed._baseNode;
import ru.barsopen.plsqlconverter.ast.typed.expression_element_standard_fn;
import ru.barsopen.plsqlconverter.ast.typed.general_element;
import ru.barsopen.plsqlconverter.ast.typed.general_element_id;
import ru.barsopen.plsqlconverter.ast.typed.general_element_item;
import ru.barsopen.plsqlconverter.ast.typed.general_expression;
import ru.barsopen.plsqlconverter.ast.typed.into_clause;
import ru.barsopen.plsqlconverter.ast.typed.projection_list;
import ru.barsopen.plsqlconverter.ast.typed.query_block;
import ru.barsopen.plsqlconverter.ast.typed.select_statement;
import ru.barsopen.plsqlconverter.ast.typed.selected_element;
import ru.barsopen.plsqlconverter.ast.typed.standard_function_count;

/**
 *
 * @author Liu Yuanyuan
 */
public class Oracle2PGSyntaxTransformer
{
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void transformDiffs(_baseNode tree) throws Exception
    {
        logger.debug("Enter:tree=" + tree);
        removeOrderbyForSelectCountWithoutGroupBy(tree);
        replaceRowidWithCtid(tree);
    }

    /*
     *    oracle:SELECT COUNT(x) ..<no_group_by>.. ORDER BY  
     *     -> pg:SELECT COUNT(x) ..<no_group_by>.. 
     *    needn't remove ORDER BY when has group by clause
     *    Oracle SELECT Syntax ref: https://docs.oracle.com/en/database/oracle/oracle-database/18/sqlrf/SELECT.html#GUID-CFA006CA-6FF1-4972-821E-6996142A51C6
     */
    private static void removeOrderbyForSelectCountWithoutGroupBy(_baseNode tree) throws Exception
    {
        List<select_statement> selectStatements = AstUtil.getDescendantsOfType(tree, select_statement.class);
        logger.debug("select_statements=" + selectStatements.size());
        for (select_statement ss : selectStatements)
        {            
            try
            {
                if (ss.is_order_by_clause())
                {
                    if (ss.get_subquery().subquery_basic_elements == null || !(ss.get_subquery().subquery_basic_elements instanceof query_block))
                    {
                        continue;
                    }
                    query_block qb = (query_block) ss.get_subquery().subquery_basic_elements;
                    logger.debug("queryBlock=" + qb);
                    if (qb.is_group_by_clause()
                            || qb.query_block_projection == null || !(qb.query_block_projection instanceof projection_list))
                    {
                        continue;
                    }
                    projection_list pl = (projection_list) qb.query_block_projection;
                    for (selected_element se : pl.selected_elements)
                    {
                        if (se.expression == null || !(se.expression instanceof general_expression))
                        {
                            continue;
                        }
                        general_expression ge = (general_expression) se.expression;
                        replaceRowidWithCtid(ge);
                        if (ge.expression_element == null || !(ge.expression_element instanceof expression_element_standard_fn))
                        {
                            continue;
                        }
                        expression_element_standard_fn eesf = (expression_element_standard_fn) ge.expression_element;
                        logger.debug("expression_element_standard_fn=" + eesf);
                        if (eesf.standard_function != null && eesf.standard_function instanceof standard_function_count)
                        {
                            ss.set_order_by_clause(null);
                            break;
                        }
                    }
                }
            } catch (Exception ex)
            {
                logger.error(ex.getMessage());
                ex.printStackTrace();
                throw new Exception(ex);
            } finally
            {
                logger.debug("Return=" + ss);
            }
        }
    }


    /*
     replace rowid with ctid
     for all selected_elements, from_clause, where_clause, hierarchical_query_clause, group_by_clause, model_clause
     except into_clause.                 
     */
    private static void replaceRowidWithCtid(_baseNode tree) throws Exception
    {       
        List<general_element_item> geis = AstUtil.getDescendantsOfType(tree, general_element_item.class);
        logger.debug("general_element_items=" + geis.size());
        for (general_element_item gei : geis)
        {
            if (gei == null && !(gei instanceof general_element_id))
            {
                continue;
            }
            general_element_id geid = (general_element_id) gei;
            if (geid._parent instanceof general_element
                    && ((general_element) geid._parent)._parent instanceof into_clause)
            {                
                continue;
            }
            logger.debug("id value=" + geid.id.value);
            if (geid.id.value.equalsIgnoreCase("rowid"))
            {
                geid.id.set_value("ctid");
            }
        }
       
        /*
        //for select
        List<selected_element> selectedStatements = AstUtil.getDescendantsOfType(tree, selected_element.class);
        for (selected_element se : selectedStatements)
        {
            logger.debug("selected_element=" + se);
            if (se.expression == null || !(se.expression instanceof general_expression))
            {
                continue;
            }
            general_expression ge = (general_expression) se.expression;
            if (ge == null || ge.expression_element == null || !(ge.expression_element instanceof general_element))
            {
                return;
            }
            general_element gee = (general_element) ge.expression_element;
            for (general_element_item gei : gee.general_element_items)
            {
                if (gei == null || !(gei instanceof general_element_id))
                {
                    continue;
                }
                general_element_id geid = (general_element_id) gei;
                logger.debug("id value=" + geid.id.value);
                if (geid.id.value.equalsIgnoreCase("rowid"))
                {
                    geid.id.set_value("ctid");
                }
            }
        }
            
        //for where
        List<where_clause> wcs = AstUtil.getDescendantsOfType(tree, where_clause.class);
        for (where_clause wc : wcs)
        {
            logger.debug("where_clause=" + wc);
            if (wc.expression == null || !(wc.expression instanceof logic_expression))
            {
                continue;
            }
            logic_expression le =  (logic_expression) wc.expression;
            if(le.expression_element == null || !(le.expression_element instanceof expression_element_gt))
            {
                continue;
            }
            expression_element_gt eeg = (expression_element_gt) le.expression_element;
            if (eeg.lhs == null || !(eeg.lhs instanceof general_element))
            {
                continue;
            }
            general_element ge = (general_element) eeg.lhs;
            for (general_element_item gei : ge.general_element_items)
            {
                if (gei == null && !(gei instanceof general_element_id))
                {
                    continue;
                }
                general_element_id geid = (general_element_id) gei;
                logger.debug("id value=" + geid.id.value);
                if (geid.id.value.equalsIgnoreCase("rowid"))
                {
                    geid.id.set_value("ctid");
                }
            }
        }
        
        //for order by
        List<order_by_elements> obcs = AstUtil.getDescendantsOfType(tree, order_by_elements.class);
//        for (order_by_clause obc : obcs)
//        {
//            logger.debug("order_by_clause=" + obc);
//            if(obc.order_by_elements_list==null)
//            {
//                continue;
//            }
//            for(order_by_elements e : obc.order_by_elements_list.elements)
              for(order_by_elements e : obcs)
              {
                 logger.debug("order_by_elements=" + e);
                if(e.expression==null || !(e.expression instanceof general_expression))
                {
                    continue;
                }
                general_expression ge = (general_expression) e.expression;
                if(ge.expression_element==null || !(ge.expression_element instanceof general_element))
                {
                    continue;
                }
                general_element gee = (general_element) ge.expression_element;;
                for(general_element_item gei : gee.general_element_items)
                {
                      if (gei == null || !(gei instanceof general_element_id))
                      {
                          continue;
                      }
                      general_element_id geid = (general_element_id) gei;
                      logger.debug("id value=" + geid.id.value);
                      if (geid.id.value.equalsIgnoreCase("rowid"))
                      {
                          geid.id.set_value("ctid");
                      }
                  } 
            }
                */
        
    }
    
}
