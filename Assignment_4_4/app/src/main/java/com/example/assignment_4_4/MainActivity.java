package com.example.assignment_4_4;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends Activity
{
   // GalleryImageAdapter customGalleryAdapter; //usedefind class

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Gallery  simpleGallery = (Gallery) findViewById(R.id.gal);


       ImageView selectedImageView = (ImageView) findViewById(R.id.img);

       simpleGallery.setSpacing(1);

       final GalleryImageAdapter galleryimageadapter=new GalleryImageAdapter(this);
       simpleGallery.setAdapter(galleryimageadapter);

        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
               selectedImageView.setImageResource(galleryimageadapter.images[position]);
            }
        });
    }//end of oncreate()
}



