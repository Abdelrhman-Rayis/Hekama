package com.example.user.hekama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final   Button goodButton =  (Button) (findViewById(R.id.goodButton));
        final String gHekama = "When you give advice try to be cool and alone with out embarrassing the person  . (;";
        final String bHekama = "Be smart don't try to show you'er righ or you wont to judge him or her :) life is not black or white";
        final   Button badButton =    (Button)  (findViewById(R.id.badButton));

        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // badButton.setText(gHekama);
                goTogood(gHekama);
            }
        });
        badButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTogood(bHekama);
            }
        });

    }
    private void goTogood(String hekama){
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("good Hekama",hekama);
        startActivity(intent);
    }
    private void goTobad(String hekama){
        Intent intent = new Intent(this,Main3Activity.class);
        intent.putExtra("Hekama4bad", hekama);
        startActivity(intent);
    }
}
