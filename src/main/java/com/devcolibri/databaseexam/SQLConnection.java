package com.devcolibri.databaseexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import com.mysql.cj.jdbc.*;
//import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;


//import org.springframework.jbdc
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate.*;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

public class SQLConnection {
    void s()
    {

    }

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "111";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void Con__(){
        String sql = "INSERT INTO zzz " +
                "(a, b, c) VALUES (:a, :b, :c)";

        Map<String, Object> parameters = new HashMap<String, Object>();
//        Valute v = new Valute(0,"d",4,"f",4.4);
//        stmt.put("NumCode", v.NumCode);
//        stmt.("CharCode", v.CharCode);
//        stmt.("Nominal", v.Nominal);
//        stmt.("Name", v.Name);
//        stmt.("Value", v.Value)

        parameters.put("a", 1);
        parameters.put("b", 1);
        parameters.put("c", 1);



       // new JdbcDaoSupport().getJdbcTemplate().update(sql);
        //DataSource l = new DataSource
    }


    public static ArrayList<Valute> Con(ArrayList<Valute> v, Date mDate)
    {

        try
        {
            // Class.forName("com.mysql.cj.jdbc.Driver");"Isert (dsf,sf,sd) from ("+gf.ToString+")"
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            // opening database connection to MySQL server
            // Driver dv = new Fab

            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            String sql;
            PreparedStatement pr;

            if(false) {
                sql = "insert into table_4 values (?, ?, ?,?,?,? )";
                pr = con.prepareStatement(sql);
                // todo блабла шоу
                for (Valute val : v) {
                    pr.setInt(1, val.NumCode);
                    pr.setString(2, val.CharCode);
                    pr.setInt(3, val.Nominal);
                    pr.setString(4, val.Name);
                    pr.setDouble(5, val.Value);
                    pr.setDate(6, mDate);
                    pr.execute();

                }
                pr.close();
            }

            sql ="select *from table_4";

            ResultSet a = ( pr= con.prepareStatement(sql)).executeQuery();
            v.clear();
            while(a.next())
            {

                v.add
                        (new Valute(a.getInt("NumCode"),
                                a.getString("CharCode"),
                                a.getInt("Nominal"),
                                a.getString("Name"),
                                a.getDouble("Value"))
                        );

            }

            pr.close();
            a.close();

            //con.close();
            return v;

           // con.close();
           // NamedParameterJdbcTemplate a = new NamedParameterJdbcTemplate;


            //JdbcTemplate jdbctemp = new JdbcTemplate();
            //jdbctemp.
            /*String strSql ="";
            NamedParamStatement stm = new NamedParamStatement(con,strSql);
            stm.setInt("age");*/
            //String sql ="INSERT INTO `2` (NumCode ,CharCode ,Nominal ,Name ,Value) VALUES (0,' ',0,' ',2.3)";
            //String sql = "insert into zzz (a,b,c) values (0, 0, 5)";
            //sql = "select * from zzz";
            //Statement s = con.createStatement() ;
            //.executeQuery(sql);


/*

            String sql = "INSERT INTO 2 VALUES (:NumCode ,:CharCode ,:Nominal ,:Name ,:Value )";
            Valute v = new Valute(0,"d",4,"f",4.4);

            NamedParameterJdbcTemplate stmt = new NamedParameterJdbcTemplate(con);
            NamedParameterJdbcTemplate*/
/*
            stmt.("NumCode", v.NumCode);
            stmt.setString("CharCode", v.CharCode);
            stmt.setInt("Nominal", v.Nominal);
            stmt.setString("Name", v.Name);
            stmt.setDouble("Value", v.Value);*/
            //stmt.();
            //stmt
            //System.out.println(rs);
            // getting Statement object to execute query
            //stmt = con.createStatement();
            //JdbcTemplate.

            
/*
            PreparedStatement pstm =con.prepareStatement(
                    "INSERT INTO CUSTOMER " +
                            "(NumCode,CharCode,Nominal,Name,Value) " +
                            "VALUES (:NumCode,:CharCode,:Nominal,:Name,:Value)");



            pstm.setInt(1,1);*/

/*
            String strsql = "NumCode CharCode Nominal String Name Value";
            PreparedStatement dad  = con.prepareStatement(" ");

            // executing SELECT query
            //rs = stmt.executeQuery(query);

            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of books in the table : " + count);
            }*/     

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            System.out.println(sqlEx.getMessage());
        }
        catch(Exception ex)
        {}
        finally {
            //close connection ,stmt and resultset here
            //try { con.close();         } catch(SQLException se) { /*can't do anything */ }
            //try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
           // try { rs.close(); } catch(SQLException se) { /*can't do anything */ }

        }
        return null;
    }


}

