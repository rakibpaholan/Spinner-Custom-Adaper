package com.example.myspinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CoustomAdapter extends BaseAdapter {

     Context context;
     String [] country_name;
     int [] flags;
    private LayoutInflater layoutInflater;

    CoustomAdapter(Context context, String [] country_name, int [] flags){
        this.context = context;
        this.country_name  = country_name;
        this.flags = flags;
    }


    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null){
            layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.resource_directory,null,false);
        }
        ImageView imageView;
        imageView = (ImageView)view.findViewById(R.id.resource_image);

        TextView textView;
        textView = (TextView)view.findViewById(R.id.textViewTitleId);

        imageView.setImageResource(flags[position]);
        textView.setText(country_name[position]);

        return view;
    }
}
