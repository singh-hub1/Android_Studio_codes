package com.example.time_picker_view;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TimePicker tp;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tp=(TimePicker) findViewById(R.id.tp);
        tp.setIs24HourView(true);

        Toast.makeText(getApplicationContext(),"Time selected :: "+tp.getHour()+" :: "+tp.getMinute(),Toast.LENGTH_SHORT).show();
    }
}