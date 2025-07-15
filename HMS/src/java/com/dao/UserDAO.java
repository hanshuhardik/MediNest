/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import com.entity.User;
import java.sql.PreparedStatement;
/**
 *
 * @author HARDIK
 */
public class UserDAO {
    private Connection conn;
    public UserDAO(Connection conn){
        super();
        this.conn=conn;
    }
    public boolean register(User u){
    boolean f=false;
    
    try{
        String q="insert into USER_DTLS(FULLNAME,EMAIL,PASSWORD)VALUES (?,?,?)";
    PreparedStatement ps=conn.prepareStatement(q);
    ps.setString(1,u.getFullName());
    ps.setString(2,u.getEmail());
    ps.setString(3, u.getPassword());
    
   int i= ps.executeUpdate();
    if(i==1){
    f=true;
    }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return f;
    }

}

