package com.example.date_picker_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        DatePicker dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=(DatePicker) findViewById(R.id.date);

        Toast.makeText(getBaseContext(),(dp.getMonth()+1)+"/"+dp.getDayOfMonth()+"/"+dp.getYear(),Toast.LENGTH_SHORT).show();
    }
}