/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.stream.JsonParser;

/**
 *
 * @author 000988555
 */
public class BitCoin {
    
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
                 case "CurrentHighestBidPrice":
                    parser.next();
                    price=parser.getString();
                    System.out.print("CurrentHighestBidPrice: ");
                    System.out.println(price);
                    priceMap.put("CurrentHighestBidPrice", price);
                    break;
             }
         }
     }
 }

   return priceMap; 
}
}
