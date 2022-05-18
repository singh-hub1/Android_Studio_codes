package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener {
    String[] cofee=
            {
                    "c","DS","ALGO","os","JAVA","CPP","Python"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner s=(Spinner) findViewById(R.id.sp1);
        s.setOnItemSelectedListener(this);


        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                cofee);

        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        s.setAdapter(ad);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {

        Toast.makeText(getApplicationContext(),cofee[i],
                Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }
}