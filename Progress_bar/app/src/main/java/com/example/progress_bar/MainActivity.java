package com.example.progress_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private static int progress;

    private int progressStatus;
    private Handler hand=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = 0;
        ProgressBar p=(ProgressBar) findViewById(R.id.pb1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(progressStatus<10)
                    progressStatus=doSomeWork();
                hand.post(new Runnable() {
                    @Override
                    public void run() {
                        p.setVisibility(View.GONE);
                    }
                });
            }
            private int doSomeWork()
            {
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                return ++progress;
            }
        }).start();
    }
}