package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends Activity
{

    private int[] images = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5};
    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button previousbtn = (Button) findViewById(R.id.bt_previous);

        Button  nextbtn = (Button) findViewById(R.id.bt_next);

        ImageSwitcher sw = (ImageSwitcher) findViewById(R.id.image_switcher);

        sw.setInAnimation(this, android.R.anim.slide_in_left);
        sw.setOutAnimation(this, android.R.anim.slide_out_right);

        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView()
            {
                ImageView Vw= new ImageView(MainActivity.this);
                Vw.setImageResource(images[position]);
                return Vw;
            }
        });

        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position>0)
                    position--;
                else if(position<0)
                    position = 0;
                sw.setImageResource(images[position]);
            }
        });


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position<images.length)
                    position++;
                if(position>=images.length)
                    position = images.length-1;
                sw.setImageResource(images[position]);
            }
        });
    }//end of oncreate()
}