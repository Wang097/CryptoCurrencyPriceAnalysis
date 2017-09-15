/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExchangesInterface;

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
import javax.json.stream.JsonParser;

/**
 *
 * @author 000988555
 */
public class IR {
     public static Map<String,String> dataMap =new HashMap<String,String>();
      public static Map<String,String> getPrice() throws MalformedURLException, IOException {
        Map<String,String>priceMap = new HashMap();
        String price;
        URL url = new URL("https://api.independentreserve.com/Public/GetMarketSummary?primaryCurrencyCode=xbt&secondaryCurrencyCode=aud");
       try (InputStream is = url.openStream();
        JsonParser parser = Json.createParser(is)) {
      while (parser.hasNext()) {
          JsonParser.Event e = parser.next();
         if (e == JsonParser.Event.KEY_NAME) {
              switch (parser.getString()) {
                 case "DayHighestPrice":
                    parser.next();
                    System.out.print("DayHighestPrice: ");
                    price=parser.getString();
                    System.out.println(price);
                    priceMap.put("DayHighestPrice",price);
                    break;
                case "DayLowestPrice":
                    parser.next();
                    System.out.print("DayLowestPrice: ");
                    price=parser.getString();
                    System.out.println(price);
                    System.out.println("---------");
                    priceMap.put("DayLowestPrice", price);
                    break;
                case "CurrentLowestOfferPrice":
                    parser.next();
                    System.out.print("CurrentLowestOfferPrice: ");
                    price=parser.getString();
                    System.out.println(price);
                    System.out.println("---------");
                    priceMap.put("CurrentLowestOfferPrice", price);
                    break;
                 case "CurrentHighestBidPrice":
                    parser.next();
                    price=parser.getString();
                    System.out.print("CurrentHighestBidPrice: ");
                    System.out.println(price);
                    priceMap.put("CurrentHighestBidPrice", price);
                    break;
                  case "LastPrice":
                    parser.next();
                    System.out.print("LastPrice: ");
                    price=parser.getString();
                    System.out.println(price);
                    System.out.println("---------");
                    priceMap.put("LastPrice", price);
                    break;
             }
         }
     }
 }
    
   return priceMap; 
}
  public static Map<String,Double> getOrder() throws MalformedURLException, IOException {
       Map<String,Double>orderMap = new HashMap();
        URL url = new URL("https://api.independentreserve.com/Public/GetOrderBook?primaryCurrencyCode=xbt&secondaryCurrencyCode=aud");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
             JsonObject orderObject =reader.readObject();
            
            JsonArray buyArray = orderObject.getJsonArray("BuyOrders");
            double buy1Price= buyArray.getJsonObject(0).getJsonNumber("Price").doubleValue();
            orderMap.put("buyPrice", buy1Price);
            double buy1Volume=buyArray.getJsonObject(0).getJsonNumber("Volume").doubleValue();
            orderMap.put("buyVolume", buy1Volume);
            
            
            
            JsonArray sellArray = orderObject.getJsonArray("SellOrders");
            double sell1Price= sellArray.getJsonObject(0).getJsonNumber("Price").doubleValue();
            orderMap.put("sellPrice", sell1Price);
            double sell1Volume=sellArray.getJsonObject(0).getJsonNumber("Volume").doubleValue();
            orderMap.put("sellVolume", sell1Volume);
            reader.close();
            
            
        }
       return orderMap; 
  }    
}
