package com.example.planet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetsArrayList;
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        planetsArrayList = new ArrayList<>();
        Planet planet1 = new Planet("Mercury","0",R.drawable.mercury);
        Planet planet2 = new Planet("Venus","0",R.drawable.venus);
        Planet planet3 = new Planet("Earth","1",R.drawable.earth);
        Planet planet4 = new Planet("Mars","2",R.drawable.mars);
        Planet planet5 = new Planet("Jupiter","95",R.drawable.jupiter);
        Planet planet6 = new Planet("Sturn ","146",R.drawable.saturn);
        Planet planet7 = new Planet("Uranus","28",R.drawable.uranus);
        Planet planet8 = new Planet("Neptune","16",R.drawable.neptune);
        Planet planet9 = new Planet("Pluto","5",R.drawable.pluto);
        planetsArrayList.add(planet1);
        planetsArrayList.add(planet2);
        planetsArrayList.add(planet3);
        planetsArrayList.add(planet4);
        planetsArrayList.add(planet5);
        planetsArrayList.add(planet6);
        planetsArrayList.add(planet7);
        planetsArrayList.add(planet8);
        planetsArrayList.add(planet9);
        adapter =new MyCustomAdapter(planetsArrayList,getApplicationContext());
        listView.setAdapter(adapter);

    }
}