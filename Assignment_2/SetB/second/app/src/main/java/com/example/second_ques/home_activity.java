package com.example.second_ques;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class home_activity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        e1=(EditText) findViewById(R.id.h_name);
        e2=(EditText) findViewById(R.id.h_dob);
        e3=(EditText) findViewById(R.id.h_mail_id);
        e4=(EditText) findViewById(R.id.h_addr);
        e5=(EditText) findViewById(R.id.h_stud_class);

        String n1=getIntent().getStringExtra("k1");
        e1.setText(n1);

        String n2=getIntent().getStringExtra("k2");
        e2.setText(n2);

        String n3=getIntent().getStringExtra("k3");
        e1.setText(n3);

        String n4=getIntent().getStringExtra("k4");
        e1.setText(n4);

        String n5=getIntent().getStringExtra("k5");
        e1.setText(n5);
    }
}