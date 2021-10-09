package com.example.android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class sheetActivity extends AppCompatActivity {
private int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet);
    }

    public void submitOrder(View view) {
        CheckBox ten=(CheckBox)findViewById(R.id.ten);
        boolean hasten=ten.isChecked();
        CheckBox twenty = (CheckBox) findViewById(R.id.twenty);
        boolean hastwenty = twenty.isChecked();
        CheckBox thirty= (CheckBox) findViewById(R.id.thirty);
        boolean hasthirty= thirty.isChecked();


        int price =calculateprice(hasten,hastwenty,hasthirty);
        String priceMessage= ordersummary(price);
        displayMessage(priceMessage);

    }
    public String ordersummary(int price){

       String  pricemessage="\nPrice:"+price;

        return pricemessage;
    }

    public int calculateprice(boolean addten,boolean addtwenty,boolean addthirty)
    {
        int baseprice=1;
        if(addten)
            baseprice=baseprice+10;
        if (addtwenty)
            baseprice=baseprice+20;
        if (addthirty)
            baseprice=baseprice+30;
        int price=quantity+baseprice;
        return price;

    }
    public void increment(View view){

        quantity=1+quantity;
        display(quantity);
    }
    public void decrement(View view){

        quantity=quantity-1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}
