
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Home</title>
    </head>
    <body>
        <table border="1" width="100%"><tr><td> 
        <!-- NEVIGATION -->            
        <div>
            <center>
            <table cellpadding="-10" width="100%" border="1"> <tr> 
            <td bgcolor="006699" width="70%">
            <font size="7" face="Bradley Hand ITC" ><b>
            <a href="#" title="Online Shopping" style="text-decoration: none; color: white" onMouseOver="this.style.backgroundColor='009999';  this.style.cursor='hand';" onMouseOut="this.style.backgroundColor='006699'"> eCom.com</a>
            </b></font>
            </td>
            <td bgcolor="006699" align="center">
            <font size="5" face="Agency FB" >    
            <a href="<s:url action="cat"/>" title="Categories" style="text-decoration: none; color: white">Categories</a>
            </font>
            </td>
            <td bgcolor="006699" align="center">
            <font size="5" face="Agency FB" >
            <a href="login.jsp" title="Profile" style="text-decoration: none; color: white">Profile</a>
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
        <!-- END NEVIGATION -->
        <br/>
        <!-- Search Bar -->
    <!--    <div>
        <table border="1" cellpadding="5" width="100%" bgcolor="F4B499">
        <tr>
        <td>
        <form method="post" action="action3">
        <input type="text" name="srch" size="90" style="height:25px; font-size:15pt"/>
        <input type="submit" value="Search" style="width: 120px; height: 30px; font-weight:bolder"/>
        </form>
        </td>
        </tr>
        </table>
        </div>  -->
        <!-- END Search Bar -->
 <!--       <div>
            
                <table border="1"><tr>
 <%--               <s:iterator value="userlistlist">
                            <td width="310" align="center">
                               <s:if test="CATEGORYNAME=='ACCESSORIES'">
                               <a href="<s:url action="accessoriesact"/>">
                                <s:property value="CATEGORYNAME"/>
                                </a>   
                               </s:if>
                               <s:elseif test="CATEGORYNAME=='CLOTHING'">
                                <s:a href="Adminhome.jsp">
                                <s:property value="CATEGORYNAME"/>
                                </s:a>
                               </s:elseif>
                               <s:elseif test="CATEGORYNAME=='NEW ARRIVALS'">
                                 <s:a href="Adminhome.jsp">
                                <s:property value="CATEGORYNAME"/>
                                </s:a>  
                               </s:elseif>
                               <s:elseif test="CATEGORYNAME=='SHOES'">
                                 <s:a href="Adminhome.jsp">
                                <s:property value="CATEGORYNAME"/>
                                </s:a>  
                               </s:elseif> 
                            </td>
                        </s:iterator>  --%>
                    </tr> </table>
        </div>
  -->      
        <div>
            <table border="1">
                <tr>
                    <s:iterator value="userlistlist">
                        <td width="100">
                            <s:property value="NAME"/>
                           
                        </td>
                    </s:iterator>
                </tr>
            </table>
        </div>
    </td></tr></table>
    </body>
</html>