package com.example.assignment_4_4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryImageAdapter extends BaseAdapter
{
    private Context mcontext;

    public GalleryImageAdapter(Context applicationContext)
    {
       mcontext=applicationContext;
    }

    @Override
    public int getCount()
    {
        return images.length; //here we get total length of the image
    }

    @Override
    public Object getItem(int i)
    {
        return i; //here we get particular item
    }

    @Override
    public long getItemId(int i)
    {
        return i; //here we get id of that particular item
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        ImageView imageView=new ImageView(mcontext);

        imageView.setImageResource(images[i]);

        imageView.setLayoutParams(new Gallery.LayoutParams(210,211));

        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    public Integer[] images = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5};
}
