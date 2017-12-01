/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ExchangesInterface.BitFinex;
import ExchangesInterface.BitStamp;
import ExchangesInterface.BtcMarkets;
import ExchangesInterface.IR;
import ExchangesInterface.Market;
import ExchangesInterface.Wex;
import java.util.HashMap;

/**
 *
 * @author xiaoh
 */
public class MarketData {
  public static final   String[]  MARKETSARRAY={"Wex","BtcMarkets","BitStamp","BitFinex","IR"};

  
  private String[]  markets;
  private HashMap<String,Market> dataInf =new HashMap();
  public MarketData(){
      markets=MARKETSARRAY;
      for(String market :markets){
          switch(market){
              case "Wex": Market m= new Wex();
                          dataInf.put(market, m);
                  break;
          }
            switch(market){
              case "BtcMarkets": Market m= new BtcMarkets();
                          dataInf.put(market, m);
                  break;
          }
              switch(market){
              case "BitStamp": Market m= new BitStamp();
                          dataInf.put(market, m);
                  break;
          }
                switch(market){
              case "BitFinex": Market m= new BitFinex();
                          dataInf.put(market, m);
                  break;
          }
                  switch(market){
              case "IR": Market m= new IR();
                          dataInf.put(market, m);
                  break;
          }
          
      }
      
  }
  
    public String[] getMarkets() {
        return markets;
    }

    public void setMarkets(String[] markets) {
        this.markets = markets;
    }

    public HashMap<String, Market> getDataInf() {
        HashMap<String,Market> marketData = new HashMap();
        marketData =dataInf;
        return marketData;
    }

    public void setDataInf(HashMap<String, Market> dataInf) {
        this.dataInf = dataInf;
    }
  
  
}
