<%-- 
    Document   : Prcejsp
    Created on : 25/08/2017, 10:41:22 AM
    Author     : 000988555
--%>



<%@page import="CurrencyConvert.CurrencyRate"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="ExchangesInterface.Wex"%>
<%@page import="ExchangesInterface.BtcMarkets"%>
<%@page import="ExchangesInterface.BitStamp"%>
<%@page import="ExchangesInterface.BitFinex"%>
<%@page import="ExchangesInterface.IR"%>


<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
   <!--     <meta http-equiv="refresh" content="4"> <!-- Refresh every 15 minutes -->
       <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"">
        <title>Crypto Currency Price Analysis</title>
    </head>
    
        <div class="container"> 
        <!--Two Drop down list-->
        <form name ="f1" method="post" action="#">
        <select name="Currency" class="selectpicker" >
            <option value="AUD">AUD</option>
            <option selected value="USD">USD</option>
            <option value="CNY">CNY</option>
        </select>
            <input type="submit" value="select currency" />
        </form>
       
        
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
                        <td>Wex</td>
                        <td><%= Wex.getOrder().get("buyPrice") %></td>
                        <td><%= Wex.getOrder().get("buyVolume")%></td>
                        <td><%= Wex.getOrder().get("sellPrice")%></td>
                        <td><%= Wex.getOrder().get("sellVolume")%></td>
                        <td><%= Wex.getLastPrice().get("LastPrice")%></td>
                    </tr>
                   
                    <tr>
                        <td>BtcMarkets</td>
                        <td><%= BtcMarkets.getMarketinUSD().get("buyPrice") %></td>
                        <td><%= BtcMarkets.getMarketinUSD().get("buyVolume")%></td>
                        <td><%= BtcMarkets.getMarketinUSD().get("sellPrice")%></td>
                        <td><%= BtcMarkets.getMarketinUSD().get("sellVolume")%></td>
                        <td><%= BtcMarkets.getMarketinUSD().get("LastPrice")%></td>
                    </tr>
                  
                   
                    <tr>
                        <td>Bitstamp</td>
                        <td><%= BitStamp.getOrder().get("buyPrice")%></td>
                        <td><%= BitStamp.getOrder().get("buyVolume")%></td>
                        <td><%= BitStamp.getOrder().get("sellPrice")%></td>
                        <td><%= BitStamp.getOrder().get("sellVolume")%></td>
                        <td><%= BitStamp.getLastPrice().get("LastPrice")%></td>
                    </tr>
                    <tr>
                        <td>Bitfinex</td>
                        <td><%= BitFinex.getOrder().get("buyPrice")%></td>
                        <td><%= BitFinex.getOrder().get("buyVolume")%></td>
                        <td><%= BitFinex.getOrder().get("sellPrice")%></td>
                        <td><%= BitFinex.getOrder().get("sellVolume")%></td>
                        <td><%= BitFinex.getLastPrice().get("LastPrice")%></td>
                    </tr>
                    <tr>
                        <td>Independent</td>
                        <td><%= IR.getMarketinUSD().get("buyPrice")%></td>
                        <td><%= IR.getMarketinUSD().get("buyVolume")%></td>
                        <td><%= IR.getMarketinUSD().get("sellPrice")%></td>
                        <td><%= IR.getMarketinUSD().get("sellVolume")%></td>
                        <td><%= IR.getMarketinUSD().get("LastPrice")%></td>
                    </tr>
                    
                </tbody>
            </table>

                        <p><%=  CurrencyRate.getRate().get("USD") %></p>
                        
                         <p><%=  CurrencyRate.getRate().get("AUD") %></p> 
                         <p> <%=  request.getParameter("Currency") %></p>
            </div>
        
        
        
        
        
        
    
      
       <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
    
</html>
