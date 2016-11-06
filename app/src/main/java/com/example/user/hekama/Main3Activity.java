package com.example.user.hekama;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle pickedData = getIntent().getExtras();
        if(pickedData == null){
            return;
        }
        String hekama = pickedData.getString("Hekama4bad");
        TextView btextView = (TextView) findViewById(R.id.btextView);
        btextView.setText(hekama);

        Button back = (Button) findViewById(R.id.bback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
