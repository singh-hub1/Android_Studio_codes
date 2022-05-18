package com.example.auto_complete_text_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] arr={"vishal singh","aditi sharma","jyoti singh","swati singh","ginny singh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView auto=(AutoCompleteTextView) findViewById(R.id.attv);

        ArrayAdapter<String> ada=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,arr);

        auto.setThreshold(2);
        auto.setAdapter(ada);
    }
}