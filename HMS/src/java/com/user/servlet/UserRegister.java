/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.user.servlet;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;

import com.entity.User;
import com.dao.UserDAO;
import com.db.DbConnect;
/**
 *
 * @author HARDIK
 */
//@WebServlet("/user_register")
public class UserRegister extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
    
        
        try{
        
            
            String fullname=req.getParameter("fullname");
            String email=req.getParameter("email");
            String password=req.getParameter("pasword");

            User u=new User(fullname,email,password);
            
            UserDAO dao=new UserDAO(DbConnect.getconn());
            
            HttpSession session=req.getSession();
            
            
            
            
            boolean f=dao.register(u);
            
            if(f){
                session.setAttribute("sucMsg","Data inserted successfully");
                resp.sendRedirect("signup");
            System.out.println("Data inserted successfully");
            }else{
                session.setAttribute("errorMsg","Data not  inserted ");
                resp.sendRedirect("signup");
            System.out.println("unsuccessfully");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
