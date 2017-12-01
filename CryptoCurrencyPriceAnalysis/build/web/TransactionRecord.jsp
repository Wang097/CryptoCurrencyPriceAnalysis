<%-- 
    Document   : TransactionRecord
    Created on : 27/11/2017, 4:22:48 PM
    Author     : Alan Sun
--%>

<%@page import="java.util.List"%>
<%@page import="model.CustomerOrder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <title>Transaction Records</title>

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
                     <li><a href="InputTransaction.jsp"><span class="glyphicon glyphicon-log-in"></span> Input Transaction</a></li>
                      <li><a href="TransactionRecord.jsp"><span class="glyphicon glyphicon-log-in"></span> Transaction Record</a></li>
                       <li><a href="Logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Log Out</a></li>
                </ul>
            </div>
        </nav>
        

        <br />
        <center>
           <h2> Transaction Record</h2>
        </center>
        <br />
        <br />

        <div>
            
            <center>
            <table width="400"  class="table table-bordered table-striped"  style="width: 60% !important">
                <thead>
                    <tr >
                        <th class="text-center">Order ID</th>
                        <th class="text-center">Crypto</th>
                        <th class="text-center">Exchange</th>
                        <th class="text-center">Fiat</th>
                        <th class="text-center">Order Type</th>
                        <th class="text-center">Amount</th>
                        <th class="text-center">Price</th>
                        <th class="text-center">Time</th>

                    </tr>
                </thead>
                <tbody>
                    <%List<CustomerOrder> cos = (List<CustomerOrder>) session.getAttribute("orders");%>

                    <%
                        for (CustomerOrder co : cos) {%>

                    <tr>

                        <td class="text-center"><%=co.getOrderid()%></td>
                        <td class="text-center"><%=co.getCryptoName()%></td>
                        <td class="text-center"><%=co.getExchange()%></td>
                        <td class="text-center"><%=co.getFiat()%></td>
                        <td class="text-center"><%=co.getOrderType()%></td>
                        <td class="text-center"><%=String.format("%.4f", co.getAmount())%></td>
                        <td class="text-center"><%=String.format("%.2f", co.getPrice())%></td>
                        <td class="text-center"><%=co.getTime()%></td>



                    </tr>
                    <% }%>

                </tbody>
            </table>
           </center>
        </div>

    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
