/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author HARDIK
 */
public class User {
    private int id;
    private String fullName;
    private String email;
    private String password;
    
    public User(String fullName, String email,String Password){
    super();
    this.fullName=fullName;
    this.email=email;
    this.password=password;
    }
    
   public int getId(){
   return id;
   }
    public void setId(int id){
                this .id=id;
    }
    public String getFullName(){
    return fullName;
    }
    public void setFullName(String fullName){
    this.fullName=fullName;
    }
    public String getEmail(){
    return email;
    }
    public void setEmail(String email){
    this.email=email;
    }
    public String getPassword(){
    return password;
    }
    public void setPassword(String password){
    this.password=password;
    }

    private void Super() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
