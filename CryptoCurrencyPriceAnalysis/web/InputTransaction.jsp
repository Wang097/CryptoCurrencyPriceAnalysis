<%-- 
    Document   : InputTranscation
    Created on : 27/11/2017, 3:39:25 PM
    Author     : Alan Sun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Transaction Page</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
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
        <br />
        <br />
                <form action="LogController" method="POST">
            <center>
            <table border="1" width="30%" cellpadding="5" class="table table-bordered table-striped"  style="width: 45% !important" >
                <thead>
                    <tr>
                        <th colspan="2">Enter Transaction Detail Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Crypto Currency</td>
                        
                          <td> <select name="crypto">
                              <option value="BTC" selected="true">BTC</option>
                              <option value="ETH">ETH</option>
                              <option value="LTC">LTC</option>
                              <option value="BCH">BCH</option>
                          </select></td>
                    </tr>
                    <tr>
                        <td>Exchange</td>
                              <td> <select name="exchange">
                              <option value="Bitstamp" selected="true">Bitstamp</option>
                              <option value="Bitfinex">Bitfinex</option>
                              <option value="Independent Reserve">Independent Reserve</option>
                              <option value="Btcmarket">Btcmarket</option>
                              <option value="Wex">Wex</option>
                          </select></td>     
                    </tr>
                      <tr>
                        <td>Trading Fee</td>
                              <td> <select name="tradingFee">
                              <option value="0.001" selected="true">0.1%</option>
                              <option value="0.002">0.2%</option>
                              <option value="0.0025">0.25%</option>
                              <option value="0.003">0.3%</option>
                              <option value="0.004">0.4%</option>
                              <option value="0.005">0.5%</option>
                              <option value="0.008">0.8%</option>
                          </select></td>     
                    </tr>
                    
                      <tr>
                        <td>Fiat Currency</td>
                              <td> <select name="fiat">
                              <option value="USD" selected="true">USD</option>
                              <option value="AUD">AUD</option>
                              <option value="CNY">CNY</option>
                              <option value="EUR">EUR</option>
                          </select></td>     
                    </tr>
                       <tr>
                        <td>Order Type</td>
                              <td> <select name="orderType">
                              <option value="BUY" selected="BUY">BUY</option>
                              <option value="SALE">SALE</option>
                          </select></td>     
                    </tr>
                    <tr>
                        <td>Amount</td>
                        <td><input type="text" name="amount" value="" /></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="text" name="price" value="" /></td>
                    </tr>
                    <tr>
                        <td>Time</td>
                       <td> <input type="date" name="bday"/></td>
               
                    </tr>

                    <tr>
                        <td></td>
                        <td><input type="submit" value="Submit" /></td>
                        <input type="hidden" name ="action" value="InputView"></input>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>      
        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
    

</html>
