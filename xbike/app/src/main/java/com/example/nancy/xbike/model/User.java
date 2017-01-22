package com.example.nancy.xbike.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by xuruihan on 2016/11/19.
 */
public class User {
    public static final String USERNAME_FIELD = "username";
    public static final String PASSWORD_FIELD = "password";

    String username;
    String password;

    public static ArrayList<BankCard> wallet = new ArrayList<>();

    public static User fromJson(JSONObject jsonObj) throws JSONException{
        //TODO: init necessary fields.
        return new User();
    }

    public static void addCard() {
        wallet.add(new BankCard());
    }

    public static void deleteCard() {
        if (wallet.size() > 0) {
            wallet.remove(0);
        }
    }
}
