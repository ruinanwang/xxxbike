package com.example.nancy.xbike.model;

import java.util.Random;

/**
 * Created by wangjingbo on 1/21/17.
 */

public class BankCard {
    private String cardNum;
    private String name;

    public BankCard() {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int num3 = rand.nextInt(10);
        int num4 = rand.nextInt(10);
        this.cardNum = "**** **** **** " + num1 + "" + num2 + "" + num3 + "" + num4;
        this.name = "John Smith";
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getName() {
        return name;
    }

}
