package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity
{
    ListView lv;
    String[] arr = {"vishal", "aditi", "arya","swati","jyoti","pooja","sudh","arti","justin"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lst);

        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arr));

    }

    protected void onListItemClick(ListView l,View v,int i,long d)
    {
        Toast.makeText(this, "You have selected :: "+arr[i], Toast.LENGTH_SHORT).show();
    }

}