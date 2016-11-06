package com.example.user.hekama.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by
 * Abdelrhman Osama Rayis
 * on 11/6/2016.
 */

public class AdviceItem {

    String key;
    String text;
    // creating the setters and the getters for the key and text
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public static AdviceItem getNew(){
        Locale locale = new Locale("en_US");
        Locale.setDefault(locale);

        String pattern = "yyyy-MM--dd HH:mm:ss Z";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String Key = formatter.format(new Date());

        AdviceItem Advice = new AdviceItem();
        Advice.setKey(Key);
        Advice.setText("");
        return Advice;

    }




}
