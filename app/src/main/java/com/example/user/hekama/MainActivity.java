package com.example.user.hekama;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.user.hekama.date.AdviceDataSource;
import com.example.user.hekama.date.AdviceItem;

import java.util.List;

public class MainActivity extends Activity {
    private AdviceDataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSource = new AdviceDataSource(this);
        List<AdviceItem> Advices = dataSource.findAll();
        AdviceItem advice = Advices.get(0);
        advice.setText("Updated!");
        dataSource.update(advice);
        Advices = dataSource.findAll();
        advice = Advices.get(0);
        Log.i("Advice", advice.getKey()+ ": " + advice.getText());
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
