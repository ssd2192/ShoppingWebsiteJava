<%-- 
    Document   : HomeAdmin
    Created on : Nov 21, 2013, 5:53:15 PM
    Author     : Dhillon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator</title>
        
        <style type="text/css">
            .sh
            {
                max-width: 100%;
                 width: 1000px;
               margin-left: auto;
                margin-right: auto;
              
            }
           #head
           {
               margin-left: 290px;
               margin-top:  280px;
               background-color: transparent;
               width: 450px;
           }
           #errors
           {
               background-color: transparent;
               width: 160px;
               color: black;
               margin-top: 115px;
               margin-left: 105px;
               float: left;
               font-size: 18pt;
               font-family: Agency FB;
           }
           #line
           {
               margin-right:300px;
               float: right;
               background-color: transparent;
               color: white ;
               font-family: Agency FB;
               font-size: 20pt;
               font-weight: bold;
           }
           #footer
           {
               margin-top: 285px;
               background-color: black;
               height: 60px;
               color: white;
               opacity: 0.7;
               
           }
           
        </style>
    </head>
    <body style="background:url(img/homeadminback.jpg) center top  black; background-repeat: no-repeat;">
       
        <div class="sh">
            
            <div id="line" align="right">
                 ADMIN LOGIN<br/>
                <canvas id="myCanvas" width="225" height="0"
                       style="border:2px solid #E8E8E8;">
               </canvas>
            </div>
            
            <div id="errors">
                 <s:actionerror/>
            </div>
            
            <div id="head">
               
               <s:form action="adminlogin">
                <s:label value="USERNAME" cssStyle="font-size:17pt; color:white;font-family: Agency FB"/>
                <s:textfield name="id" cssStyle="color:white; background: transparent; width:300pt; height:30pt; font-size:15pt;"/>
                <s:label value="PASSWORD" cssStyle="font-size:17pt; color:white;font-family: Agency FB"/>
                <s:password name="pas" cssStyle="color:white; background: transparent; width:300pt; height:30pt; font-size:15pt;"/>
                <s:submit type="image" src="img/lo.svg" cssStyle="height:40pt"/>
               </s:form>
           </div> 
         </div>
            <div id="footer">
                <center><br/>  &copy; 2013 picSHOP | <a href="home.jsp" style="text-decoration: none; color: white"/>picSHOP.com</center>
            </div> 
    </body>
</html>
