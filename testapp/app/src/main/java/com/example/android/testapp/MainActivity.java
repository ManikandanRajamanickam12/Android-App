/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.testapp;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;




import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox ten=(CheckBox)findViewById(R.id.ten);
        boolean hasten=ten.isChecked();
        CheckBox twenty = (CheckBox) findViewById(R.id.twenty);
        boolean hastwenty = twenty.isChecked();
        CheckBox thirty= (CheckBox) findViewById(R.id.thirty);
        boolean hasthirty= twenty.isChecked();
        EditText text=(EditText)findViewById(R.id.namefield);
        String name=text.getText().toString();


        int price =calculateprice(hasten,hastwenty,hasthirty);
        String priceMessage= ordersummary(name,price,hasten,hastwenty,hasthirty);
        displayMessage(priceMessage);

    }
    public String ordersummary(String name,int price,boolean addten,boolean addtwenty,boolean addthirty){
        String pricemessage="Name:"+name;
        pricemessage+="\nadd ten:"+ addten;
        pricemessage+="\nadd twenty:"+addtwenty;
        pricemessage+="\nadd thirty:"+addthirty;
        pricemessage+="\nQuantity:"+quantity;
        pricemessage+="\nPrice:"+price;
        pricemessage+="\nThank You";
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