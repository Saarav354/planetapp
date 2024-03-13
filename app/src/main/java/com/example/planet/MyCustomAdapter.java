package com.example.planet;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter  extends ArrayAdapter<Planet> {

    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter( ArrayList<Planet> planetArrayList, Context context1) {
        super(context1,R.layout.item_list_layout,planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }
    private static class MyViewHoldder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet= getItem(position);
        MyViewHoldder myViewHoldder;
        final View result;
        if(convertView==null){
            myViewHoldder = new MyViewHoldder();
            LayoutInflater inflater =LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
                    );
            myViewHoldder.planetName = (TextView)  convertView.findViewById(R.id.planetName);
            myViewHoldder.moonCount = (TextView) convertView.findViewById(R.id.moonCount);
            myViewHoldder.planetImg = (ImageView) convertView.findViewById(R.id.planetImage);
           result = convertView;
           convertView.setTag(myViewHoldder);
        }
        else
    {//the view is recyled
        myViewHoldder=(MyViewHoldder) convertView.getTag();

        result = convertView;



        }
        myViewHoldder.planetName.setText(planet.getPlanetName());
        myViewHoldder.moonCount.setText(planet.getMoonCount());
        myViewHoldder.planetImg.setImageResource(planet.getPlanetImage());
        return result;

    }
}

