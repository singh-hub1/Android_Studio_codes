package com.example.myapplication;

import android.app.Activity;
import android.app.AlarmManager ;
import android.app.PendingIntent ;
import android.content.Intent ;
import android.os.Bundle ;
//import android.support.v7.app.AppCompatActivity ;
import android.view.View ;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Calendar ;



public class MainActivity extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super .onCreate(savedInstanceState) ;
        setContentView(R.layout. activity_main ) ;

        Spinner myspin=(Spinner) findViewById(R.id.spin);

        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspin.setAdapter(myAdapter);

    }
    public void createNotification (View view) {
        Intent myIntent = new Intent(getApplicationContext() , NotifyService. class ) ;
        AlarmManager alarmManager = (AlarmManager) getSystemService( ALARM_SERVICE ) ;
        PendingIntent pendingIntent = PendingIntent. getService ( this, 0 , myIntent , 0 ) ;
        Calendar calendar = Calendar. getInstance () ;
        calendar.set(Calendar. SECOND , 0 ) ;
        calendar.set(Calendar. MINUTE , 0 ) ;
        calendar.set(Calendar. HOUR , 0 ) ;
        calendar.set(Calendar. AM_PM , Calendar. AM ) ;
        calendar.add(Calendar. DAY_OF_MONTH , 1 ) ;
        alarmManager.setRepeating(AlarmManager. RTC_WAKEUP , calendar.getTimeInMillis() , 1000 * 60 * 60 * 24 , pendingIntent) ;
    }
}