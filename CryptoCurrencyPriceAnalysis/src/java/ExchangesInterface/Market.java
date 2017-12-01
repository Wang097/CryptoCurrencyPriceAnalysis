/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExchangesInterface;

/**
 *
 * @author xiaoh
 */
public  abstract class Market {
    double buyPrice;
    double buyVolume;
    double sellPrice;
    double sellVolume;
    double lastTadePrice;
    String crytpoType;
  //  public static final double Trading_Rate=0.0025;
 //  private double tradingRate;

//    public Market(double tradingRate) {
//        this.tradingRate =Trading_Rate ;
//    }

//    public double getTradingRate() {
//        return tradingRate;
//    }
//
//    public void setTradingRate(double tradingRate) {
//        this.tradingRate = tradingRate;
//    }
  
    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getBuyVolume() {
        return buyVolume;
    }

    public void setBuyVolume(double buyVolume) {
        this.buyVolume = buyVolume;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(double sellVolume) {
        this.sellVolume = sellVolume;
    }

    public double getLastTadePrice() {
        return lastTadePrice;
    }

    public void setLastTadePrice(double lastTadePrice) {
        this.lastTadePrice = lastTadePrice;
    }

    public String getCrytpoType() {
        return crytpoType;
    }

    public void setCrytpoType(String crytpoType) {
        this.crytpoType = crytpoType;
    }
    
   public  void getDatabuyUrl(String url){}
   public void getData(){}
       
}