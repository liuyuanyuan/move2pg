/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Liu Yuanyuan
 */
public class TestUI
{

    public static void main(String[] args) throws Exception
    {
        String[] items = new String[]
        {
            "", "Apple", "Banana", "Carrot"
        };
        Color bgColor = UIManager.getColor("TextField.background");

        UIManager.put("ComboBox.selectionBackground", new ColorUIResource(bgColor));

        JComboBox<String> combo1 = new JComboBox<>(items);
        combo1.setPrototypeDisplayValue("XXXXXXXXXXXXXXX");
        combo1.setEditable(true);
        combo1.setSelectedIndex(-1);

        JComboBox<String> combo2 = new JComboBox<>(items);
        combo2.setPrototypeDisplayValue("XXXXXXXXXXXXXXX");
        combo2.setEditable(false);
        combo2.setSelectedIndex(-1);
        combo2.setBackground(bgColor);

        JFrame frame = new JFrame();
        Container c = frame.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(combo1);
        c.add(combo2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
