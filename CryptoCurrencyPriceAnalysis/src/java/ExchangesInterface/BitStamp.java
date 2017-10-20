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
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author xiaoh
 */
public class BitStamp {
    public static Map<String,String> getOrder() throws MalformedURLException, IOException {
       Map<String,String>orderMap = new HashMap();
        URL url = new URL("https://www.bitstamp.net/api/order_book/");
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
}