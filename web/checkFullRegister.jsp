<%-- 
    Document   : checkFullRegister
    Created on : 22 Dec, 2020, 9:39:22 PM
    Author     : tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%
    if( request.getParameter("fatherName")==null || request.getParameter("motherName")==null || request.getParameter("sister")==null || request.getParameter("fatherName")==null || request.getParameter("motherName")==null || request.getParameter("sister")==null || request.getParameter("brother")==null || request.getParameter("familyType")==null || request.getParameter("familyValues")==null || request.getParameter("highestEducation")==null || request.getParameter("pgDegree")==null || request.getParameter("ugDegree")==null || request.getParameter("schoolName")==null || request.getParameter("collegeName")==null || request.getParameter("occupation")==null || request.getParameter("income")==null || request.getParameter("familyIncome")==null ){
       response.sendRedirect("fullRegister.jsp?err=1");
    
    }
    else{
        String fatherName=request.getParameter("fatherName");
        String motherName=request.getParameter("motherName");
        String sister=request.getParameter("sister");
        String brother=request.getParameter("brother");
        String familyType=request.getParameter("familyType");
        String familyValues=request.getParameter("familyValues");
        String highestEducation=request.getParameter("highestEduacation");
        String pgDegree=request.getParameter("pgDegree");
        String ugDegree=request.getParameter("ugDegree");
        String schoolName=request.getParameter("schoolName");
        String collegeName=request.getParameter("collegeName");
        String occupation=request.getParameter("occupation");
        String income=request.getParameter("income");
        String familyIncome=request.getParameter("familyIncome");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/vivah","root","");
            Statement stmt= cn.createStatement();
            PreparedStatement st = cn.prepareStatement("update  userInfo values(?,?,?,?,?,?,?,?,?)");
            st.setString(1,fatherName);
            st.setString(2,motherName);
            st.setString(3,sister);
            st.setString(4,brother);
            st.setString(5,familyType);
            st.setString(6,familyValues);
            st.setString(7,highestEducation);
            st.setString(8,pgDegree);
            st.setString(9,ugDegree);
            st.setString(10,schoolName);
            st.setString(11,collegeName);
            st.setString(12,occupation);
            st.setString(13,income);
            st.setString(14,familyIncome);
            st.execute();
            cn.close();
            response.sendRedirect("profile.jsp");
                    }
        catch(Exception e){
            out.println(e.getMessage());
        }
    }
        

        
        
    
    

%>