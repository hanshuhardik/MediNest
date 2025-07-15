<%-- 
    Document   : index
    Created on : Feb 21, 2023, 5:03:59 PM
    Author     : HARDIK
--%>

<%@page import="com.db.DbConnect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="allcss.jsp"%>
        
        

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
   
        
        <style type="text/css">
            .paint-card{
                box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
            }
        </style>
         </head>
    <body>
        <%@include file="navbar.jsp" %>
        <% Connection conn=DbConnect.getconn();
       out.print(conn);
        %>
        
        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img\Medical-Research-845x413.png" class="d-block w-100" alt="..." height="500px">
      <div class="carousel-caption d-none d-md-block">
        <h5>First slide label</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item">
        <img src="img\best-healthcare-website-design-feature-image.jpg" class="d-block w-100" alt="..." height="500px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Second slide label</h5>
        <p>Some representative placeholder content for the second slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img\hos3.jpg" class="d-block w-100" alt="..." height="500px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Third slide label</h5>
        <p>Some representative placeholder content for the third slide.</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
        
<div class="container p-3">
    <h1 class="text-center fs-2">Key Features of MAXCARE</h1>
    
    <div class="row">
        <div class="col-md-8 p-5">
            <div class="row">
                <div class="col-md-6">
                    <div class="card paint-card">
                        <div class="card-body">
                            <p class="fs-5">99.99% Safety</p>
                            <p>about safety purpose</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card paint-card">
                    <div class="card-body">
                            <p class="fs-5">Clean Environment</p>
                            <p>about clean environment</p>
                        </div>
                    </div>
                </div>    
                <div class="col-md-6 mt-2">
                    <div class="card paint-card">
                    <div class="card-body">
                            <p class="fs-5">Friendly Doctors</p>
                            <p>about doctors</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 mt-2">
                    <div class="card paint-card">
                    <div class="card-body">
                            <p class="fs-5">Laboratories</p>
                            <p>about laboratories</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <img class="paint-card" alt="" src="img\doctor.png">
        </div>
    </div>
    
       <hr width="100%">
        <div class="container p-2">
             <h1 class="text-center fs-2">Our Team</h1>
            
            <div class="row">
                <div class="col-md-3">
                    <div class="card paint-card">
                        <div class="card-body text-center">
                            <img alt="" src="img\doc4.webp" width="230px" height="300px">
                            <p class="fw-bold fs-5">DR. Sinha</p>
                            <p class="fs-7">(CEO & Chairman)</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card paint-card">
                        <div class="card-body text-center">
                            <img alt="" src="img\doc2.png" width="230px" height="300px">
                            <p class="fw-bold fs-5">DR. Srivastav</p>
                            <p class="fs-7">(Cheif Doctor)</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card paint-card">
                        <div class="card-body text-center">
                            <img alt="" src="img\doc5.webp" width="230px" height="300px">
                            <p class="fw-bold fs-5">DR.Amelia</p>
                            <p class="fs-7">(Cheif Docotr)</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card paint-card">
                        <div class="card-body text-center">
                            <img alt="" src="img\doc3.png" width="230px" height="300px">
                            <p class="fw-bold fs-5">DR. Verma</p>
                            <p class="fs-7">(Cheif Doctor)</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
