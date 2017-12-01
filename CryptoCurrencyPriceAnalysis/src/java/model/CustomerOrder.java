/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author Alan Sun
 */
public class CustomerOrder {
    
    private int orderid;
    private String cryptoName;
    private String exchange;
    private double tradingFee;
    private String fiat;
    private String orderType;
    private double amount;
    private double price;
   private String time;
    private int custId;

    public CustomerOrder(int orderid, String cryptoName, String exchange, double tradingFee, String fiat, String orderType, double amount, double price, String time, int custId) {
        this.orderid = orderid;
        this.cryptoName = cryptoName;
        this.exchange = exchange;
        this.tradingFee = tradingFee;
        this.fiat = fiat;
        this.orderType = orderType;
        this.amount = amount;
        this.price = price;
        this.time = time;
        this.custId = custId;
    }
    
    

    public CustomerOrder(String cryptoName, String exchange, double tradingFee, String fiat, String orderType, double amount, double price, String time) {
      //  this.orderid = orderid;
        this.cryptoName = cryptoName;
        this.exchange = exchange;
        this.tradingFee = tradingFee;
        this.fiat = fiat;
        this.orderType = orderType;
        this.amount = amount;
        this.price = price;
        this.time = time;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }
    
    
    

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public double getTradingFee() {
        return tradingFee;
    }

    public void setTradingFee(double tradingFee) {
        this.tradingFee = tradingFee;
    }

    public String getFiat() {
        return fiat;
    }

    public void setFiat(String fiat) {
        this.fiat = fiat;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "orderid=" + orderid + ", cryptoName=" + cryptoName + ", exchange=" + exchange + ", tradingFee=" + tradingFee + ", fiat=" + fiat + ", orderType=" + orderType + ", amount=" + amount + ", price=" + price + ", time=" + time ;
    }
    
    
    
    
    
}
