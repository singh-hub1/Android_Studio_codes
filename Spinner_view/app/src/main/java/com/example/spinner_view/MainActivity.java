package com.example.spinner_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String []arr={"vishal","arya","aditi","swati"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner myspin=(Spinner) findViewById(R.id.spin);


        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arr);

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspin.setAdapter(myAdapter);
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {

        Toast.makeText(getApplicationContext(),arr[i],
                Toast.LENGTH_LONG)
                .show();
    }

    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }
}