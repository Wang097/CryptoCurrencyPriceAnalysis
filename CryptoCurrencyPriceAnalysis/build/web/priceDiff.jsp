<%-- 
    Document   : priceDiff
    Created on : 28/11/2017, 2:10:17 PM
    Author     : Alan Sun
--%>

<%@page import="ExchangesInterface.Market"%>
<%@page import="java.util.HashMap"%>
<%@page import="DAO.MarketData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Refresh every 4 minutes -->
        <!--<meta http-equiv="refresh" content="4"> -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <title>Information of Market</title>
    </head>
    <body>  
  
         <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">BitcoinArbitrageWorld</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="marketInfo.jsp">Bitcoin Realtime Price</a></li>
                    <li><a href="priceDiff.jsp">Bitcoin Price Difference</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="Signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="Signin.jsp"><span class="glyphicon glyphicon-log-in"></span> Sign In</a></li>
                </ul>
            </div>
        </nav>
        
        <br />
        <br />
        <br />
        <center>
           <h2> Bitcoin Price Difference Analysis</h2>
        </center>
        <br />
        <br />

        <div>
            <center>
            <table width="400"  class="table table-bordered table-striped" style="width: 70% !important" >
                <thead>
                    <tr >
                        <th>
                        <th class="text-center">BtcMarkets</th>
                        <th class="text-center">BitStamp</th>
                        <th class="text-center">BitFinex</th>
                        <th class="text-center">IR</th>
                        <th class="text-center">Wex</th>
                       
                    </tr>
                </thead>
                <tbody>

                    <% MarketData md = new MarketData();%>
                    <% HashMap<String, Market> marketInfo = md.getDataInf();%>
                    <% for (String ma : marketInfo.keySet()) { %>
                   
                    <tr> 
                        <td class="text-center"><%=ma%></td>
                    <%   for (String mb : marketInfo.keySet()) { %>
                    
                    <% double b= marketInfo.get(ma).getSellPrice(); %>
                    <% double s = marketInfo.get(mb).getBuyPrice(); %>
                    <% double r = (s * 0.9975 - b * 1.0025) / (b * 1.0025);%>


                      <td class="text-center"><%=String.format("%.2f", r * 100)%></td>    
                      <% } %>
                </tr>
                <% }%>
                <p>Note: Buy from COLUMN exchange and sell to ROW exchange</p>

                </tbody>
            </table>
                </center>
        </div>

    </body>

    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>
