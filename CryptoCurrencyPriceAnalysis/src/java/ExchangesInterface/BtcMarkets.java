/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExchangesInterface;

import CurrencyConvert.CurrencyRate;
import static ExchangesInterface.BitFinex.getLastPrice;
import static ExchangesInterface.BitFinex.getOrder;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author xiaoh
 */
public class BtcMarkets extends Market {
    
     public BtcMarkets() {
        getData();
         this.crytpoType="Btc";
        
    }
     @Override
    public void getData() {
         
          Map<String,Double>orderMap = new HashMap<>();
        try {
            orderMap = getMarketinUSD();
        } catch (IOException ex) {
            Logger.getLogger(BitStamp.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.buyPrice =orderMap.get("buyPrice");
         this.buyVolume =orderMap.get("buyVolume");
         this.sellPrice=orderMap.get("sellPrice");
         this.sellVolume =orderMap.get("sellVolume");
        
         this.lastTadePrice=orderMap.get("LastPrice");
       
              
    }
    
    
        public static Map<String,Double> getOrder() throws MalformedURLException, IOException {
         Map<String,Double>orderMap = new HashMap();
        URL url = new URL("https://api.btcmarkets.net//market/BTC/AUD/orderbook");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
            
            JsonArray buyArray = orderObject.getJsonArray("bids");
           double buy1Price= buyArray.getJsonArray(0).getJsonNumber(0).doubleValue();
//            double buy1Price= buyArray.getJsonObject(0).getJsonNumber(0).doubleValue();
            orderMap.put("buyPrice", buy1Price);
            double buy1Volume=buyArray.getJsonArray(0).getJsonNumber(1).doubleValue();
            orderMap.put("buyVolume", buy1Volume);
            
            
            
            JsonArray sellArray = orderObject.getJsonArray("asks");
            double sell1Price= sellArray.getJsonArray(0).getJsonNumber(0).doubleValue();
            orderMap.put("sellPrice", sell1Price);
            double sell1Volume=sellArray.getJsonArray(0).getJsonNumber(1).doubleValue();
            orderMap.put("sellVolume", sell1Volume);
            reader.close();
            
            
        }
       return orderMap; 
  }    
     public static Map<String,Double> getLastPrice() throws MalformedURLException, IOException {
       Map<String,Double>orderMap = new HashMap();
        URL url = new URL("https://api.btcmarkets.net/market/BTC/AUD/tick");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
             double lastPrice =orderObject.getJsonNumber("lastPrice").doubleValue();
            orderMap.put("LastPrice", lastPrice);        
            reader.close();
            
            
        }
       return orderMap; 
     }   
     public static Map<String,Double>getMarketinUSD() throws IOException{
         Map<String,Double>MarketMap =new HashMap();
         double rate=CurrencyRate.getRate().get("AUD");
         Map<String,Double> orderMap =getOrder();
         for(Entry<String,Double> e : orderMap.entrySet()){
             if(e.getKey().contains("Price")){
             double value  = e.getValue()/rate;
             MarketMap.put(e.getKey(), value);
             }
             else
                 MarketMap.put(e.getKey(), e.getValue());
         }
         Map<String,Double> lastPriceMap =getLastPrice();
         for(Entry<String,Double> e : lastPriceMap.entrySet()){
             double value  = e.getValue()/rate;
             MarketMap.put(e.getKey(), value);
         }
         return MarketMap;
     }
}