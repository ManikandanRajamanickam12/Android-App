/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.jjdemo;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


import com.example.android.jjdemo.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price =calculateprice();
        String priceMessage= ordersummary(price);
        displayMessage(priceMessage);

    }
public String ordersummary(int price){
        String pricemessage="Name:Manikandan";
                pricemessage=pricemessage+"\nQuantity:"+quantity;
                pricemessage=pricemessage+"\nPrice:"+price;
                pricemessage=pricemessage+"\nThank You";
                return pricemessage;
}

    public int calculateprice()
    {
        int price=quantity*5;
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
        TextView quantityTextView = (TextView) findViewById(R.id.quantityy_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.pricee_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.pricee_text_view);
        priceTextView.setText(message);
    }
}