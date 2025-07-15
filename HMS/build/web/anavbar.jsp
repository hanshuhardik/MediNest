<%-- 
    Document   : navbar
    Created on : Feb 21, 2023, 5:29:32 PM
    Author     : HARDIK
--%>

<nav class="navbar navbar-expand-lg navbar-dark bg-success">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp"> <i class="fa-solid fa-hospital"></i> MAX CARE</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp"> <i class="fa-solid fa-hospital-user"></i> HOME</a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="doctor_login.jsp"> <i class="fa-solid fa-user-doctor"></i> DOCTOR</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="lab_login.jsp"> <i class="fa-solid fa-user-doctor"></i> Lab</a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="user_login.jsp"> <i class="fa-regular fa-users-medical"></i>PATIENTS</a>
        </li>
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="admin_login.jsp"> <i class="fa-regular fa-users-medical"></i><input type="button" value="logout"></a>
        </li>
        
        
        
      </ul>
      
    </div>
  </div>
</nav>