package com.example.android.network1;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        // Create a fake list of earthquake locations.
        ArrayList<earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new earthquake("8.9", "San Francisco", "Mar16,2010"));
        earthquakes.add(new earthquake("5.2", "London", "oct10,2010"));
        earthquakes.add(new earthquake("6.3", "Tokyo", "dec02,2011"));
        earthquakes.add(new earthquake("1.2", "Mexico City", "jan05,2012"));
        earthquakes.add(new earthquake("7.2", "Moscow", "sep23,2012"));
        earthquakes.add(new earthquake("2.2", "Rio de Janeiro", "jun10,2014"));
        earthquakes.add(new earthquake("8.8", "Paris", "feb25,2016"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        earthquakeAdapter adapter = new earthquakeAdapter(this, earthquakes);
            earthquakeListView.setAdapter(adapter);
        }

    }
