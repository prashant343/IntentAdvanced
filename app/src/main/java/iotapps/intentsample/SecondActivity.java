package iotapps.intentsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by prashantkaushik on 10/03/17.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);



        String abc = getIntent().getStringExtra("firstval");
        Log.d("value1   ",abc);

        String abc1 = getIntent().getStringExtra("Secondval");
        Log.d("value2   ",abc1);




    }
}
