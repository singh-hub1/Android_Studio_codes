package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.email);
        e2=(EditText) findViewById(R.id.pass);
        btn=(Button) findViewById(R.id.btn_clk);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=e1.getText().toString();
                String str2=e2.getText().toString();
                String str3="login Successful";
                if(str1.equals("vishal")&&str2.equals("singh"))
                {
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,HomeActivity.class);
//                    i.putExtra("name",str1);
//                    i.putExtra("password",str2);
                    i.putExtra("msgs",str3);
                    startActivity(i);
                }
                else if (TextUtils.isEmpty(str1) && TextUtils.isEmpty(str2))
                {
                    Toast.makeText(MainActivity.this, "Please enter user name and password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Incorrect information", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}