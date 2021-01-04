<%-- 
    Document   : admin
    Created on : 17 Nov, 2020, 8:10:24 PM
    Author     : tarun
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>



<html>
    <head>
        <link href="css/admin.css" rel="stylesheet" type="text/css"  />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="adminBox" style="padding-top: 6vh;">
            <label >ADMIN LOGIN</label><br><br>
        <form action='checkAdmin.jsp' method='post'>
            <table>
                <tr>
                    <td>
                        <label>ID</label>
                        
                    </td>
                    <td>
                        <input class="adminBar" type="text" name='adminId'  required="" placeholder='admin@xyz'>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Password</label>
                    </td>
                    <td>
                        <input class="adminBar" type='password' name='adminPassword' placeholder="********">
                    </td>
                </tr>
            </table>
            <input  type='submit' value='login'>
            
<!--            <label>ID</label>
             
            <input class="adminBar" type='text' name='adminId' placeholder='admin@xyz'><br>
            <label>Password</label>
            <input class="adminBar" type='password' name='adminPassword' placeholder="********"><br>
            <input  type='submit' value='login'>-->
        </form>
        </div>
    </body>
</html>
