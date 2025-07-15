<%-- 
    Document   : admin_login
    Created on : Feb 21, 2023, 5:15:00 PM
    Author     : HARDIK
--%>

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
            .bor{
                border:1px solid lightgrey;
                border-radius: 5px;
                padding-bottom: 5px;
                padding:5px 5px 5px 10px;
                margin-top: 5px;
                display:flex;
            }
            .space{
                align-self: centre;
                padding: 0px 10px 0px 10px;
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
                            <p class="fs-4 text-center">Patient Register</p>
                         
                                        <form method="post">
                                            <div class="mb-3">
                                                <label class="form-label">Name</label><input required name="fullname" type="text" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Patientid</label><input placeholder="1st three letter with last 2 digit of year"required name="patientid" type="text" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Password</label><input required name="password" type="Password" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Phone Number</label><input required name="phoneno" type="text" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                            <label>Gender</label><br>
                                            <div class="bor">
                                                <div class="space">   <input type="radio" name="gender" value="male"/> Male</div>
                                                    <div class="space">  <input type="radio" name="gender" value="female"/> Female</div>
                                                        <div class="space">  <input type="radio" name="gender" value="other"/> Other</div>
                                            </div>
                                            </div>
                                               
                                            <div class="mb-3">
                                                <label class="form-label">DOB</label><input required name="dob" type="date" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Precription</label><input name="precpt" type="text" class="form-control">
                                            </div>
                                      
                                            
                                            <button type="submit" class="btn bg-success text-white col-md-12">Register</button><br>
                                            got registered?<a href="user_login.jsp" class="text-decoration-none">Login..</a>
                                        </form>  
                             <%
            if(request.getParameter("fullname")!=null)
            {
                String fname=request.getParameter("fullname");
                String patientid=request.getParameter("patientid");
                String password=request.getParameter("password");
                String gender=request.getParameter("gender");
                String phoneno=request.getParameter("phoneno");
                String dob=request.getParameter("dob");
                String precpt=request.getParameter("precpt");
                
                String qr="insert into register(patientid,pname,phoneno,password,gender,dob,precreption) values('"+patientid+"','"+fname+"','"+phoneno+"','"+password+"','"+gender+"','"+dob+"','"+precpt+"')";
                out.println(qr);
            
            try{
                //to load driver
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //to establish connection
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/hospital","hospital","hospital");
                //statement
                Statement st=conn.createStatement();
                st.executeUpdate(qr);
                out.println("<h1>Registered</h1>");
            }
            catch(Exception e){
                out.print("some error"+e.getMessage());
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
