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
public class BitStamp extends Market{

    public BitStamp() {
         this("btc");
         this.crytpoType="btc";
        
    }
    public BitStamp(String cryptoType) {
        this.crytpoType =cryptoType;
        getData(this.crytpoType);
    }

    public void getData(String type) {
          String dataurl ="";
          if(type.equals("btc")){
              dataurl="https://www.bitstamp.net/api/order_book/";
          }
          // 
        //  else if(){
        //     dataurl=""
        //  }
          Map<String,String>orderMap = new HashMap<String,String>();
        try {
            orderMap =  getOrder(dataurl);
        } catch (IOException ex) {
            Logger.getLogger(BitStamp.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.buyPrice =Double.parseDouble(orderMap.get("buyPrice"));
         this.buyVolume =Double.parseDouble(orderMap.get("buyVolume"));
         this.sellPrice=Double.parseDouble(orderMap.get("sellPrice"));
         this.sellVolume =Double.parseDouble(orderMap.get("sellVolume"));
        try {
            this.lastTadePrice =Double.parseDouble(getLastTradePrice());
        } catch (IOException ex) {
            Logger.getLogger(BitStamp.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
    public  Map<String,String> getOrder(String dataurl) throws MalformedURLException, IOException {
       Map<String,String>orderMap = new HashMap();
        URL url = new URL(dataurl);
       // URL url = new URL("https://www.bitstamp.net/api/order_book/");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
            
            JsonArray buyArray = orderObject.getJsonArray("bids");
            String buy1Price= buyArray.getJsonArray(0).getJsonString(0).getString();

            orderMap.put("buyPrice", buy1Price);
            String buy1Volume=buyArray.getJsonArray(0).getJsonString(1).getString();
            orderMap.put("buyVolume", buy1Volume);
            
            
            
            JsonArray sellArray = orderObject.getJsonArray("asks");
            String sell1Price= sellArray.getJsonArray(0).getJsonString(0).getString();
            orderMap.put("sellPrice", sell1Price);
            String sell1Volume=sellArray.getJsonArray(0).getJsonString(1).getString();
            orderMap.put("sellVolume", sell1Volume);
            reader.close();
            
            
        }
       return orderMap; 
  }    
     public static Map<String,String> getLastPrice() throws MalformedURLException, IOException {
       Map<String,String>orderMap = new HashMap();
        URL url = new URL("https://www.bitstamp.net/api/ticker/");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
             String lastPrice =orderObject.getJsonString("last").getString();
            orderMap.put("LastPrice", lastPrice);        
            reader.close();
            
            
        }
       return orderMap; 
     }    
    
    public String  getLastTradePrice() throws MalformedURLException, IOException {
       String lastTradePrice;
        URL url = new URL("https://www.bitstamp.net/api/ticker/");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
             lastTradePrice =orderObject.getJsonString("last").getString();     
            reader.close();      
        }
       return lastTradePrice;
     }    
}
