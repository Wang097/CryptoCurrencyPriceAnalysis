/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConvertRateInterface;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author 000988555
 */
public class CurrencyConvertRateInterface {
    public static Map<String,Double> getRate() throws MalformedURLException, IOException {
        Map<String,Double>rateMap = new HashMap();
        URL url = new URL("http://api.fixer.io/latest?base=USD");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
            JsonObject currencyObject =reader.readObject();
            
            
            JsonObject rateObject = currencyObject.getJsonObject("rates");
            String aud ="AUD";
            double audRate = rateObject.getJsonNumber(aud).doubleValue();
            rateMap.put(aud, audRate);
            System.out.println("AUD: "+audRate);
            String cny ="CNY";
            double cnyRate = rateObject.getJsonNumber(cny).doubleValue();
            rateMap.put(cny, cnyRate);
        }
       return rateMap; 
}
}
