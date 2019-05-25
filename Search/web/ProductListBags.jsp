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
        <title>Bags</title>
    </head>
<body>
<table align="center" width="100%">
<tr>
<td align="center">
     <a id="top"></a>
        <table border="1" width="80%"><tr><td> 
        <!-- NEVIGATION -->            
        <div>
            <center>
            <table cellpadding="-10" width="100%" border="1"> <tr> 
            <td style="background-color: white" width="85%">
            <font size="7" face="Agency FB" ><b>
                <a href="index.jsp" title="Online Shopping" style="text-decoration: none; color:darkslategray" onMouseOver="this.style.cursor='hand';" > &nbsp;picWATCH</a>
            </b></font>
            </td>
   <!--         <td style="background-image: url(img/nbg.jpg)" align="center">
            <font size="5" face="Agency FB" >
            <a href="login.jsp" title="Profile" style="text-decoration: none; color:white">Logout</a>
            </font>
            </td>   -->
     
            </tr></table>
            </center>
        </div>
        <!-- END NEVIGATION -->
       
        <!-- Search Bar -->
         <div>
        <table border="1" cellpadding="0" width="100%" bgcolor="">
        <tr>
        <td align="left">
            <a href="<s:url action="Gentsact"/>" onMouseOver="this.style.cursor='hand';">   <img src="img/1b.jpg"/> </a>
        </td>
        <td align="center">
            <a href="<s:url action="Ladiesact"/>" onMouseOver="this.style.cursor='hand';"> <img src="img/2b.jpg"/> </a>
        </td>
        <td align="right">
            <a href="<s:url action="NewLinesact"/>" onMouseOver="this.style.cursor='hand';"> <img src="img/3b.jpg"/> </a>
        </td>
        </tr>
        </table>
        </div>
        <div><table border="1" width="100%" style="background-color: cadetblue"><tr><td></td></tr></table></div>
        <!-- END Search Bar -->
        <!-- start center -->
                 
        <!-- end center -->     
        <div> <table bordercolor="cadetblue" align="center" border="1" width="100%" style="background-color: whitesmoke"> <tr> 
            <td align="center" width="20%">
                <div>
                     <a href="#" title="Casio Watches"><img src="img/casio.jpg"/></a>
                </div>
                <br/>
                <div>
                      <a href="#" title="Fastrack Watches"><img src="img/fastrack.jpg"/></a>
                </div>
                <br/>
                <div>
                     <a href="#" title="Fossil Watches"><img src="img/fossil.jpg"/></a>
                </div>
                <br/>
                <div>
                     <a href="#" title="Tommy Hilfiger Watches"><img src="img/hilfiger.jpg"/></a>
                </div>
                <br/>
                <div>
                     <a href="#" title="Titan Watches"><img src="img/titan.jpg"/></a>
                </div>
                <br/>
                <div>
                     <a href="#" title="Burg Watches"><img src="img/burg.jpg"/></a>
                </div>
                <br/>
                <div>
                    <a href="#" title="Citizen Watches"><img src="img/citizen.jpg"/></a>
                </div>
                <br/>
                <div>
                    <a href="#" title="D&G Watches"><img src="img/dg.jpg"/></a>
                </div>
                <br/>
                <div>
                    <a href="#" title="Police Hilfiger Watches"><img src="img/police.jpg"/></a>
                </div>
                <br/>
                <div>
                    <a href="#" title="Q&Q Watches"><img src="img/qq.jpg"/></a>
                </div>
            </td>
           
            <td> 
                
            <table align="center" border="1" style="background-color: whitesmoke" width="100%">
                 <s:iterator value="userlistlist">
               <tr>
                <td align="center" width="30%"> 
                    <img src="<s:property value="PRODUCTIMG"/>"/>
                </td>
                <td >
                    
  <b> Product ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b>  <s:property value="PRODID" /> <br/>
  <b> Brand &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </b> <s:property value="CATEGORYNAME" /><br/>
  <b> Product Name &nbsp; : </b> <s:property value="NAME" /> <br/>
  <b> Gender     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </b> <s:property value="GENDER"/><br/>
  <b> Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> <s:property value="PRICE" /><br/>
  <b> Description &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : </b> <s:property value="DESCRIPTION" /> <br/>
                 
                </td> 
                <td > <img src="img/buy.png"/>
               <!--    <font size="7" face="Palace Script MT"> Buy </font>   -->
                </td>
               </tr>
            </s:iterator> 
            </table>   
            </td>
            
        </tr> </table></div>
           
        
       
    </td></tr></table>
    <a href="#top">Go to top</a>         
</td>
</tr>
</table>
    </body>
</html>