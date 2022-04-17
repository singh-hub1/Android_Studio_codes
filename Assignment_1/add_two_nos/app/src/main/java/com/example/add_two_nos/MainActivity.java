package com.example.add_two_nos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText nos1,nos2;
    Button add_btn;
    TextView result;
    float ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nos1=(EditText) findViewById(R.id.edit_first_number);
        nos2=(EditText) findViewById(R.id.edit_second_number);
        add_btn=(Button) findViewById(R.id.addition_btn);
        result=(TextView) findViewById(R.id.view_answer);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                double n1 = Double.parseDouble(nos1.getText().toString());
                double n2 = Double.parseDouble(nos2.getText().toString());
                double ans = n1 + n2;
                result.setText(Double.toString(ans));
            }
        });
    }
}