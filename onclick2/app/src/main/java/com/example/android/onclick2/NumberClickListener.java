package com.example.android.onclick2;
import android.view.View;
import android.widget.Toast;


public class NumberClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of number",Toast.LENGTH_SHORT).show();
    }
}
