package com.example.nancy.xbike.model;

/**
 * Created by wangjingbo on 1/21/17.
 */

public class BankCard {
    private String cardNum;
    private String name;

    public BankCard() {
        this.cardNum = "**** **** **** 1212";
        this.name = "John Smith";
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getNameme() {
        return name;
    }

}
