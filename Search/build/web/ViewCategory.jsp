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
        <table border="1" width="100%"><tr><td> 
        <!-- NEVIGATION -->            
        <div>
            <center>
            <table cellpadding="-10" width="100%" border="1"> <tr> 
            <td bgcolor="006699" width="70%">
            <font size="7" face="Bradley Hand ITC" ><b>
            <a href="index.jsp" title="Online Shopping" style="text-decoration: none; color: white" onMouseOver="this.style.backgroundColor='009999';  this.style.cursor='hand';" onMouseOut="this.style.backgroundColor='006699'"> eCom.com</a>
            </b></font>
            </td>
            <td bgcolor="006699" align="center">
            <font size="5" face="Agency FB" >    
            <a href="<s:url action="cat"/>" title="Search" style="text-decoration: none; color: white">Categories</a>
            </font>
            </td>
            <td bgcolor="006699" align="center">
            <font size="5" face="Agency FB" >
            <a href="#" title="Profile" style="text-decoration: none; color: white">Profile</a>
            </font>
            </td>
            <td bgcolor="006699" align="center">
            <font size="5" face="Agency FB" hover="">
            <a href="#" title="Help" style="text-decoration: none; color: white">Help</a>
            </font>
            </td>
            </tr></table>
            </center>
        </div>
        <br/>
        <div>
        <table border="1" cellpadding="5" width="100%" bgcolor="#F0F0F0">
        <tr>
        <td align="center">
            <font size="5" face="Arial" color="#505050">
            Administrator
            </font> 
        </td> 
        </tr><br/><br/>
        <tr>
            <td>
            <a href="AddCategory.jsp">
            Add New Category</a>
            </td>
            <td>
            View Category List
            </td>
            <td>
            Edit Category List
            </td>
            <td>
            Add New Product
            </td>
            <td>
            View Products List
            </td>
            <td>
            Edit Product List
            </td>
            <td>
            Change Password
            </td>
            <td>
            Add New Administrator.
            </td>
        </tr>
        <tr>
            <td>
            <div>
            <s:iterator value="userlistlist">
            <table border="1"><tr>
            <td width="50"><s:property value="CATEGORYNAME"/></td>
            </tr> </table></s:iterator>
            </div>  
            </td>
        </tr>
        </table>
        </div>
        <!-- END NEVIGATION -->
    </td></tr></table>
    </body>
</html>