package com.example.second_ques;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
EditText E1,E2,E3,E4,E5;
Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=(EditText) findViewById(R.id.stud_name);
        E2=(EditText) findViewById(R.id.dob);
        E3=(EditText) findViewById(R.id.addr);
        E4=(EditText) findViewById(R.id.mail_id);
        E5=(EditText) findViewById(R.id.stud_class);
        bt1=(Button)findViewById(R.id.btn_clk);

    }
    public void submitRequest(View v)
    {
        String str1=E1.getText().toString();
        String d1=E2.getText().toString();
        String str3=E3.getText().toString();
        String str4=E4.getText().toString();
        String str5=E5.getText().toString();

        Intent i=new Intent(MainActivity.this,home_activity.class);
        i.putExtra("k1",str1);
        i.putExtra("k2",d1);
        i.putExtra("k3",str3);
        i.putExtra("k4",str4);
        i.putExtra("k5",str5);
        startActivity(i);
    }
}