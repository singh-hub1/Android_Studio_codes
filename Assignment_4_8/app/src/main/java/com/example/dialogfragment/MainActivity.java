package com.example.dialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText name,age,password,email,mob;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        mob = (EditText) findViewById(R.id.mob);
        b = (Button) findViewById(R.id.register);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty()){
                    new MyFrag("Error","Name field is EMPTY").show(getFragmentManager(),"go");
                }
                else if (password.getText().toString().isEmpty()) {
                    new MyFrag("Error","Password field is EMPTY").show(getFragmentManager(),"go");
                }
                else if (age.getText().toString().isEmpty()) {
                    new MyFrag("Error","Age field is EMPTY").show(getFragmentManager(),"go");
                }
               else if (email.getText().toString().isEmpty()) {
                    new MyFrag("Error","Email field is EMPTY").show(getFragmentManager(),"go");
                }
                else if (mob.getText().toString().isEmpty()) {
                    new MyFrag("Error","Mobile field is EMPTY").show(getFragmentManager(),"go");
                }
            }
        });
    }
}