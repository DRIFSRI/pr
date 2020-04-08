package com.devcolibri.databaseexam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test extends JFrame {
    private int voron = 0;
    private JLabel countLabel;
    private JButton addCrow;
    private JButton removeCrow;

    public test(){
        super("Crow calculator");
        //Подготавливаем компоненты объекта
        countLabel = new JLabel("Crows:" + voron);
        addCrow = new JButton("Add Crow");
        removeCrow = new JButton("Remove Crow");

        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Расставляем компоненты по местам
        //buttonsPanel.add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже

        buttonsPanel.add(new JButton("sdfgsd"));
        //buttonsPanel.add(removeCrow);

        buttonsPanel.setVisible(true);
        //add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    public static void main(String[] args) {
        test app = new test();
        app.setVisible(true);
        app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }
}