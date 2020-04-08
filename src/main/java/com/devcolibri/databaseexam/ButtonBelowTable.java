package com.devcolibri.databaseexam;

import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import javax.swing.table.*;
import javax.xml.crypto.Data;

class ButtonBelowTable extends JFrame

{

    private JPanel topPanel;

    private JTable table;

    public JScrollPane scrollPane;

    public JScrollPane scrollPane1;

    private String[] columnNames=new String[3];

    private String[][] dataValues=new String[3][3];

    JTextField textBox=new JTextField();

    JTextField textBox1=new JTextField();

    JButton button=new JButton("Click Here");

    public ButtonBelowTable(ArrayList<Valute> val)

    {

        setTitle("Button Below the Table");

        setSize(320,300);

        setDefaultCloseOperation (EXIT_ON_CLOSE);

        button.setBounds(75,200,90,30);

        columnNames=new String[] {"NumCode","CharCode","Nominal"," Name"," Value"};

        /*dataValues=new String[][]
                {

                        {"a","2","3"},


                        {"b","5","6"},

                        {"c","8","9"}

                };*/
        dataValues = new String[val.size()][5];
        for (int i=0;i!=val.size();i++
             ) {
            dataValues[i]=val.get(i).getArgs();
        }
        topPanel=new JPanel();

        topPanel.setLayout(null);

        getContentPane().add(topPanel);

        table=new JTable();

        TableModel  model=new myTableModel();

        table.setModel(model);

        scrollPane=new JScrollPane(table);

        scrollPane.setSize(300,200);

        scrollPane1=new JScrollPane(button);

        scrollPane1.setSize(90,30);

        scrollPane1.setBounds(75,200,150,30);

        topPanel.add(scrollPane);

        topPanel.add(scrollPane1);

    }

    public class myTableModel extends DefaultTableModel

    {

        myTableModel()

        {

            super(dataValues,columnNames);


        }

        public boolean isCellEditable(int row,int cols)

        {

            return true;

        }

    }

    public static void main(ArrayList<Valute> val)

    {

        ButtonBelowTable x=new ButtonBelowTable(val);

        x.setVisible(true);

    }

}