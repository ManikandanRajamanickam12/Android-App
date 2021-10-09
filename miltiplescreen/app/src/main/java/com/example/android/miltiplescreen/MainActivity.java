package com.example.android.miltiplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android.miltiplescreen.FamilyActivity;
import com.example.android.miltiplescreen.NumberActivity;
import com.example.android.miltiplescreen.R;
import com.example.android.miltiplescreen.colorActivity;
import com.example.android.miltiplescreen.phraseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
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
        Intent in = new Intent(this, colorActivity.class);
        startActivity(in);

    }
    public void openphraseList(View view){
        Intent in = new Intent(this, phraseActivity.class);
        startActivity(in);

    }



}
