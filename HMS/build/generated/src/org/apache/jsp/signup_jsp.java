package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/allcss.jsp");
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin login page</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("   ");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .paint-card{\n");
      out.write("                box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);\n");
      out.write("            }\n");
      out.write("            .bor{\n");
      out.write("                border:1px solid lightgrey;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding-bottom: 5px;\n");
      out.write("                padding:5px 5px 5px 10px;\n");
      out.write("                margin-top: 5px;\n");
      out.write("                display:flex;\n");
      out.write("            }\n");
      out.write("            .space{\n");
      out.write("                align-self: centre;\n");
      out.write("                padding: 0px 10px 0px 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-success\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"> <i class=\"fa-solid fa-hospital\"></i> MAX CARE</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"admin_login.jsp\"> <i class=\"fa-solid fa-hospital-user\"></i> ADMIN</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"doctor_login.jsp\"> <i class=\"fa-solid fa-user-doctor\"></i> DOCTOR</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"lab_login.jsp\"> <i class=\"fa-solid fa-user-doctor\"></i> Lab</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"\"> <i class=\"fa-solid fa-calendar-check\"></i> APPOINTMENT</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"user_login.jsp\"> <i class=\"fa-regular fa-users-medical\"></i>PATIENTS</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("<!--        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Dropdown\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <div class=\"container p-5\">\n");
      out.write("            <div classs=\"row\">\n");
      out.write("                <div class=\"col-md-4 offset-md-4\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <p class=\"fs-4 text-center\">Patient Register</p>\n");
      out.write("                         \n");
      out.write("                                        <form method=\"post\">\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label class=\"form-label\">Name</label><input required name=\"fullname\" type=\"text\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label class=\"form-label\">Patientid</label><input placeholder=\"1st three letter with last 2 digit of year\"required name=\"patientid\" type=\"text\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label class=\"form-label\">Password</label><input required name=\"password\" type=\"Password\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label class=\"form-label\">Phone Number</label><input required name=\"phoneno\" type=\"text\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                            <label>Gender</label><br>\n");
      out.write("                                            <div class=\"bor\">\n");
      out.write("                                                <div class=\"space\">   <input type=\"radio\" name=\"gender\" value=\"male\"/> Male</div>\n");
      out.write("                                                    <div class=\"space\">  <input type=\"radio\" name=\"gender\" value=\"female\"/> Female</div>\n");
      out.write("                                                        <div class=\"space\">  <input type=\"radio\" name=\"gender\" value=\"other\"/> Other</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                               \n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label class=\"form-label\">DOB</label><input required name=\"dob\" type=\"date\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label class=\"form-label\">Precription</label><input name=\"precpt\" type=\"text\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                      \n");
      out.write("                                            \n");
      out.write("                                            <button type=\"submit\" class=\"btn bg-success text-white col-md-12\">Register</button><br>\n");
      out.write("                                            got registered?<a href=\"user_login.jsp\" class=\"text-decoration-none\">Login..</a>\n");
      out.write("                                        </form>  \n");
      out.write("                             ");

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

        
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                                        \n");
      out.write("                        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
