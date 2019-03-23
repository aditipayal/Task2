package com.example.aditi.task1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
    Button b6;
    TextView t4;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layer1);
            b6 = (Button) findViewById(R.id.button8);
            t4 = (TextView)findViewById(R.id.textView3);
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                   Intent i = new Intent(SecondActivity.this,MainActivity.class);
                   startActivity(i);
                }
            });

        }
}
