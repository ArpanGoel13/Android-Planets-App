package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter( ArrayList<Planet> planetArrayList, Context context) {
        super(context, R.layout.my_item_list, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planets = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if(convertView==null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.my_item_list, parent, false);
            viewHolder.planetName = (TextView)convertView.findViewById(R.id.textView);
            viewHolder.moonCount = (TextView)convertView.findViewById(R.id.textView2);
            viewHolder.planetImage = (ImageView)convertView.findViewById(R.id.imgView);
            result = convertView;
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;

        }
        viewHolder.planetName.setText(planets.getPlanetName());
        viewHolder.moonCount.setText(planets.getMoonCount());
        viewHolder.planetImage.setImageResource(planets.getImageRes());
        return result;
    }

    static class ViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImage;

    }
}
