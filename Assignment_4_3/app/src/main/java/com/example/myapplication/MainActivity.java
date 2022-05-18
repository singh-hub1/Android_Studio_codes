package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    ToggleButton togglebutton;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        togglebutton= (ToggleButton)findViewById(R.id.toggleButton);

        textview= (TextView)findViewById(R.id.textView);
    }

    public void onToggleClick(View view)
    {
        if (togglebutton.isChecked())
        {
            textview.setText("Toggle is ON");
        }
        else
        {
            textview.setText("Toggle is OFF");
        }
    }
}