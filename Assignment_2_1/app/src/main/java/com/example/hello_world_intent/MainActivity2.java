package com.example.hello_world_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends Activity {

    EditText receive_msg;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        receive_msg=(EditText)findViewById(R.id.et);

        Intent i=getIntent();

        String str=i.getStringExtra("k1");

        receive_msg.setText(str);


    }
}