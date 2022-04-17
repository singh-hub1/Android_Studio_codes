package com.example.hello_world_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
TextView t1;
Button btn_clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.txt);
        btn_clk=(Button)findViewById(R.id.send);
    }

    public void sendText(View v)
    {
        String str=t1.getText().toString();
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("k1",str);
        startActivity(i);
    }
}