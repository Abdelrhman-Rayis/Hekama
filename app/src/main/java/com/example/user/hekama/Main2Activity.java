package com.example.user.hekama;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle pickedData = getIntent().getExtras();
        if(pickedData == null){
            return;
        }
        String recivedHekama = pickedData.getString("good Hekama");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(recivedHekama);
    }
}
