/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConvert;

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
public class CurrencyRate {
    public static Map<String,Double> getRate() throws MalformedURLException, IOException {
        Map<String,Double>rateMap = new HashMap();
        URL url = new URL("http://api.fixer.io/latest?base=USD");
         InputStream is = url.openStream();
        try (JsonReader reader = Json.createReader(is)) {
            JsonObject currencyObject =reader.readObject();
            
            
            JsonObject rateObject = currencyObject.getJsonObject("rates");
            String aud ="AUD";
            double audRate = rateObject.getJsonNumber("AUD").doubleValue();
            rateMap.put("AUD", audRate);
            String cny ="CNY";
            double cnyRate = rateObject.getJsonNumber("CNY").doubleValue();
            rateMap.put("CNY", cnyRate);
            rateMap.put("USD",1.00);
        }
       return rateMap; 
}
}
