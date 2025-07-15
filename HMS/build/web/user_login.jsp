<%-- 
    Document   : user_login
    Created on : Feb 21, 2023, 5:14:10 PM
    Author     : HARDIK
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User login Page</title>
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
                            <p class="fs-4 text-center">Patients Login</p>

                                        <form acton="doclogin" method="post">
                                            <div class="mb-3">
                                                <label class="form-label">Patient Id</label><input required name="patientid" type="text" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Password</label><input required name="password" type="Password" class="form-control">
                                            </div>
                                            <button type="submit" class="btn bg-success text-white col-md-12">Login</button><br>
                                            Don't have an account?<a href="signup.jsp" class="text-decoration-none">Create account</a>
                                        </form>  
 <%  String patientid0="",password="",name="", patientid="",password0="";
    if(request.getParameter("patientid")!=null && request.getParameter("password")!=null){
        patientid0=request.getParameter("patientid");
        password0=request.getParameter("password");
        try{
            String qr="Select * from register where patientid='"+patientid0+"'";
            
            out.println(qr);
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/hospital","hospital","hospital");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(qr);
            
            while(rs.next()){
            
            name=rs.getString("pname");
            patientid=rs.getString("patientid");
            password=rs.getString("password");
            }
            if(patientid0.equalsIgnoreCase(patientid)&& password0.equals(password)){
               response.sendRedirect("user_dash.jsp?name="+name+"");
                            
                            
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
