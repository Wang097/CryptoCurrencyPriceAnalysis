<%-- 
    Document   : Prcejsp
    Created on : 25/08/2017, 10:41:22 AM
    Author     : 000988555
--%>

<%@page import="ExchangesInterface.IR"%>
<%@page import="CurrencyConvertRateInterface.CurrencyConvertRateInterface"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="refresh" content="4"> <!-- Refresh every 15 minutes -->
       <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"">
        <title>Crypto Currency Price Analysis</title>
    </head>
    <body>
        <div class="container"> 
        <!--Two Drop down list-->
        <select name="Currency" class="selectpicker" >
            <option selected>AUD</option>
            <option>USD</option>
            <option>CNY</option>
        </select>
        
        <select name="Crypto"class="selectpicker" >
            <option selected>BTC</option>
            <option>BCH</option>
            <option>LTC</option>
            <option>ETH</option>
        </select>
        <br />
        <div>
            <table width="400"  class="table table-bordered table-striped" >
                <thead>
                    <tr >
                        <th class="text-center">Exchanges</th>
                        <th class="text-center">Buy1</th>
                        <th class="text-center">Volumn</th>
                        <th class="text-center">Sale1</th>
                        <th class="text-center">Volumn</th>
                        <th>Last Trade Price</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Bitstamp</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Kraken</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>BTCChina</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Okcoin</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Bitfinex</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>BtcMarkets</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Independent Researve</td>
                        <td><%= IR.getOrder().get("buyPrice")%></td>
                        <td><%= IR.getOrder().get("buyVolume")%></td>
                        <td><%= IR.getOrder().get("sellPrice")%></td>
                        <td><%= IR.getOrder().get("sellVolume")%></td>
                        <td><%= IR.getPrice().get("LastPrice")%></td>
                    </tr>
                    
                </tbody>
            </table>

            
            </div>
        
        
        
        
        
        
        <h3><%= new Date() %></h3>
         
        <p>  <%= IR.getPrice()%></p>
        <h3>Latest currency exchange rate: base:USD</h3>
        <%= CurrencyConvertRateInterface.getRate() %>
        </div>
       <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
    </body>
</html>
