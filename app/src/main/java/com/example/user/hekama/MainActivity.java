package com.example.user.hekama;

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
        final String gHekama = "When you give advice try to be cool and alone with out embarrassing the person .";
      final   Button badButton =    (Button)  (findViewById(R.id.badButton));

        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badButton.setText(gHekama);
            }
        });
    }
}
