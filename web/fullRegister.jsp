<%-- 
    Document   : fullRegister.jsp
    Created on : 14 Dec, 2020, 9:43:34 PM
    Author     : tarun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<html>
    <head >
        <link href="css/admin.css" rel="stylesheet" type="text/css"  />
        
        
    </head>
    <body>
        
        <div >    
        <div class="registerBox" style="position: static; padding-top: 10vh;  " >
            
            
            <label>Complete Profile</label><br><br>
            <form  action="checkFullRegister.jsp" method="post">
                
                    <label style="color:orange;text-align: center ">Family Details:</label><br><br>
                    
                
                    
                    
                        
                            <label>Father Name:</label>
                        
                    
                        
                            <input type="text" name="fatherName" placeholder="FATHER NAME"> <br>
                            
                            <label>Father Occupation:</label>
                        
                        
                            <input type="text" name="fatherOccupation" ><br>
                        
                            
                    
                        
                            <label>Mother Name:</label>
                        
                   
                        
                            <input type="text"  name="motherName" placeholder="MOTHER NAME"><br>
                        
                            <label>Mother Occupation:</label>
                        
                        
                            <input type="text" name="motherOccupation" ><br>
                    
                        
                            <label>Sister:</label>
                        
                        
                            <select name="sister">
                                <option value="No">0</option>
                                <option value="One" >1</option>
                                <option value="Two">2</option>
                                <option value="Three">3</option>
                            </select><br>
                            
                        
                    
                    
                        
                            <label>Brother:</label>
                        
                        
                            <select name="brother">
                                <option value="No">0</option>
                                <option value="One">1</option>
                                <option value="Two">2</option>
                                <option value="Three">3</option>
                            </select><br>
                            
                            
                            <label>Cast:</label>
                        
                    
                        
                            <input type="text" name="cast" placeholder="cast"> <br>
                            
                            
                            <label>Mother Tongue:</label>
                        
                    
                        
                            <input type="text" name="motherTongue" placeholder="MOTHER TONGUE"> <br>
                    
                            
                            
                        
                            <label>Family Type:</label>
                        
                        
                            <select name="familyType" >
                                <option value="Joint">Joint Family</option>
                                <option value="Single-Parent">Single-Parent Family</option>
                                <option value="Nuclear">Nuclear Family</option>
                            </select><br>
                        
                    
                    
                        
                            <label>Family Values:</label>
                        
                        
                            <select name="familyValues">
                                <option value="Moderate">Moderate</option>
                                <option value="Liberal">Liberal</option>
                                <option value="Traditional">Traditional</option>
                            </select><br>
                        
                    
                    <label style="color:orange; margin-top:4vh;">Address:</label><br><br>
                    
                            <label>House,Building No:</label>
                        
                    
                        
                            <input type="text" name="houseNumber" placeholder=""> <br>
                            
                            <label>Colony, Area:</label>
                        
                    
                        
                            <input type="text" name="colony" required="required"> <br>
                            
                             <label>City:</label>
                        
                    
                        
                            <input type="text" name="city" required="required"> <br>
                            
                            
                            
                            <label>Pin Code:</label>
                        
                    
                        
                            <input type="text" name="pinCode" required="required"><br>
                            
                            <label>State:</label>
                        
                    
                        
                            <input type="text" name="state" required="required" placeholder="STATE"> <br>
                            
                            
                            <label>Country:</label>
                        
                    
                        
                            <input type="text" name="country" placeholder="COUNTRY"> <br>
                            
                    <label style="color:orange; margin-top:4vh;">Education Details:</label><br><br>
                
                    
                        
                            <label>Highest Education:</label>
                        
                        
                            <input type="text" name="highestEducation" placeholder="highest qualified degree"><br>
                        
                    
                    
                        
                            <label>PG Degree:</label>
                        
                        
                            <select name="pgDegree">
                                <option value="0">None</option>
                                <option value="MBA">MBA</option>
                                <option value="M.Tech">M.Tech</option>
                                <option value="MD">MD</option>
                                <option value="M.sc">M.sc</option>
                                <option value="MA">MA</option>
                                <option value="L.L.M.">L.L.M.</option>
                                <option value="M.com">M.com</option>
                           </select><br>
                        
                    
                    
                        
                            <label>UG Degree:</label>
                        
                        
                            <select name="ugDegree">
                                <option value="0">None</option>
                                <option value="BA">BA</option>
                                <option value="B.Tech">B.Tech</option>
                                <option value="MBBS">MBBS</option>
                                <option value="B.sc">B.sc</option>
                                <option value="B.com">B.com</option>
                                <option vlaue="L.L.B.">L.L.B.</option>
                            </select><br>
                        
                    
                    
                        
                            <label>School:</label>
                        
                        
                            <input type="text" name="schoolName" placeholder="school name" required=""><br>
                        
                    
                    
                        
                            <label>College:</label>
                        
                        
                            <input type="text" name="collegeName" placeholder="College name" ><br>
                        
                    
                    
                        
                            <label>Occupation:</label>
                        
                        
                            <input type="text" name="occupation" ><br>
                        
                    
                
                    <label style="color: orange; margin-top: 4vh;" >Life Style:</label><br><br>
                
                    
                        
                            <label>Income:</label>
                        
                        
                            <select name="income">
                                <option value="not specified">Not specified</option>
                                <option value="less then 1lkh">Less then 100000</option>
                                <option value="100000 to 300000 ">100000 to 300000</option>
                                <option value="300000 to 500000">300000 to 500000</option>
                                <option value="more then 5Lkh">more then 500000</option>
                            </select><br>
                        
                    
                    
                        
                            <label>Family Income:</label>
                        
                        
                            <select name="familyIncome">
                                <option value="not specified">Not specified</option>
                                <option value="less then 1lkh">Less then 200000</option>
                                <option value="200000 to 500000 ">100000 to 500000</option>
                                <option value="500000 to 1500000">500000 to 1500000</option>
                                <option value="more then 15Lkh">more then 1500000</option>
                            </select><br>
                            
                            <label>About Me:</label>
                        
                    
                        
                            <input type="textArea" name="aboutMe" placeholder="TELL SOMETHING ABOUT YOU..... "> <br>
                    
                    
                    
                
            </form>
            </div>
        </div>
    </body>
    
</html>
