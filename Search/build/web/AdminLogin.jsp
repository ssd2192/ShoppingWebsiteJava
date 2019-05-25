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
        <title>Admin Login</title>
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
            <a href="index.jsp" title="Online Shopping" style="text-decoration: none; color:darkslategray"> picSHOP</a>
            </b></font>
            </td>
           </tr></table>
            </center>
        </div>
        
        <div>
        <table border="0" cellpadding="5" width="100%">
            <tr> 
            <td align="center" style="background-color:steelblue"><font face="Agency FB" size="6"> <!-- <a href="login.jsp" style="color: white " > User Login</a> --></font></td>
            <td align="center" style="background-color:cadetblue ;color: white"><font face="Agency FB" size="6"> Admin Login </font></td>
            </tr>
        </table>
        </div>
        <s:actionerror/>
        <div align="center" style="background-color:cadetblue ">
            <s:form action="adminlogin" >
            <s:label value="Username" cssStyle="font-size:15pt; color:white;"/>
            <s:textfield name="id" cssStyle="width:400pt; height:30pt; font-size:15pt" />
            <s:label value="Password" cssStyle="font-size:15pt; color:white"/>
            <s:password name="pas" cssStyle="width:400pt; height:30pt; font-size:15pt"/>
            <s:submit value="Login" cssStyle="height:30pt; width:200pt; font-size:15pt"/>
            </s:form> 
            <br/><br/>
            
        </div>
        
        <!-- END NEVIGATION -->
    </td></tr></table>
</td></tr></table></body>
</html>
