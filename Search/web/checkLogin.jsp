<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html" import="java.util.*"%>
<html>
  <head>
  <title>Check validate!</title>
  </head>
  <body>
   <s:if test="#session.login != 'admin'">
       <jsp:forward page="AdminLogin.jsp" />
   </s:if>
  </body>
</html>