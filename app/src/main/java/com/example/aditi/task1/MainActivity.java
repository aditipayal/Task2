package com.example.aditi.task1;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
   Button b1,b2,b3,b4,b5;
   EditText ed1,ed2,ed3,ed4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i =  new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
        t2 = (TextView)findViewById(R.id.textView2);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast toast = Toast.makeText(MainActivity.this,"This is a toast mesaage",Toast.LENGTH_SHORT);
                toast.setMargin(50,50);
                toast.show();
            }
        });
        ed1= (EditText)findViewById(R.id.editText2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String name = ed1.getText().toString();
            }
        });
        ed2 = (EditText) findViewById(R.id.editText10);
        ed3 = (EditText) findViewById(R.id.editText11);
        ed4 = (EditText) findViewById(R.id.editText12);
        final int mnum1 = ed2.getInputType();
        final int mnum2 = ed3.getInputType();
        b4 = (Button) findViewById(R.id.button3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int res = mnum1+mnum2;
                ed4.setText(Integer.toString(res));

            }
        });
        b5 = (Button) findViewById(R.id.button3);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();
                System.exit(0);

            }
        });

    }


}
