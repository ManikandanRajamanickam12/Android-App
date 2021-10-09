package com.example.android.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sheet = (TextView) findViewById(R.id.sheet);

        // Set a click listener on that View
        sheet.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sheetIntent = new Intent(MainActivity.this, sheetActivity.class);

                // Start the new activity
                startActivity(sheetIntent);
            }
        });
        TextView manual = (TextView) findViewById(R.id.manual);

        // Set a click listener on that View
        manual.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent manualIntent = new Intent(MainActivity.this, manualActivity.class);

                // Start the new activity
                startActivity(manualIntent);
            }
        });
        TextView record = (TextView) findViewById(R.id.record);

        // Set a click listener on that View
        record.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent recordIntent = new Intent(MainActivity.this, recordActivity.class);

                // Start the new activity
                startActivity(recordIntent);
            }
        });
        ImageView search = (ImageView) findViewById(R.id.search_icon);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent searchIntent = new Intent(MainActivity.this, searchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });
        ImageView user = (ImageView) findViewById(R.id.user);

        // Set a click listener on that View
        user.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent userIntent = new Intent(MainActivity.this, userActivity.class);

                // Start the new activity
                startActivity(userIntent);
            }
        });

        ImageView card = (ImageView) findViewById(R.id.card);

        // Set a click listener on that View
        card.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cardIntent = new Intent(MainActivity.this, cardActivity.class);

                // Start the new activity
                startActivity(cardIntent);
            }
        });
    }}