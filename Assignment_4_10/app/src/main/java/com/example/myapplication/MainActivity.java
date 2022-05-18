
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
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