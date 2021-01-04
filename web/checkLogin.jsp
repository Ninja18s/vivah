<%-- 
    Document   : checkLogin
    Created on : 27 Nov, 2020, 11:39:41 PM
    Author     : tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%
    if(request.getParameter("email")==null || request.getParameter("userPassword")==null ){
        response.sendRedirect("index.jsp?err=1");
    }
    else{
        String email=request.getParameter("email");
        String userPassword= request.getParameter("userPassword");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vivah","root","");
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery("select * from user where email ='"+email+"'");
            if(rs.next()){
               if(rs.getString("userPassword").equals(userPassword)){
                   Cookie c = new Cookie("user",email);
                   c.setMaxAge(3600);
                   response.addCookie(c);
                   session.setAttribute(email,userPassword);
                   session.setMaxInactiveInterval(10);
                   response.sendRedirect("index.jsp?login=succ");
               }
               else{
                   response.sendRedirect("index.jsp?err=passwprd");
                  
            } 
            }
            else{
                response.sendRedirect("index.jsp?err=email");
            }
            
            cn.close();
            
        }
        catch(Exception e){
            out.println(e.getMessage());
        }
        
    }
    
%>
        