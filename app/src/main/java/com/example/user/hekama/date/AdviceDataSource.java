package com.example.user.hekama.date;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Abdelrhman Osama Rayis on 11/7/2016.
 */

public class AdviceDataSource {
    private static final String PREFKEY = "Advices";
    private SharedPreferences advicePrefs;

    public AdviceDataSource(Context context){
        advicePrefs = context.getSharedPreferences(PREFKEY, Context.MODE_PRIVATE);
    }
    public List<AdviceItem> findAll(){
        // I used method getAll() so that i can retive a data form sharedpref objcts and set in map object
        Map<String, ?> adviceMap = advicePrefs.getAll();

        SortedSet<String> keys = new TreeSet<String>(adviceMap.keySet());
 List<AdviceItem> AdviceList = new ArrayList<AdviceItem>();
        for (String key: keys){
            AdviceItem advice = new AdviceItem();
            advice.setKey(key);
            advice.setText((String) adviceMap.get(key));
            AdviceList.add(advice);
        }

        return AdviceList;


    }
    public boolean update(AdviceItem advice){
        SharedPreferences.Editor editor = advicePrefs.edit();
        editor.putString(advice.getKey(), advice.getText());
        editor.commit();
        return true;
    }

    public boolean remove(AdviceItem advice) {
        if (advicePrefs.contains(advice.getKey())) {


            SharedPreferences.Editor editor = advicePrefs.edit();
            editor.remove(advice.getKey());
            editor.commit();
        }
        return true;
    }

}
