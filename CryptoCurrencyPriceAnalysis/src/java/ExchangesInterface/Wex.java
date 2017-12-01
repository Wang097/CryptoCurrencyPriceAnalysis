
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExchangesInterface;

/**
 *
 * @author 000988555
 */
import static ExchangesInterface.IR.getLastPrice;
import static ExchangesInterface.IR.getOrder;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
public class Wex extends Market{
    
      public Wex() {
        getData();
         this.crytpoType="btc";
        
    }


     @Override
    public void getData() {
         
          Map<String,Double>orderMap = new HashMap<>();
        try {
            orderMap =  getOrder();
        } catch (IOException ex) {
            Logger.getLogger(BitStamp.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.buyPrice =orderMap.get("buyPrice");
         this.buyVolume =orderMap.get("buyVolume");
         this.sellPrice=orderMap.get("sellPrice");
         this.sellVolume =orderMap.get("sellVolume");
        try {
            this.lastTadePrice =getLastPrice().get("LastPrice");
        } catch (IOException ex) {
            Logger.getLogger(BitStamp.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
    
     public static Map<String,Double> getOrder() throws MalformedURLException, IOException {
        Map<String,Double>orderMap = new HashMap();
        URL url = new URL("https://wex.nz/api/3/depth/btc_usd");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
            JsonObject btcObject =orderObject.getJsonObject("btc_usd");
            JsonArray buyArray =  btcObject.getJsonArray("bids");
           // double buy1Price= buyArray.getJsonObject(0).getJsonNumber("price").doubleValue();
             Double buy1Price= buyArray.getJsonArray(0).getJsonNumber(0).doubleValue();
           
            orderMap.put("buyPrice", buy1Price);
            Double buy1Volume=buyArray.getJsonArray(0).getJsonNumber(1).doubleValue();;
            orderMap.put("buyVolume", buy1Volume);
            
            
            
            JsonArray sellArray =  btcObject.getJsonArray("asks");
           Double sell1Price= sellArray.getJsonArray(0).getJsonNumber(0).doubleValue();
            orderMap.put("sellPrice", sell1Price);
            Double sell1Volume=sellArray.getJsonArray(0).getJsonNumber(1).doubleValue();;
            orderMap.put("sellVolume", sell1Volume);
            reader.close();
            
            
        }
       return orderMap; 
      
  }    
     public static Map<String,Double> getLastPrice() throws MalformedURLException, IOException {
       Map<String,Double>orderMap = new HashMap();
        URL url = new URL("https://wex.nz/api/3/ticker/btc_usd");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
             JsonObject tickerObject= orderObject.getJsonObject("btc_usd");
             Double lastPrice =tickerObject.getJsonNumber("last").doubleValue();
            orderMap.put("LastPrice", lastPrice);        
            reader.close();
            
            
        }
       return orderMap; 
  }    
}
