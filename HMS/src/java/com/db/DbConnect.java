/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

/**
 *
 * @author HARDIK
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnect {
    private static Connection conn;
    public static Connection getconn(){
   try{
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       conn=DriverManager.getConnection("jdbc:derby://localhost:1527/hospital","hospital","hospital");
   }catch(Exception e){
       e.printStackTrace();}
        return conn;
    }
}
