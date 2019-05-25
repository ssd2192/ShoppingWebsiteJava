<%-- 
    Document   : index
    Created on : Aug 20, 2013, 5:32:05 PM
    Author     : Dhillon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%-- <jsp:include page="/checkLogin.jsp" /> --%>
           
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
    </head>
    <body>
        <table align="center" width="100%"><tr><td align="center">    
        
        <table border="0" width="90%"><tr><td> 
        <!-- NEVIGATION -->            
        <div>
            <center>
            <table cellpadding="-10" width="100%" border="0"> <tr> 
            <td style="background-color: white" width="80%">
            <font size="7" face="Agency FB" ><b>
            <a href="#" title="Online Shopping" style="text-decoration: none; color:darkslategray" onMouseOver="this.style.cursor='hand';"> picSHOP</a>
            </b></font>
            </td>
            <td align="right"> 
            <font size="5" face="Agency FB">
            <a href="LogoutAction" title="Logout" style="text-decoration: none; color: white"><img width="120" height="50" src="img/logoutb.png"/></a>
            </font>
            </td>
            </tr></table>
            </center>
        </div>
        <div style="background-color: cadetblue">
        <center><font size="6.5" face="Agency FB"><img height="30" src="img/admin.png"/>ADMINISTRATOR<img height="30" src="img/admin.png"/></font></center>        
        </div>
        <br/>
        <div>
        <table border="0" cellpadding="5" width="100%" bgcolor="black">
        <tr>
            <td align="center">  <font face="Agency FB" size="4">
                <a href="AddProduct.jsp" style="text-decoration: none; color: white"><b>Add New Product</b></a>    </font>
            </td>
            <td align="center">  <font face="Agency FB" size="4">
                <a href="ViewProductAdmin.jsp" style="text-decoration: none; color: white"><b>View Products List</b></a>   </font>
            </td>
            <td align="center">  <font face="Agency FB" size="4">
                <a href="EditProduct.jsp" style="text-decoration: none; color: white"><b>Edit Product</b></a>  </font>
            </td>
             <td align="center">  <font face="Agency FB" size="4">
                 <a href="DeleteProduct.jsp" style="text-decoration: none; color: white"><b>Delete Product</b></a>  </font>
            </td>
            <td align="center">  <font face="Agency FB"size="4">
                <a href="#" style="text-decoration: none; color: white"><b>Change Password</b></a>   </font>
            </td>
            <td align="center">  <font face="Agency FB"size="4">
                <a href="AddAdmin.jsp" style="text-decoration: none; color: white"><b>Add New Administrator</b></a>   </font>
            </td>
             <td align="center">  <font face="Agency FB"size="4">
                 <a href="<s:url action="adminorderact"/>" style="text-decoration: none; color: white"><b>View Orders Placed</b></a>   </font>
            </td>
        </tr>
        
        </table>
        </div>
            <div>
                <img width="1125" height="570"src="img/adminback.jpg"/>
            </div>    
        <!-- END NEVIGATION -->
    </td></tr></table>
</td></tr></table></body>
</html>