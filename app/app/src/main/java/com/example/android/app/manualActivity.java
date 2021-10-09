package com.example.android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class manualActivity extends AppCompatActivity {
private int quantity=0;
    private int quantity2=0;
    private int quantity3=0;
    private  int quantity4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
    }
    public void submitOrder(View view) {
        CheckBox ece103=(CheckBox)findViewById(R.id.ece_103);
        boolean hasece103=ece103.isChecked();
        CheckBox eie201= (CheckBox) findViewById(R.id.eie_201);
        boolean haseie201 = eie201.isChecked();
        CheckBox ece203= (CheckBox) findViewById(R.id.ece_203);
        boolean hasece203= ece203.isChecked();
        CheckBox eie302= (CheckBox) findViewById(R.id.eie_302);
        boolean haseie302= eie302.isChecked();




        int price =calculateprice(hasece103,haseie201,hasece203,haseie302);



        String priceMessage= ordersummary(price,hasece103,haseie201,hasece203,haseie302);
        displayMessage(priceMessage);

    }
    public String ordersummary(int price,boolean addece103,boolean addeie201,boolean addece203,boolean addeie302){


        String pricemessage="\nPrice:"+price;

        return pricemessage;

    }


    public int calculateprice(boolean addece103,boolean addeie201,boolean addece203,boolean addeie302)
    {
        int baseprice=0;
    ;

        if(addece103)
            baseprice=baseprice+50;
        if (addeie201)
            baseprice=baseprice+60;
        if (addece203)
            baseprice=baseprice+70;
        if (addeie302)
            baseprice=baseprice+80;
        int price=quantity*baseprice;
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
