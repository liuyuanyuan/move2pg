/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lyy.pg.orcl.model.DBSource;
import lyy.pg.orcl.model.DatatypeMapping;
import lyy.pg.orcl.model.ObjInfo;
import lyy.pg.orcl.controller.DatatypeFactory;
import lyy.pg.orcl.util.DBEnum;
import lyy.pg.orcl.util.DBEnum.DBObject;
import lyy.pg.orcl.util.ObjectUtil;
import lyy.pg.orcl.util.ReportUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Liu Yuanyuan
 */
public class MainView extends JFrame
{
    private Logger logger = LogManager.getLogger(getClass());
    private ResourceBundle constBundle = ResourceBundle.getBundle("constants");

    public MainView()
    {
        logger.debug("Enter");
        initComponents();
        setTitle(constBundle.getString("title"));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/lyy/pg/orcl/image/orcl2pg.png")));
        //inital main view
        tbMain.removeAll();        
        tbMain.add(constBundle.getString("welcomeTitle"), pnlWelcome);        
        tfStatus.setText(constBundle.getString("welcomeTitle"));
        //customize lookand feel
        //cbbSourceDB.setBackground(Color.red);        
        spDatatype.getViewport().setBackground(Color.WHITE);//make table's empty area white
        spObject.getViewport().setBackground(Color.WHITE);//make table's empty area white
        //btnMigrate.setContentAreaFilled(false);//default is true
        //btnMigrate.setOpaque(true);
        //btnMigrate.setBackground(Color.WHITE);//not work
        //btnMigrate.setForeground(Color.BLACK);//work
        
        
        //welcome   
        taWelcome.setText(constBundle.getString("welcomeText"));
        btnOpenWelcome.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnOpenWelcomeActionPerformed(e);
            }
        });
                
        
        //db source
        cbbSourceDB.setModel(new DefaultComboBoxModel(new String[]
        {
            constBundle.getString("sourceDB")
        }));
        cbbTargetDB.setModel(new DefaultComboBoxModel(new String[]
        {
            constBundle.getString("targetDB")
        }));
        ActionListener dbActionListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dbActionPerformed(e);
            }
        };
        cbbSourceDB.addActionListener(dbActionListener);
        cbbTargetDB.addActionListener(dbActionListener);

        
        //datatype
        btnOpenDatatype.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnOpenDatatypeActionPerformed(e);
            }
        });
        tbDatatype.setModel(new DefaultTableModel(
                new Object[][]{},
                new Object[]{DBEnum.Oracle, DBEnum.PostgreSQL})
                {
                    Class[] types = new Class[]
                    {
                        String.class, String.class,
                    };
                    boolean[] canEdit = new boolean[]
                    {
                        false, true,
                    };
                    @Override
                    public Class getColumnClass(int columnIndex)
                    {
                        return types[columnIndex];
                    }
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex)
                    {
                        return canEdit[columnIndex];
                    }
                });
        
                
        //migrate
        btnOpenMigrate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnOpenMigrateActionPerformed(e);
            }
        });
        tbObject.setModel(new DefaultTableModel(
                new Object[][]{},
                new Object[]
                {
                    constBundle.getString("choose"),
                    constBundle.getString("objName"),
                    constBundle.getString("migrateResult"),
                    constBundle.getString("compareResult"),
                    constBundle.getString("syncResult")
                })
                {
                    Class[] types = new Class[]
                    {
                        Boolean.class, Object.class, Object.class, Object.class, Object.class
                    };
                    boolean[] canEdit = new boolean[]
                    {
                        true, false, false, false, false
                    };
                    @Override
                    public Class getColumnClass(int columnIndex)
                    {
                        return types[columnIndex];
                    }
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex)
                    {
                        return canEdit[columnIndex];
                    }
                });
        tbObject.getColumn(constBundle.getString("choose")).setMaxWidth(40);
        
        rbtnAll.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               chooseObj(true, (DefaultTableModel)tbObject.getModel());
            }
        });
        rbtnNone.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               chooseObj(false, (DefaultTableModel)tbObject.getModel());
            }
        });
        rbtnReverse.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
               chooseReverseObj((DefaultTableModel)tbObject.getModel());
            }
        });

        btnReport.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               btnReportActionPerformed(e);
            }
        });
                
        
        //convert
        btnOpenConvert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnOpenConvertActionPerformed(e);
            }
        });
        cbbObjType.setModel(new DefaultComboBoxModel(new DBObject[]
        {
            DBObject.Procedure, DBObject.Function, DBObject.Trigger, DBObject.Package
            , DBObject.MView, DBObject.DBLink, DBObject.Synonym
        }));
        cbbObjType.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                cbbObjTypeActionPerformed(e);
            }
        });
        cbbObjects.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cbbObjectsActionPerformed(e);
            }
        });
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btngChooseObj = new javax.swing.ButtonGroup();
        toolBar = new javax.swing.JToolBar();
        cbbSourceDB = new javax.swing.JComboBox();
        cbbTargetDB = new javax.swing.JComboBox();
        btnOpenDatatype = new javax.swing.JButton();
        btnOpenMigrate = new javax.swing.JButton();
        btnOpenConvert = new javax.swing.JButton();
        btnOpenWelcome = new javax.swing.JButton();
        tbMain = new javax.swing.JTabbedPane();
        pnlWelcome = new javax.swing.JPanel();
        spWelcome = new javax.swing.JScrollPane();
        taWelcome = new javax.swing.JTextArea();
        pnlDatatype = new javax.swing.JPanel();
        spDatatype = new javax.swing.JScrollPane();
        tbDatatype = new javax.swing.JTable();
        pnlMigrate = new javax.swing.JPanel();
        spObject = new javax.swing.JScrollPane();
        tbObject = new javax.swing.JTable();
        rbtnAll = new javax.swing.JRadioButton();
        rbtnReverse = new javax.swing.JRadioButton();
        rbtnNone = new javax.swing.JRadioButton();
        btnReport = new javax.swing.JButton();
        btnSync = new javax.swing.JButton();
        btnCompare = new javax.swing.JButton();
        btnMigrate = new javax.swing.JButton();
        pnlConvert = new javax.swing.JPanel();
        cbbObjType = new javax.swing.JComboBox();
        cbbObjects = new javax.swing.JComboBox();
        btnExecute = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        spEditor = new javax.swing.JSplitPane();
        spSource = new javax.swing.JScrollPane();
        epSource = new javax.swing.JEditorPane();
        spPG = new javax.swing.JScrollPane();
        epPG = new javax.swing.JEditorPane();
        tfStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolBar.setRollover(true);
        toolBar.add(cbbSourceDB);
        toolBar.add(cbbTargetDB);

        btnOpenDatatype.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lyy/pg/orcl/image/datatype_48px.png"))); // NOI18N
        btnOpenDatatype.setFocusable(false);
        btnOpenDatatype.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenDatatype.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnOpenDatatype);

        btnOpenMigrate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lyy/pg/orcl/image/migrator_48px.png"))); // NOI18N
        btnOpenMigrate.setFocusable(false);
        btnOpenMigrate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenMigrate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnOpenMigrate);

        btnOpenConvert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lyy/pg/orcl/image/convert_48px.png"))); // NOI18N
        btnOpenConvert.setFocusable(false);
        btnOpenConvert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenConvert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnOpenConvert);

        btnOpenWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lyy/pg/orcl/image/orcl2pg.png"))); // NOI18N
        btnOpenWelcome.setFocusable(false);
        btnOpenWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenWelcome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnOpenWelcome);

        getContentPane().add(toolBar, java.awt.BorderLayout.NORTH);

        pnlWelcome.setBackground(new java.awt.Color(255, 255, 255));

        taWelcome.setEditable(false);
        taWelcome.setColumns(20);
        taWelcome.setRows(5);
        taWelcome.setText("\n\t欢迎使用oracl2pg ^-^\n        \n        \n");
        spWelcome.setViewportView(taWelcome);

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        tbMain.addTab(constBundle.getString("welcomeTitle"), pnlWelcome);

        spDatatype.setBackground(new java.awt.Color(255, 255, 255));

        tbDatatype.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Title 1", "Title 2"
            }
        ));
        spDatatype.setViewportView(tbDatatype);

        javax.swing.GroupLayout pnlDatatypeLayout = new javax.swing.GroupLayout(pnlDatatype);
        pnlDatatype.setLayout(pnlDatatypeLayout);
        pnlDatatypeLayout.setHorizontalGroup(
            pnlDatatypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spDatatype, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        pnlDatatypeLayout.setVerticalGroup(
            pnlDatatypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spDatatype, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        tbMain.addTab(constBundle.getString("datatypeTitle"), pnlDatatype);

        pnlMigrate.setBackground(new java.awt.Color(255, 255, 255));

        tbObject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "标题 1", "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        spObject.setViewportView(tbObject);

        rbtnAll.setBackground(new java.awt.Color(255, 255, 255));
        btngChooseObj.add(rbtnAll);
        rbtnAll.setText("All");

        rbtnReverse.setBackground(new java.awt.Color(255, 255, 255));
        btngChooseObj.add(rbtnReverse);
        rbtnReverse.setText("Reverse");

        rbtnNone.setBackground(new java.awt.Color(255, 255, 255));
        btngChooseObj.add(rbtnNone);
        rbtnNone.setSelected(true);
        rbtnNone.setText("None");

        btnReport.setText(constBundle.getString("report"));

        btnSync.setText(constBundle.getString("sync"));

        btnCompare.setText(constBundle.getString("compare"));

        btnMigrate.setBackground(new java.awt.Color(237, 237, 253));
        btnMigrate.setText(constBundle.getString("migrate"));

        javax.swing.GroupLayout pnlMigrateLayout = new javax.swing.GroupLayout(pnlMigrate);
        pnlMigrate.setLayout(pnlMigrateLayout);
        pnlMigrateLayout.setHorizontalGroup(
            pnlMigrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spObject)
            .addGroup(pnlMigrateLayout.createSequentialGroup()
                .addComponent(rbtnAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnReverse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnNone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btnMigrate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSync)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport)
                .addContainerGap())
        );
        pnlMigrateLayout.setVerticalGroup(
            pnlMigrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMigrateLayout.createSequentialGroup()
                .addComponent(spObject, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMigrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAll)
                    .addComponent(rbtnReverse)
                    .addComponent(rbtnNone)
                    .addComponent(btnReport)
                    .addComponent(btnSync)
                    .addComponent(btnCompare)
                    .addComponent(btnMigrate))
                .addGap(10, 10, 10))
        );

        tbMain.addTab(constBundle.getString("migrateTitle"), pnlMigrate);

        pnlConvert.setBackground(new java.awt.Color(255, 255, 255));

        cbbObjType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Function", "Procedure", "Package" }));

        btnExecute.setText(constBundle.getString("execute"));

        btnConvert.setText(constBundle.getString("convert"));

        spEditor.setDividerSize(1);
        spEditor.setResizeWeight(0.5);

        spSource.setViewportView(epSource);

        spEditor.setLeftComponent(spSource);

        spPG.setViewportView(epPG);

        spEditor.setRightComponent(spPG);

        javax.swing.GroupLayout pnlConvertLayout = new javax.swing.GroupLayout(pnlConvert);
        pnlConvert.setLayout(pnlConvertLayout);
        pnlConvertLayout.setHorizontalGroup(
            pnlConvertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbObjType, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbObjects, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(btnConvert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecute)
                .addContainerGap())
            .addComponent(spEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlConvertLayout.setVerticalGroup(
            pnlConvertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConvertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbObjType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbObjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExecute)
                    .addComponent(btnConvert))
                .addGap(9, 9, 9)
                .addComponent(spEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
        );

        tbMain.addTab(constBundle.getString("convertTitle"), pnlConvert);

        getContentPane().add(tbMain, java.awt.BorderLayout.CENTER);
        tbMain.getAccessibleContext().setAccessibleName(constBundle.getString("welcomeTitle"));

        tfStatus.setEditable(false);
        tfStatus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfStatus.setText("current status...");
        getContentPane().add(tfStatus, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DBSource getSourceDB()
    {
        return cbbSourceDB.getSelectedItem() instanceof DBSource?
                (DBSource)cbbSourceDB.getSelectedItem() : null;                
    }
    private DBSource getTargetDB()
    {
        return cbbTargetDB.getSelectedItem() instanceof DBSource?
                (DBSource)cbbTargetDB.getSelectedItem() : null;                
    }
    
    //welcome
    private void btnOpenWelcomeActionPerformed(ActionEvent e)
    {
        logger.debug(e.getActionCommand());
        tbMain.removeAll();
        tbMain.add(constBundle.getString("welcomeTitle"), pnlWelcome);
        tfStatus.setText(constBundle.getString("welcomeTitle"));
    }
    
    //db source
    private void dbActionPerformed(ActionEvent e)
    {
        logger.debug(e.getActionCommand());

        JComboBox cbb = (JComboBox) e.getSource();
        Object selectedItem = cbb.getSelectedItem();
        if (selectedItem == null)//selected nothing
        {
            return;
        } else if (selectedItem instanceof DBSource)//selected db
        {
            logger.warn("Changed db source");
            return;
        }

        //selected config db
        logger.debug(selectedItem.toString());
        DBConfigDialog dbcDialog = new DBConfigDialog(this, true,
                selectedItem.equals(constBundle.getString("sourceDB")) ? DBEnum.Oracle : DBEnum.PostgreSQL);
        dbcDialog.setLocationRelativeTo(this);
        dbcDialog.setVisible(true);
        logger.debug("response=" + dbcDialog.getResponse());
        if (dbcDialog.getResponse() == 0)
        {
            DBSource db = dbcDialog.getDBSource();
            cbb.addItem(db);
            cbb.setSelectedItem(db);
        }
    }

    
    //datatype
    private void btnOpenDatatypeActionPerformed(ActionEvent e)
    {
        logger.debug("Enter:" + e.getActionCommand());
        tbMain.removeAll();
        tbMain.add(constBundle.getString("datatypeTitle"), pnlDatatype);
        tfStatus.setText(constBundle.getString("datatypeTitle"));
        fillTbDatatype();
    }
    private void fillTbDatatype()
    {
        logger.info("Enter");
        DefaultTableModel model = (DefaultTableModel) tbDatatype.getModel();
        if (model.getRowCount() > 0)
        {
            /*logger.info("Clean Table");
             for (int i = model.getRowCount() - 1; i >= 0; i--)
             {
             model.removeRow(i);
             }*/
            logger.debug("Remain and return.");
            return;
        }

        List<DatatypeMapping> datatypeList = DatatypeFactory.getInstance().getDefaultDatatypeCasts(DBEnum.Oracle);
        logger.info("datatypeList.size = " + datatypeList.size());
        for (DatatypeMapping DatatypeMapping : datatypeList)
        {
            Object[] rowData = new Object[2];
            rowData[0] = DatatypeMapping.getSourceDatatype();
            rowData[1] = DatatypeMapping.getPgDatatype();
            model.addRow(rowData);
        }
    }

    
    //migrate
    private void btnOpenMigrateActionPerformed(ActionEvent e)
    {
        logger.debug("Enter:" + e.getActionCommand());
        tbMain.removeAll();
        tbMain.add(constBundle.getString("migrateTitle"), pnlMigrate);
        tfStatus.setText(constBundle.getString("migrateTitle"));
        fillTbObject();
    }
    private void fillTbObject()
    {
        logger.info("Enter");
        DefaultTableModel model = (DefaultTableModel) tbObject.getModel();
        if (model.getRowCount() > 0)
        {
            /*logger.info("Clean Table");
             for (int i = model.getRowCount() - 1; i >= 0; i--)
             {
             model.removeRow(i);
             }*/
            logger.debug("Remain and return.");
            return;
        }
        try
        {
            DBSource sdb = getSourceDB();
            if(sdb == null)
            {
                JOptionPane.showMessageDialog(this, constBundle.getString("configDBSource"),
                    constBundle.getString("warning"), JOptionPane.WARNING_MESSAGE);
                return;
            }
            List<ObjInfo> objectList = ObjectUtil.getTypedObjects(sdb, DBEnum.DBObject.Table);
            logger.info("objectList.size = " + objectList.size());
            for (ObjInfo obj : objectList)
            {
                Object[] rowData = new Object[5];
                rowData[0] = false;
                rowData[1] = obj.getName();
                model.addRow(rowData);
            }
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    constBundle.getString("error"), JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(System.out);
        }     
    }
    private void chooseObj(boolean choose, DefaultTableModel model)
    {
        for (int i = 0; i < model.getRowCount(); i++)
        {
            model.setValueAt(choose, i, 0);
        }
    }
    private void chooseReverseObj(DefaultTableModel model)
    {
        for (int i = 0; i < model.getRowCount(); i++)
        {
            model.setValueAt(!(boolean)model.getValueAt(i, 0), i, 0);
        }
    }
    
    private void btnReportActionPerformed(ActionEvent e)
    {
        logger.debug(e.getActionCommand());
        try
        {
            StringBuilder rows = new StringBuilder();
            TableModel objModel = tbObject.getModel();
            logger.debug("RowCount=" + objModel.getRowCount());
            for (int i = 0; i < objModel.getRowCount(); i++)
            {
                rows.append(ReportUtil.RowFormat
                        .replace("no", String.valueOf(i + 1))
                        .replace("name", objModel.getValueAt(i, 1) == null ? "" : objModel.getValueAt(i, 1).toString())
                        .replace("migrateResult", objModel.getValueAt(i, 2) == null ? "" : objModel.getValueAt(i, 2).toString())
                        .replace("compareResult", objModel.getValueAt(i, 3) == null ? "" : objModel.getValueAt(i, 3).toString())
                        .replace("syncResult", objModel.getValueAt(i, 4) == null ? "" : objModel.getValueAt(i, 4).toString()));
            }
            ReportUtil.createMigrateReport(getSourceDB().getUser(), rows.toString());
        } catch (Exception ex)
        {
            logger.error(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    constBundle.getString("error"), JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(System.out);
        }
    }
    
     
    //convert
    private void btnOpenConvertActionPerformed(ActionEvent e)
    {
        logger.debug("Enter:" + e.getActionCommand());
        tbMain.removeAll();
        tbMain.add(constBundle.getString("convertTitle"), pnlConvert);
        tfStatus.setText(constBundle.getString("convertTitle"));
        //filleTbSQLObject();
    }
    private void cbbObjTypeActionPerformed(ActionEvent e)
    {
        logger.debug(e.getActionCommand());

    }
    private void cbbObjectsActionPerformed(ActionEvent e)
    {
        logger.debug(e.getActionCommand());
        Object obj = cbbObjects.getSelectedItem();
        if(obj == null)
        {
            logger.warn("Selected object is null, do nothing and return.");
            return;
        }
        
        
    }
    
    public static void main(String args[])
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName().toString());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            //java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
            ex.printStackTrace(System.out);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                MainView mainView = new MainView();
                mainView.setLocationRelativeTo(null);
                mainView.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompare;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnMigrate;
    private javax.swing.JButton btnOpenConvert;
    private javax.swing.JButton btnOpenDatatype;
    private javax.swing.JButton btnOpenMigrate;
    private javax.swing.JButton btnOpenWelcome;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSync;
    private javax.swing.ButtonGroup btngChooseObj;
    private javax.swing.JComboBox cbbObjType;
    private javax.swing.JComboBox cbbObjects;
    private javax.swing.JComboBox cbbSourceDB;
    private javax.swing.JComboBox cbbTargetDB;
    private javax.swing.JEditorPane epPG;
    private javax.swing.JEditorPane epSource;
    private javax.swing.JPanel pnlConvert;
    private javax.swing.JPanel pnlDatatype;
    private javax.swing.JPanel pnlMigrate;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JRadioButton rbtnAll;
    private javax.swing.JRadioButton rbtnNone;
    private javax.swing.JRadioButton rbtnReverse;
    private javax.swing.JScrollPane spDatatype;
    private javax.swing.JSplitPane spEditor;
    private javax.swing.JScrollPane spObject;
    private javax.swing.JScrollPane spPG;
    private javax.swing.JScrollPane spSource;
    private javax.swing.JScrollPane spWelcome;
    private javax.swing.JTextArea taWelcome;
    private javax.swing.JTable tbDatatype;
    private javax.swing.JTabbedPane tbMain;
    private javax.swing.JTable tbObject;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
