<%-- 
    Document   : admin_dashboard
    Created on : Apr 18, 2023, 11:14:54 AM
    Author     : HARDIK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>admin dashboard Page</title>
        <%@include file="allcss.jsp"%>
        
        <style type="text/css">
            .paint-card{
                box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
            }
        </style>
         </head>
    <body>
        <%@include file="anavbar.jsp" %>
        <div class="container p-5 text-success">
            <p class="text-center fs-3"><i class="fa-solid fa-hospital-user"></i><b> Admin dashboard</b><p/>
            
        <div class="row">
            <div class="col-md-4">
                <div class="card paint-card">
                    <div class="card-body text-center text-success">
                        <i class="fas fa-user-md-3x"></i><br>
                        <p class="fs-4 text-center">
                            <i class="fa-solid fa-user-doctor"></i>
                            Doctor <br>5
                        </p>
                    </div>
                </div>
            </div>
            
            <div class="col-md-4">
                <div class="card paint-card">
                    <div class="card-body tect-center tect-success">
                        <i class="fas fa-user-md-3x"></i><br>
                        <p class="fs-4 text-center">
                          <i class="fa-regular fa-users-medical"></i>
                            Paitents <br>440
                        </p>
                    </div>
                </div>
            </div>
            
            <div class="col-md-4">
                <div class="card paint-card">
                    <div class="card-body tect-center tect-success">
                        <i class="fas fa-user-md-3x"></i><br>
                        <p class="fs-4 text-center">
                            <i class="fa-solid fa-calendar-check"></i>
                            Total Appointment <br>445
                        </p>
                    </div>
                </div>
            </div>
            
            <div class="col-md-4">
                <div class="card paint-card">
                    <div class="card-body tect-center tect-success">
                        <i class="fas fa-user-md-3x"></i><br>
                        <p class="fs-4 text-center">
                            <i class="fa-solid fa-user-doctor"></i>
                             Laboratory <br>445
                        </p>
                    </div>
                </div>
            </div>
            
            <div class="col-md-4">
                <div class="card paint-card" data-bs-toogle="modal" data-bs-target="#exampleModel">
                    <div class="card-body tect-center tect-success">
                        <i class="fas fa-user-md-3x"></i><br>
                        <p class="fs-4 text-center">
                            <i class="fa-solid fa-user-doctor"></i>
                            Specialist <br>4
                        </p>
                    </div>
                </div>
            </div>
            
        </div>
        </div>
        
    </body>
</html>
