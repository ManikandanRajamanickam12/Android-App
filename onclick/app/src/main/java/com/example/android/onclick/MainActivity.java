package com.example.android.onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumberClickListener clickListener=new NumberClickListener();
        TextView numbers=(TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(clickListener);
    }
}
