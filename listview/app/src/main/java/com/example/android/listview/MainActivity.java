package com.example.android.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.listview.ColorActivity;
import com.example.android.listview.FamilyActivity;
import com.example.android.listview.NumberActivity;
import com.example.android.listview.R;

public class MainActivity extends AppCompatActivity {

   /** @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openNumberList(View view){
        Intent in = new Intent(this, NumberActivity.class);
        startActivity(in);

    }
    public void openfamilyList(View view){
        Intent in = new Intent(this, FamilyActivity.class);
        startActivity(in);

    }
    public void opencolorList(View view){
        Intent in = new Intent(this, ColorActivity.class);
        startActivity(in);

    }
    public void openphraseList(View view){
        Intent in = new Intent(this,Phrasectivity.class);
        startActivity(in);

    }**/
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);

       // Set the content of the activity to use the activity_main.xml layout file
       setContentView(R.layout.activity_main);

       // Find the View that shows the numbers category
       TextView numbers = (TextView) findViewById(R.id.numbers);

       // Set a click listener on that View
       numbers.setOnClickListener(new View.OnClickListener() {
           // The code in this method will be executed when the numbers category is clicked on.
           @Override
           public void onClick(View view) {
               // Create a new intent to open the {@link NumbersActivity}
               Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);

               // Start the new activity
               startActivity(numbersIntent);
           }
       });

       // Find the View that shows the family category
       TextView family = (TextView) findViewById(R.id.family);

       // Set a click listener on that View
       family.setOnClickListener(new View.OnClickListener() {
           // The code in this method will be executed when the family category is clicked on.
           @Override
           public void onClick(View view) {
               // Create a new intent to open the {@link FamilyActivity}
               Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

               // Start the new activity
               startActivity(familyIntent);
           }
       });

       // Find the View that shows the colors category
       TextView colors = (TextView) findViewById(R.id.colors);

       // Set a click listener on that View
       colors.setOnClickListener(new View.OnClickListener() {
           // The code in this method will be executed when the colors category is clicked on.
           @Override
           public void onClick(View view) {
               // Create a new intent to open the {@link ColorsActivity}
               Intent colorsIntent = new Intent(MainActivity.this, ColorActivity.class);

               // Start the new activity
               startActivity(colorsIntent);
           }
       });

       // Find the View that shows the phrases category
       TextView phrases = (TextView) findViewById(R.id.phrases);

       // Set a click listener on that View
       phrases.setOnClickListener(new View.OnClickListener() {
           // The code in this method will be executed when the phrases category is clicked on.
           @Override
           public void onClick(View view) {
               // Create a new intent to open the {@link PhrasesActivity}
               Intent phrasesIntent = new Intent(MainActivity.this, Phrasectivity.class);

               // Start the new activity
               startActivity(phrasesIntent);
           }
       });
   }



}
