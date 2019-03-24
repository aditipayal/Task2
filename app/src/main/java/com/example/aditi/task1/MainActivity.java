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
    TextView t1,t2,ed4,ed1;
   Button b1,b2,b3,b4,b5;
   EditText ed2,ed3;
   int num1, num2, num3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
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
                Toast toast = Toast.makeText(MainActivity.this,"This is a toast mesaage",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        ed1= (TextView) findViewById(R.id.editText2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                ed1.setText("Text changed Successfully");
            }
        });
        ed2 = (EditText) findViewById(R.id.editText10);
        ed3 = (EditText) findViewById(R.id.editText11);
        ed4 = (TextView) findViewById(R.id.textView4);
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                num1 = Integer.parseInt(ed2.getText().toString());
                num2 = Integer.parseInt(ed3.getText().toString());
                num3 = num1 + num2;
                ed4.setText("Sum is :"+String.valueOf(num3));

            }
        });
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                System.exit(0);

            }
        });

    }


}
