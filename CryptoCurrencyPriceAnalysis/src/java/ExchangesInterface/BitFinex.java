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


/**
 *
 * @author xiaoh
 */
public class BitFinex extends Market {
     public BitFinex() {
        getData();
         this.crytpoType="BitFinex";
        
    }
//    public BitFinex(String cryptoType) {
//        this.crytpoType =cryptoType;
//        getData( cryptoType);
//    }

     @Override
    public void getData() {
         
          Map<String,String>orderMap = new HashMap<>();
        try {
            orderMap =  getOrder();
        } catch (IOException ex) {
            Logger.getLogger(BitStamp.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.buyPrice =Double.parseDouble(orderMap.get("buyPrice"));
         this.buyVolume =Double.parseDouble(orderMap.get("buyVolume"));
         this.sellPrice=Double.parseDouble(orderMap.get("sellPrice"));
         this.sellVolume =Double.parseDouble(orderMap.get("sellVolume"));
        try {
            this.lastTadePrice =Double.parseDouble(getLastPrice().get("LastPrice"));
        } catch (IOException ex) {
            Logger.getLogger(BitStamp.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
    
    
      public static Map<String,String> getOrder() throws MalformedURLException, IOException {
        Map<String,String>orderMap = new HashMap();
        URL url = new URL("https://api.bitfinex.com/v1/book/btcusd");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
         
            JsonArray buyArray = orderObject.getJsonArray("bids");
          
          
            String buy1Price= buyArray.getJsonObject(0).getJsonString("price").getString();
            orderMap.put("buyPrice", buy1Price);
            String buy1Volume=buyArray.getJsonObject(0).getJsonString("amount").getString();
            orderMap.put("buyVolume", buy1Volume);
            
            
            
            JsonArray sellArray = orderObject.getJsonArray("asks");
            String sell1Price= sellArray.getJsonObject(0).getJsonString("price").getString();
            orderMap.put("sellPrice", sell1Price);
            String sell1Volume=sellArray.getJsonObject(0).getJsonString("amount").getString();
            orderMap.put("sellVolume", sell1Volume);
            reader.close();
            
            
        }
       return orderMap; 
      
  }    
     public static Map<String,String> getLastPrice() throws MalformedURLException, IOException {
       Map<String,String>orderMap = new HashMap();
        URL url = new URL("https://api.bitfinex.com/v1/pubticker/btcusd");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
             String lastPrice =orderObject.getJsonString("last_price").getString();
            orderMap.put("LastPrice", lastPrice);        
            reader.close();
            
            
        }
       return orderMap; 
  }    
}
