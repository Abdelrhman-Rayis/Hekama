package com.example.user.hekama;

import android.app.Activity;
import android.content.Intent;
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
        Button giveAdviceb = (Button) findViewById(R.id.giveAdvice);

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
        giveAdviceb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToadvice();
           }
        });
    }

    private void goToadvice() {
        Intent intent = new Intent(this,GiveAdvice.class);
         startActivity(intent);

    }
}
