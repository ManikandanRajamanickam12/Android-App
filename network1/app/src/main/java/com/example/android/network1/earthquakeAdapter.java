package com.example.android.network1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class earthquakeAdapter extends ArrayAdapter<earthquake> {
    public earthquakeAdapter(Context context, List<earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }
        earthquake currentearthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magnitudeView.setText(currentearthquake.getmagnitude());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locationView.setText(currentearthquake.getlocation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        dateView.setText(currentearthquake.getdate());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}








