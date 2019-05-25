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
                <a href="Adminhome.jsp" title="Online Shopping" style="text-decoration: none; color:darkslategray" onMouseOver="this.style.cursor='hand';"> picSHOP</a>
            </b></font>
            </td>
            <td align="right"> 
            <font size="5" face="Agency FB">
          <a href="#" title="Logout" style="text-decoration: none; color: white"><img width="120" height="50" src="img/logoutb.png"/></a>
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
 <!--            
            <td> <font face="Agency FB" size="4">
                <a href="AddCategory.jsp" style="text-decoration: none; color: white"><b>Add New Category</b></a>   </font>
            </td>
            <td>  <font face="Agency FB" size="4">
            <a href=" <%--<s:url action="viewcat"/> --%>" style="text-decoration: none; color: white"><b>View Category List</b></a>  </font>
            </td>
            <td>  <font face="Agency FB" size="4">
            <a href="EditCategory.jsp" style="text-decoration: none; color: white"><b>Edit Category List</b></a>        </font>
            </td>
   -->          
            
            
            <td align="center">  <font face="Agency FB" size="4">
                <a href="AddProduct.jsp" style="text-decoration: none; color: white"><b>Add New Product</b></a>    </font>
            </td>
            <td align="center">  <font face="Agency FB" size="4">
                <a href="ViewProductAdmin.jsp" style="text-decoration: none; color: red"><b>View Products List</b></a>   </font>
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
            
            <div style="background-color: #CCC"><center>
      <br/><b><font color="white"face="Agency FB" size="5">
      <a href="<s:url action="BagsAdminAct"/>" title="Bags"style="text-decoration: none; color: white;">Bags</a> | 
      <a href="<s:url action="WatchAdminAct"/>" title="Watches"style="text-decoration: none; color: white">Watches</a> | 
      <a href="<s:url action="SunglassAdminAct"/>" title="Sunglasses"style="text-decoration: none; color: darkblue">Sunglasses</a>
       </font>
       <br/><br/>
      <table align="center" border="0" width="50%">
      <s:iterator value="userlistlist">
      <tr>
      <td align="center" width="30%"> 
      <img src="<s:property value="PRODUCTIMG"/>"/>
      </td>
      <td >
                    
  <b> Product ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>  <s:property value="PRODID" /> <br/>
  <b> Brand &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </b> <s:property value="BRANDNAME" /><br/>
  <b> Gender     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b> <s:property value="GENDER"/><br/>
  <b> Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> <s:property value="PRICE" /><br/>
  <b> Description &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> <s:property value="DESCRIPTION" /> <br/>
                 
      </td> 
      </tr>
      </s:iterator> 
      </table>
  </b>
       <br/>
  </div>    
        <!-- END NEVIGATION -->
    </td></tr></table>
</td></tr></table></body>
</html>