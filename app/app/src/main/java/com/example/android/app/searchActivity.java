package com.example.android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class searchActivity extends AppCompatActivity {
    AutoCompleteTextView suggestion_box;
    Spinner items;
    String string;
    TextView tvDisplay;
    ArrayList<String> things=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        suggestion_box=(AutoCompleteTextView)findViewById(R.id.suggestion_box);
        items=(Spinner) findViewById(R.id.items);
        things.add("ECE103");
        things.add("EIE201");
        things.add("ECE203");
        things.add("EIE302");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(searchActivity.this,android.R.layout.simple_spinner_dropdown_item,things);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(searchActivity.this,android.R.layout.simple_spinner_dropdown_item,things);
        suggestion_box.setAdapter(adapter);
        items.setAdapter(adapter1);

        suggestion_box.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // fetch the user selected value
                String item = parent.getItemAtPosition(position).toString();

                // create Toast with user selected value
                Toast.makeText(searchActivity.this, "Selected Item is: \t" + item, Toast.LENGTH_LONG).show();

                // set user selected value to the TextView
                tvDisplay.setText(item);

                string = item;


                //   Object item = parent.getItemAtPosition(position);
                // if(item instanceof Word){
                //   Word word =(Word) item;


                for (int i = 0; i < things.size(); i++) {
                    if (item.equals(things.get(i))) {
                        Intent searchintent = new Intent(searchActivity.this, manualActivity.class);
                        searchintent.putExtra("String_Selected", item);
                        startActivity(searchintent);


                    }


                }
            }
        });
    }
}