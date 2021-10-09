package com.example.android.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        //ArrayAdapter<Word > itemadapter=new ArrayAdapter<Word>(this,R.layout.list_item);
        WordAdaptor adaptor=new WordAdaptor(this,words);
        ListView listview=(ListView) findViewById(R.id.list);
        listview.setAdapter(adaptor);
    }
}
