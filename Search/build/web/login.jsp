<%-- 
    Document   : index
    Created on : Aug 20, 2013, 5:32:05 PM
    Author     : Dhillon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
 <table align="center" width="100%"><tr><td align="center"> 
             
        <table border="0" width="80%"><tr><td> 
        <!-- NEVIGATION -->            
        <div>
            <center>
            <table cellpadding="-10" width="100%" border="0"> <tr> 
            <td style="background-color: white" width="50%">
            <font size="7" face="Agency FB" ><b>
            <a href="index.jsp" title="Online Shopping" style="text-decoration: none; color:darkslategray"> picWATCH</a>
            </b></font>
            </td>
           </tr></table>
            </center>
        </div>
        
        <div>
        <table border="0" cellpadding="5" width="100%">
            <tr> 
            <td align="center" style="background-color:steelblue ;color: white"><font face="Agency FB"size="6"> User Login </font></td>
            <td align="center" style="background-color:cadetblue"><font face="Agency FB" size="6">  <a href="AdminLogin.jsp" style="color: white " > Admin Login</a> </font></td>
            </tr>
        </table>
        </div>
         <s:actionerror/>
        <div align="center" style="background-color:steelblue ">
            
            <s:form action="ulogin" method="post">
            <s:label value="Username" cssStyle="font-size:15pt; color:white;"/>
            <s:textfield name="id" cssStyle="width:400pt; height:30pt; font-size:15pt" />
            <s:label value="Password" cssStyle="font-size:15pt; color:white"/>
            <s:password name="pas" cssStyle="width:400pt; height:30pt; font-size:15pt"/>
            <s:submit value="Login" cssStyle="height:30pt; width:200pt; font-size:15pt"/>
            </s:form> 
            <br/>
        <center>
            <font color="white"> New User? Click </font> <a href="register.jsp" style="color: seashell">here</a><font color="white"> to Register.</font></center>
        
        </div>
        <!-- END NEVIGATION -->
    </td></tr></table>
</td></tr></table></body>
</html>
