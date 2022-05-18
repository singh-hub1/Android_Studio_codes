package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t=(TextView) findViewById(R.id.text_view);
        registerForContextMenu(t);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.my_menu,menu);
    }

    public boolean onContextItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id==R.id.settings)
        {
            Intent i=new Intent(this,Settings.class);
            startActivity(i);

        }

        if(id==R.id.wit)
        {
            Intent i=new Intent(this,withdrawl.class);
            startActivity(i);

        }

        if(id==R.id.credit)
        {
            Intent i=new Intent(this,Credit.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}