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
        <title>View Orders</title>
    </head>
    <body><table align="center" width="100%"><tr><td align="center">
        
        <table border="0" width="90%"><tr><td> 
        <!-- NEVIGATION -->            
        <div>
            <center>
            <table cellpadding="-10" width="100%" border="0"> <tr> 
            <td style="background-color: white" width="80%">
            <font size="7" face="Agency FB" ><b>
            <a href="Adminhome.jsp" title="Admin Home" style="text-decoration: none; color:darkslategray" onMouseOver="this.style.cursor='hand';"> picSHOP</a>
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
            <td align="center">  <font face="Agency FB" size="4">
                <a href="AddProduct.jsp" style="text-decoration: none; color:white"><b>Add New Product</b></a>    </font>
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
                <a href="<s:url action="adminorderact"/>" style="text-decoration: none; color: red"><b>View Orders Placed</b></a>   </font>
            </td>
        </tr>
        
        </table>
        </div>
      <div style="background-image: url(img/adminback.jpg);background-size: 100% 100%;background-repeat: no-repeat"><center>
      <br/>
      <table align="right" border="0" width="75%">
      <tr style="background-color: khaki">
      <td align="center" style="color: black">Username</td> 
      <td align="center" style="color: black">Customer Name</td> 
      <td align="center" style="color: black">Email Address</td> 
      <td align="center" style="color: black">Card Number</td>
      <td align="center" style="color: black">Address</td> 
      <td align="center" style="color: black">Product ID</td> 
      <td align="center" style="color: black">Price</td> 
      <td align="center" style="color: black">Status</td>
      </tr>
      <s:iterator value="userlistlist">
          <tr style="background-color: gainsboro">
      <td><s:property value="UNAME"/></td>
      <td><s:property value="CNAME"/></td>
      <td><s:property value="CEMAIL"/></td>
      <td><s:property value="CARDNUMBER"/></td>
      <td><s:property value="CADDRESS"/></td>
      <td><s:property value="PROID"/></td>
      <td><s:property value="PRICE"/></td>
      <td><s:property value="STATUS"/></td>
      </tr>
      </s:iterator> 
      </table>
      ____________________________________________________________________
      <table border="0"><tr><td align="center" style=" font-size: 17pt">
            <font face="Agency FB"><b>Enter Order Status</b></td></tr>
            <tr><td>
            <s:actionerror/>
            <s:form action="orderstatusact" enctype="multipart/form-data">
            <s:label value="Username" cssStyle="font-size:15pt; color:black"/>
            <s:textfield name="uname" cssStyle="width:300pt; height:20pt; font-size:15pt"/>
            <s:label value="Status" cssStyle="font-size:15pt; color:black"/>
            <s:textfield name="ustatus" cssStyle="width:300pt; height:60pt; font-size:15pt"/>
            <s:submit value="Submit" cssStyle="height:20pt; width:100pt; font-size:11pt"/>
            </s:form> 
            </td></tr> </table>
            </center>
        </div>
        <!-- END NEVIGATION -->
    </td></tr></table>
</td></tr></table></body>
</html>