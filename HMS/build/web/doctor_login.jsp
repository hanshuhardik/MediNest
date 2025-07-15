<%-- 
    Document   : doctor
    Created on : Feb 21, 2023, 5:13:13 PM
    Author     : HARDIK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor login Page</title>
        <%@include file="allcss.jsp" %>
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
                            <p class="fs-4 text-center">Doctor Login</p>
<!--                            <c:if test="${not empty errorMsg}">
                                <p class="fs-4 text-center text-danger">${errorMsg}</p>
                                <c:remove var="errorMsg" scope="session" />
                                </c:if>
                                <c:if>
                                    <c:if test="${not empty succMsg}">
                                        <p class="fs-4 text-center text-success">${succMsg}</p>
                                        <c:remove var="succMsg" scope="session" />
                                        
                                </c:if>-->
                                        <form acton="doclogin" method="post">
                                            <div class="mb-3">
                                                <label class="form-label">Email address</label><input required name="email" type="email" class="form-control">
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Password</label><input required name="Password" type="Password" class="form-control">
                                            </div>
                                            <button type="submit" class="btn bg-success text-white col-md-12">Login</button>
                                        </form>  
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
