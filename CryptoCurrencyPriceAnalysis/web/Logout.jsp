<%-- 
    Document   : Logout
    Created on : 30/11/2017, 1:25:27 PM
    Author     : Alan Sun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
    </head>
    <body>
        <%
session.invalidate();
response.sendRedirect("Signin.jsp");
%>
    </body>
</html>
