package com.devcolibri.databaseexam;
//import com.sun.tools.javac.comp.Flow;

import javax.swing.*;
import java.awt.*;

public class MyWindowApp extends JFrame { //Наследуя от JFrame мы получаем всю функциональность окна

    public MyWindowApp(){
        super("My First Window"); //Заголовок окна
        setSize(600,400); //Если не выставить
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //setLayout(new GridBagLayout());
        //размер и положение
        //то окно будет мелкое и незаметное
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при

        //закрытии окна закрывалась и программа,
        //иначе она останется висеть в процессах
    }

    public static void main(String[] args) { //эта функция может быть и в другом классе
        MyWindowApp app = new MyWindowApp(); //Создаем экземпляр нашего приложения

        JComboBox jcb1 = new JComboBox(args);
        JComboBox jcb2 = new JComboBox(args);

        JTextField tf1=new JTextField(40);
        JTextField tf2=new JTextField(40);


        JPanel jp1 = new JPanel();

        jp1.add(jcb1);
        jp1.add(jcb2);

        JPanel jp2 = new JPanel();
        jp2.add(tf1);
        jp2.add(tf2);

        JButton but = new JButton("Ввод");
        //app.add(but,BorderLayout.);
        but.setSize(200,100);

        jp1.add(but);

        //Event event = new Event(){return 0;};
        //but.mouseEnter();


        //app.add(new JLabel(args ));
        app.getContentPane().add(jp1,BorderLayout.PAGE_START);
        app.getContentPane().add(jp2,BorderLayout.CENTER);

        //app.add(tf2);




        //app.add(new J(args ));
        //app.add(new JButton("OK"));
        app.setVisible(true); //С этого момента приложение запущено!

        //app.pack();
    }
}