package com.example.user.hekama;
 import android.app.Activity;
 import java.util.List;
 import android.app.ListActivity;
 import android.os.Bundle;
 import android.content.Intent;

 import android.support.annotation.RequiresPermission;
 import android.util.Log;
 import android.view.Menu;
 import android.widget.ArrayAdapter;
 import android.widget.ListView;

 import com.example.user.hekama.date.AdviceItem;
 import com.example.user.hekama.date.AdviceDataSource;
public class GiveAdvice extends Activity {
    private AdviceDataSource dataSource;
   List<AdviceItem> advicesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_advice);
        Bundle pickedData = getIntent().getExtras();
        if(pickedData == null){
            return;
        }


         dataSource = new AdviceDataSource(this);
       refreshDisplay();

    }

    private void refreshDisplay() {
        advicesList = dataSource.findAll();
        ArrayAdapter<AdviceItem> adapter =
                new ArrayAdapter<AdviceItem>(this, android.R.layout.simple_list_item_1,advicesList);


     }

}
