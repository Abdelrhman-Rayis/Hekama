package com.example.user.hekama;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle pickedData = getIntent().getExtras();
        Button back = (Button) findViewById(R.id.back);
        if(pickedData == null){
            return;
        }
        String recivedHekama = pickedData.getString("good Hekama");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(recivedHekama);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
