<%-- 
    Document   : admin_login
    Created on : Feb 21, 2023, 5:15:00 PM
    Author     : HARDIK
--%>
<%@page import="com.db.DbConnect"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login page</title>
        <%@include file="allcss.jsp"%>
        <style type="text/css">
            .paint-card{
                box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
            }
        </style>
        
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        
        <div class="container p-5">
            <div classs="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card paint-card">
                        <div class="card-body">
                            <p class="fs-4 text-center">Admin Login</p>

                                        <form  method="GET">
                                            <div class="mb-3">
                                                <label class="form-label">Email address</label><input required name="email" type="email" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Password</label><input required name="password" type="Password" class="form-control">
                                            </div>
                                            <button type="submit" class="btn bg-success text-white col-md-12">Login</button><br>
                                        </form>  
                            <% String email0="",password0="",name="",email="",password="";
                            if(request.getParameter("email")!=null && request.getParameter("password")!=null){
        email0=request.getParameter("email");
        password0=request.getParameter("password");
        try{
            String qr="SELECT * FROM HOSPITAL.ADMIN_DB where Email='"+email0+"'";
            
            out.println(qr);
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/hospital","hospital","hospital");
            out.println(conn);
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(qr);
            
            while(rs.next()){
            
            name=rs.getString("name");
            email=rs.getString("email");
            password=rs.getString("password");
            }
            if(email0.equalsIgnoreCase(email)&& password0.equals(password)){
               response.sendRedirect("admin_dashboard.jsp?name="+name+"");
                            
                            
            }else{
             out.println("<h6  style='color:red; text-align:center;'>Invalid username & password<h6>");
                 }
            
            
            
        }
        catch(Exception e){
        out.print("some error :"+e.getMessage());
        }
        
    }
%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                                        
                        
    </body>
</html>
