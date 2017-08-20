package iotapps.intentsample;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        onclicklisterforbutton();

    }

    public void onclicklisterforbutton()
    {
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {

                // basic Intents
                context = getApplication().getBaseContext();
                Intent intent = new Intent(context,SecondActivity.class);

                //startActivity(intent);


                //advanced Intents
                String url = "http://www.techval.org";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                //startActivity(i);


                //Passing some values to another activity
                Intent valueintent = new Intent(context,SecondActivity.class);
                valueintent.putExtra("firstval","One strring");
                valueintent.putExtra("Secondval","two String");

                startActivity(valueintent);





            }
        });
    }
}
