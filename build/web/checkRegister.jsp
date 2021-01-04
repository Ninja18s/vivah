<%-- 
    Document   : checkRegister
    Created on : 27 Nov, 2020, 11:36:29 PM
    Author     : tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%
    if(request.getParameter("name")==null || request.getParameter("profileFor")==null || request.getParameter("gender")==null || request.getParameter("religion")==null || request.getParameter("dob")==null || request.getParameter("mobileNumber")==null || request.getParameter("email")==null || request.getParameter("password")==null ){
        response.sendRedirect("index.jsp?err==reg");
    } 
    
    //store  date in corresponding variables 
    else{
        
        String profileFor= request.getParameter("profileFor");
        String name= request.getParameter("name"); 
        String gender= request.getParameter("gender"); 
        String religion= request.getParameter("religion");
        String dob= request.getParameter("dob");
        String mobileNumber = request.getParameter("mobileNumber");
        String email= request.getParameter("email");
        String password= request.getParameter("password");
        String profileId="";
        
        //date stored in variable
        String contain="QWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        Random rnd=new Random();
        StringBuilder sb =new StringBuilder(8);
        for(int i=0; i<8; i++){
        sb.append(contain.charAt(rnd.nextInt(contain.length())));
        }
        profileId=sb.toString();
        //--------------------------------------------------------------------------
        
        //establish connection between site and database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/vivah","root","");
            Statement stmt= cn.createStatement(); 
            ResultSet rs=stmt.executeQuery("select * from userInfo where email ='"+email+"' OR profileId='"+profileId+"' OR mobileNumber='"+mobileNumber+"'");
            if(rs.next()){
                //check if email id is already registered or not if yes then send user to login page
                response.sendRedirect("index.jsp?err=exist");
            }
            else{
                
                
                
                //if email id is not exist in database then register
                //---------------------------------------------------------
                
                PreparedStatement st = cn.prepareStatement("insert into userInfo values(?,?,?,?,?,?,?,?,?)");
                st.setString(1,profileId);
                st.setString(2,profileFor);
                st.setString(3,name);
                st.setString(4,gender);
                st.setString(5,religion);
                st.setString(6,dob);
                st.setString(7,mobileNumber);
                st.setString(8,email);
                st.setString(9,password);
                st.execute();
                
                response.sendRedirect("fullRegister.jsp");
                
            }
            
            
        }
        catch(Exception e){
            out.println(e.getMessage());
        }
    }
%>
        
    
    
    
        