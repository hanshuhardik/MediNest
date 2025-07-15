package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.db.DbConnect;
import java.sql.Connection;

public final class user_005fdash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/allcss.jsp");
    _jspx_dependants.add("/unavbar.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("   ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>user_dash</title>\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String n=request.getParameter("name");
        
      out.write("\n");
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
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\"> <i class=\"fa-solid fa-hospital-user\"></i> Appointment</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"doctor_login.jsp\"> <i class=\"fa-solid fa-user-doctor\"></i> View Appointment</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"lab_login.jsp\"> <i class=\"fa-solid fa-user-doctor\"></i> Lab</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"user_login.jsp\"> <i class=\"fa-regular fa-users-medical\"></i><input type=\"button\" value=\"logout\"></a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        ");
 Connection conn=DbConnect.getconn();
        //out.print(conn);
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"img\\Medical-Research-845x413.png\" class=\"d-block w-100\" alt=\"...\" height=\"500px\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>First slide label</h5>\n");
      out.write("        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("        <img src=\"img\\best-healthcare-website-design-feature-image.jpg\" class=\"d-block w-100\" alt=\"...\" height=\"500px\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>Second slide label</h5>\n");
      out.write("        <p>Some representative placeholder content for the second slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"img\\hos3.jpg\" class=\"d-block w-100\" alt=\"...\" height=\"500px\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>Third slide label</h5>\n");
      out.write("        <p>Some representative placeholder content for the third slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("<div class=\"container p-3\">\n");
      out.write("    <h1 class=\"text-center fs-2\">Key Features of MAXCARE</h1>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8 p-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <p class=\"fs-5\">99.99% Safety</p>\n");
      out.write("                            <p>about safety purpose</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                            <p class=\"fs-5\">Clean Environment</p>\n");
      out.write("                            <p>about clean environment</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"col-md-6 mt-2\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                            <p class=\"fs-5\">Friendly Doctors</p>\n");
      out.write("                            <p>about doctors</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 mt-2\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                            <p class=\"fs-5\">Laboratories</p>\n");
      out.write("                            <p>about laboratories</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <img class=\"paint-card\" alt=\"\" src=\"img\\doctor.png\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("       <hr width=\"100%\">\n");
      out.write("        <div class=\"container p-2\">\n");
      out.write("             <h1 class=\"text-center fs-2\">Our Team</h1>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"img\\doc4.webp\" width=\"230px\" height=\"300px\">\n");
      out.write("                            <p class=\"fw-bold fs-5\">DR. Sinha</p>\n");
      out.write("                            <p class=\"fs-7\">(CEO & Chairman)</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"img\\doc2.png\" width=\"230px\" height=\"300px\">\n");
      out.write("                            <p class=\"fw-bold fs-5\">DR. Srivastav</p>\n");
      out.write("                            <p class=\"fs-7\">(Cheif Doctor)</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"img\\doc5.webp\" width=\"230px\" height=\"300px\">\n");
      out.write("                            <p class=\"fw-bold fs-5\">DR.Amelia</p>\n");
      out.write("                            <p class=\"fs-7\">(Cheif Docotr)</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card paint-card\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"img\\doc3.png\" width=\"230px\" height=\"300px\">\n");
      out.write("                            <p class=\"fw-bold fs-5\">DR. Verma</p>\n");
      out.write("                            <p class=\"fs-7\">(Cheif Doctor)</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid p-1 bg-success text-center text-white\"\n");
      out.write("     <p>@copyright hospital.com</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
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
