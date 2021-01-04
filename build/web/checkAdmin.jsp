<%-- 
    Document   : checkAdmin
    Created on : 27 Nov, 2020, 9:56:49 PM
    Author     : tarun
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%
    if(request.getParameter("adminPassword")==null || request.getParameter("adminId")==null){
      response.sendRedirect("admin.jsp?err=1");  
    
    }
    else{
        String id=request.getParameter("adminId");
        String password=request.getParameter("adminPassword");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/vivah","root","");
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery("select * from admin where adminId='"+id+"'");
            
            if(rs.next()){
                if(rs.getString("adminPassword").equals(password)){
                    Cookie ct=new Cookie("admin",id);
                    ct.setMaxAge(3600);
                    response.addCookie(ct);
                    session.setAttribute(id,password);
                    session.setMaxInactiveInterval(10);
                   // response.sendRedirect(location);
                    out.println("success");
                }
                else{
                    out.print("password does not match");
                    
                }
            }
        }
            catch(Exception e){
                out.println(e.getMessage());
            }
            
            
            
        }
%>
    
    
    