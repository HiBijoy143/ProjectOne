package com.example.projectone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private int[] image;
    private String[] inventor;
    private String[] socialName;
    private Context context;
    public MyAdapter(Context context,int[] image, String[] socialName,String[] inventor ) {
        this.image = image;
        this.socialName = socialName;
        this.context = context;
        this.inventor = inventor;
    }
    @Override
    public int getCount() {
        return socialName.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.design,null, false);
        }
        ImageView imageView = view.findViewById(R.id.imageId);
        TextView textView = view.findViewById(R.id.textId);
        imageView.setImageResource(image[i]);
        textView.setText(socialName[i]);
        TextView textView1 = view.findViewById(R.id.invertortextId);
        textView1.setText(inventor[i]);

        return view;
    }
}
