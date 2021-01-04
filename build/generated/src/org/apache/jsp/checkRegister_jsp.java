package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class checkRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    if(request.getParameter("name")==null || request.getParameter("profileFor")==null || request.getParameter("gender")==null || request.getParameter("religion")==null || request.getParameter("dob")==null || request.getParameter("mobileNumber")==null || request.getParameter("email")==null || request.getParameter("password")==null ){
        response.sendRedirect("index.jsp?err==reg");
    } 
    
    //store  date in corresponding variables 
    else{
        out.print(request.getParameter("mobileNumber"));
        String profileFor= request.getParameter("profileFor");
        String name= request.getParameter("name"); 
        String gender= request.getParameter("gender"); 
        String religion= request.getParameter("religion");
        String dob= request.getParameter("dob");
        String mobileNumber = request.getParameter("mobileNumber");
        String email= request.getParameter("email");
        String password= request.getParameter("password");
        
        //date stored in variable
        //--------------------------------------------------------------------------
        
        //establish connection between site and database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/vivah","root","");
            Statement stmt= cn.createStatement(); 
            ResultSet rs=stmt.executeQuery("select * from userInfo where email ='"+email+"'");
            if(rs.next()){
                //check if email id is already registered or not if yes then send user to login page
                response.sendRedirect("index.jsp?err=exist");
            }
            else{
                String contain="QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
                Random rnd=new Random();
                StringBuilder sb =new StringBuilder(8);
                for(int i=0; i<8; i++){
                    sb.append(contain.charAt(rnd.nextInt(contain.length())));
                }
                String profileId=sb.toString();
                out.println(profileId);
                
                //if email id is not exist in database then register
                //---------------------------------------------------------
                
//                PreparedStatement st = cn.prepareStatement("insert into userInfo values(?,?,?,?,?,?,?,?)");
//                st.setString(1,profileFor);
//                st.setString(2,name);
//                st.setString(3,gender);
//                st.setString(4,religion);
//                st.setString(5,dob);
//                st.setString(6,mobileNumber);
//                st.setString(7,email);
//                st.setString(8,password);
//                st.execute();
//                
//                response.sendRedirect("fullRegister.jsp");
                
            }
            
            
        }
        catch(Exception e){
            out.println(e.getMessage());
        }
    }

      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        ");
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
