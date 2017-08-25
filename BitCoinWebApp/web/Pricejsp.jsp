<%-- 
    Document   : Prcejsp
    Created on : 25/08/2017, 10:41:22 AM
    Author     : 000988555
--%>

<%@page import="src.CurrencyExchange"%>
<%@page import="src.BitCoin"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="4"> <!-- Refresh every 15 minutes -->
        <title>Bitcoin</title>
    </head>
    <body>
        <h3><%= new Date() %></h3>
         
        <p>  <%= BitCoin.getPrice()%></p>
        <h3>Latest currency exchange rate: base:USD</h3>
        <%= CurrencyExchange.getRate() %>
        
    </body>
</html>
