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
        <title>Crypto Currency Price Analysis</title>
    </head>
    <body>
       
        <!--Two Drop down list-->
        <select name="Currency">
            <option selected>AUD</option>
            <option>USD</option>
            <option>CNY</option>
        </select>
        
        <select name="Crypto">
            <option selected>BTC</option>
            <option>BCH</option>
            <option>LTC</option>
            <option>ETH</option>
        </select>
        <br />
        <div>
            <table border="2" width="250" cellspacing="1" cellpadding="1" >
                <thead>
                    <tr>
                        <th>Exchanges</th>
                        <th>Buy1</th>
                        <th>Volumn</th>
                        <th>Sale1</th>
                        <th>Volumn</th>
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
                        <td><%= BitCoin.getPrice().get("CurrentHighestBidPrice")%></td>
                        <td></td>
                        <td><%= BitCoin.getPrice().get("CurrentLowestOfferPrice")%></td>
                        <td></td>
                        <td><%= BitCoin.getPrice().get("LastPrice")%></td>
                    </tr>
                    
                </tbody>
            </table>

            
            </div>
        
        
        
        
        
        
        <h3><%= new Date() %></h3>
         
        <p>  <%= BitCoin.getPrice()%></p>
        <h3>Latest currency exchange rate: base:USD</h3>
        <%= CurrencyExchange.getRate() %>
        
    </body>
</html>
