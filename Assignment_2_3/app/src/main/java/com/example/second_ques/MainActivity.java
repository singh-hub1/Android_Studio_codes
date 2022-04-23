package com.example.second_ques;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.stud_name);
        t2=(TextView) findViewById(R.id.dob);
        t3=(TextView) findViewById(R.id.addr);
        t4=(TextView) findViewById(R.id.mail_id);
        t5=(TextView) findViewById(R.id.stud_class);
        bt1=(Button)findViewById(R.id.btn_clk);

    }
    public void submitRequest(View v)
    {
        String str1=t1.getText().toString();
        String d1=t2.getText().toString();
        String str3=t3.getText().toString();
        String str4=t4.getText().toString();
        String str5=t5.getText().toString();

        Intent i=new Intent(MainActivity.this,home_activity.class);
        i.putExtra("k1",str1);
        i.putExtra("k2",d1);
        i.putExtra("k3",str3);
        i.putExtra("k4",str4);
        i.putExtra("k5",str5);
        startActivity(i);
    }
}