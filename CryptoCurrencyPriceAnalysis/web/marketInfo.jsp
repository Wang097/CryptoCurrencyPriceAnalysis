<%-- 
    Document   : marketInfo
    Created on : 28/11/2017, 9:00:48 AM
    Author     : xiaohua
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
                    <li ><a href="index.jsp">Home</a></li>
                    <li><a href="marketInfo.jsp" class="active" >Bitcoin Realtime Price</a></li>
                    <li><a href="priceDiff.jsp">Bitcoin Price Difference</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="Signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="Signin.jsp"><span class="glyphicon glyphicon-log-in"></span> Sign In</a></li>
                </ul>
            </div>
        </nav>
    <center>
        <br />
        <br />
        <br />
        <center>
            <h2> Bitcoin Realtime Price</h2>
        </center>
        <br />
        <br />

        <div  >

            <table   class="table table-bordered table-striped" style="width: 70% !important">
                <thead>
                    <tr >
                        <th class="text-center">Exchanges</th>
                        <th class="text-center">Buy1</th>
                        <th class="text-center">Volume</th>
                        <th class="text-center">Sale1</th>
                        <th class="text-center">Volume</th>
                        <th class="text-center">Last Trade Price</th>
                    </tr>
                </thead>
                <tbody>
                    <% MarketData md = new MarketData();%>
                    <% HashMap<String, Market> marketInfo = md.getDataInf();%>
                    <%
                        for (String m : marketInfo.keySet()) {%>

                    <tr>
                        <td class="text-center"><%=m%></td>
                        <td class="text-center"><%=String.format("%.2f", marketInfo.get(m).getBuyPrice())%></td>
                        <td class="text-center"><%=String.format("%.4f", marketInfo.get(m).getBuyVolume())%></td>
                        <td class="text-center"><%=String.format("%.2f", marketInfo.get(m).getSellPrice())%></td>
                        <td class="text-center"><%=String.format("%.4f", marketInfo.get(m).getSellVolume())%></td>
                        <td class="text-center"><%=String.format("%.2f", marketInfo.get(m).getLastTadePrice())%></td>                       
                    </tr>
                    <% }%>

                </tbody>
            </table>
    </center>
</div>

</body>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>