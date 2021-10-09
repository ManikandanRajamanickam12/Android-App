package com.example.android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class recordActivity extends AppCompatActivity {
private  int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
    }
    public void submitOrder(View view) {
        CheckBox normal=(CheckBox)findViewById(R.id.normal);
        boolean hasnormal=normal.isChecked();
        CheckBox graph= (CheckBox) findViewById(R.id.graph);
        boolean hasgraph = graph.isChecked();
        CheckBox semilog= (CheckBox) findViewById(R.id.semilog);
        boolean hassemilog= semilog.isChecked();


        int price =calculateprice(hasnormal,hasgraph,hassemilog);



        String priceMessage= ordersummary(price,hasnormal,hasgraph,hassemilog);
        displayMessage(priceMessage);

    }
    public String ordersummary(int price,boolean addnormal,boolean addgraph,boolean addsemilog){

       String pricemessage="\nPrice:"+price;

        return pricemessage;

    }


    public int calculateprice(boolean addnormal,boolean addgraph,boolean addsemilog)
    {
        int baseprice=0;
        ;

        if(addnormal)
            baseprice=baseprice+60;
        if (addgraph)
            baseprice=baseprice+60;
        if (addsemilog)
            baseprice=baseprice+60;

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


