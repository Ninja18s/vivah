package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class fullRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("    <head >\n");
      out.write("        <link href=\"css/admin.css\" rel=\"stylesheet\" type=\"text/css\"  />\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div >    \n");
      out.write("        <div class=\"registerBox\" style=\"position: static; padding-top: 10vh;  \" >\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <label>Complete Profile</label><br><br>\n");
      out.write("            <form  action=\"checkFullRegister.jsp\" method=\"post\">\n");
      out.write("                \n");
      out.write("                    <label style=\"color:orange;text-align: center \">Family Details:</label><br><br>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Father Name:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"fatherName\" placeholder=\"FATHER NAME\"> <br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Mother Name:</label>\n");
      out.write("                        \n");
      out.write("                   \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\"  name=\"motherName\" placeholder=\"MOTHER NAME\"><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Sister:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"sister\">\n");
      out.write("                                <option value=\"No\">0</option>\n");
      out.write("                                <option value=\"One\" >1</option>\n");
      out.write("                                <option value=\"Two\">2</option>\n");
      out.write("                                <option value=\"Three\">3</option>\n");
      out.write("                            </select><br>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Brother:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"brother\">\n");
      out.write("                                <option value=\"No\">0</option>\n");
      out.write("                                <option value=\"One\">1</option>\n");
      out.write("                                <option value=\"Two\">2</option>\n");
      out.write("                                <option value=\"Three\">3</option>\n");
      out.write("                            </select><br>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <label>Cast:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"cast\" placeholder=\"cast\"> <br>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <label>Mother Tongue:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"motherTongue\" placeholder=\"MOTHER TONGUE\"> <br>\n");
      out.write("                    \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                            <label>Family Type:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"familyType\" >\n");
      out.write("                                <option value=\"Joint\">Joint Family</option>\n");
      out.write("                                <option value=\"Single-Parent\">Single-Parent Family</option>\n");
      out.write("                                <option value=\"Nuclear\">Nuclear Family</option>\n");
      out.write("                            </select><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Family Values:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"familyValues\">\n");
      out.write("                                <option value=\"Moderate\">Moderate</option>\n");
      out.write("                                <option value=\"Liberal\">Liberal</option>\n");
      out.write("                                <option value=\"Traditional\">Traditional</option>\n");
      out.write("                            </select><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    <label style=\"color:orange; margin-top:4vh;\">Address:</label><br><br>\n");
      out.write("                    \n");
      out.write("                            <label>House,Building No:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"houseNumber\" placeholder=\"\"> <br>\n");
      out.write("                            \n");
      out.write("                            <label>Colony, Area:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"colony\" required=\"required\"> <br>\n");
      out.write("                            \n");
      out.write("                            <label>Pin Code:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"pinCode\" required=\"required\"><br>\n");
      out.write("                            \n");
      out.write("                            <label>State:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"state\" required=\"required\" placeholder=\"STATE\"> <br>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <label>Country:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"country\" placeholder=\"COUNTRY\"> <br>\n");
      out.write("                            \n");
      out.write("                    <label style=\"color:orange; margin-top:4vh;\">Education Details:</label><br><br>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Highest Education:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"highestEducation\" placeholder=\"highest qualified degree\"><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>PG Degree:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"pgDegree\">\n");
      out.write("                                <option value=\"0\">None</option>\n");
      out.write("                                <option value=\"MBA\">MBA</option>\n");
      out.write("                                <option value=\"M.Tech\">M.Tech</option>\n");
      out.write("                                <option value=\"MD\">MD</option>\n");
      out.write("                                <option value=\"M.sc\">M.sc</option>\n");
      out.write("                                <option value=\"MA\">MA</option>\n");
      out.write("                                <option value=\"L.L.M.\">L.L.M.</option>\n");
      out.write("                                <option value=\"M.com\">M.com</option>\n");
      out.write("                           </select><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>UG Degree:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"ugDegree\">\n");
      out.write("                                <option value=\"0\">None</option>\n");
      out.write("                                <option value=\"BA\">BA</option>\n");
      out.write("                                <option value=\"B.Tech\">B.Tech</option>\n");
      out.write("                                <option value=\"MBBS\">MBBS</option>\n");
      out.write("                                <option value=\"B.sc\">B.sc</option>\n");
      out.write("                                <option value=\"B.com\">B.com</option>\n");
      out.write("                                <option vlaue=\"L.L.B.\">L.L.B.</option>\n");
      out.write("                            </select><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>School:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"schoolName\" placeholder=\"school name\" required=\"\"><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>College:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"collegeName\" placeholder=\"College name\" ><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Occupation:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <input type=\"text\" name=\"occupation\" ><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    <label style=\"color: orange; margin-top: 4vh;\" >Life Style:</label><br><br>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Income:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"income\">\n");
      out.write("                                <option value=\"not specified\">Not specified</option>\n");
      out.write("                                <option value=\"less then 1lkh\">Less then 100000</option>\n");
      out.write("                                <option value=\"100000 to 300000 \">100000 to 300000</option>\n");
      out.write("                                <option value=\"300000 to 500000\">300000 to 500000</option>\n");
      out.write("                                <option value=\"more then 5Lkh\">more then 500000</option>\n");
      out.write("                            </select><br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <label>Family Income:</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <select name=\"familyIncome\">\n");
      out.write("                                <option value=\"not specified\">Not specified</option>\n");
      out.write("                                <option value=\"less then 1lkh\">Less then 200000</option>\n");
      out.write("                                <option value=\"200000 to 500000 \">100000 to 500000</option>\n");
      out.write("                                <option value=\"500000 to 1500000\">500000 to 1500000</option>\n");
      out.write("                                <option value=\"more then 15Lkh\">more then 1500000</option>\n");
      out.write("                            </select><br>\n");
      out.write("                            \n");
      out.write("                            <label>About Me:</label>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <input type=\"textArea\" name=\"aboutMe\" placeholder=\"TELL SOMETHING ABOUT YOU..... \"> <br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
