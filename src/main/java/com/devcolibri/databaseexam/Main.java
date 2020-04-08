package com.devcolibri.databaseexam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.*;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;



import com.mysql.jdbc.Driver;
import java.io.*;
public class Main {
        private static final String url = "jdbc:mysql://localhost:3306";
        private static final String user = "root";
        private static final String password = "111";
        public static void main (String[]args) throws Exception 
        {



                Integer A = 3;


            //SQLConnection.Con();
               try
               {

                    test.main(null);


                   lValute = SQLConnection.Con(lValute,new Date(Integer.parseInt(mstr[2]),Integer.parseInt(mstr[1]),Integer.parseInt(mstr[0])));
                   String s;
                   int num=0;
                   while (true)
                   {


                       String []strg;
                       strg = new String[lValute.size()];
                       int i =0;
                       for (Valute v:lValute
                            ) {
                           strg[i]=lValute.get(i).Name;
                           i++;
                       }

                       MyWindowApp.main(strg);

                       //Object o [] = lValute.toArray();
                       ButtonBelowTable.main(lValute);


                       CardLayoutTest.main(null);
                       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                       System.out.println(lValute.get(num).toString());
                       s= reader.readLine();
                       if(s.equals("list"))
                       {
                           int j=0;
                           for (Valute v:lValute
                                ) {
                               System.out.println(j+++"."+v.toString());
                           }
                       }
                        else
                       {
                           System.out.println(Integer.parseInt(s)*lValute.get(num).Value);
                       }
                   }

               }
               catch (Exception ax)
               {
                   System.out.println();
               }
        }

        private ArrayList<Valute> InspectValute()
        {
            ArrayList<Valute> lValute = new ArrayList<Valute>();
            Document dc = Jsoup.connect("http://www.cbr.ru/scripts/XML_daily.asp").get();

            //System.out.println(dc);
            // System.out.println(dc);
            for (Element e:dc.select("Valute"))
            {
                lValute.add(new Valute(
                        Integer.parseInt(e.select("NumCode").text())
                        ,e.select("CharCode").text()
                        ,Integer.parseInt(e.select("Nominal").text())
                        ,e.select("Name").text()
                        ,Double.parseDouble(e.select("Value").text().replace(",","."))
                ));
            }
            String []mstr = dc.select("ValCurs").attr("Date").split("\\.");
            return lValute;
        }
}