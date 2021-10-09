/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.oneto100;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.android.oneto100.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     *
     /**
     * This method displays the given quantity value on the screen.
     */
     public void submitOrder(View view) {
     CheckBox whippedcreamCheckbox=(CheckBox)findViewById(R.id.whipped_cream_checkbox);
     boolean haswhippedcream=whippedcreamCheckbox.isChecked();
     CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
     boolean hasChocolate = chocolateCheckBox.isChecked();
     EditText text=(EditText)findViewById(R.id.namefield);
     String name=text.getText().toString();


     int price =calculateprice(haswhippedcream,hasChocolate);
     String priceMessage= ordersummary(name,price,haswhippedcream,hasChocolate);
     displayMessage(priceMessage);

     }
     public String ordersummary(String name,int price,boolean addwhippedcream,boolean addchocolate){
     String pricemessage="Name:"+name;
     pricemessage+="\nadd whippedCream:"+ addwhippedcream;
     pricemessage+="\nadd chocolate:"+addchocolate;
     pricemessage+="\nQuantity:"+quantity;
     pricemessage+="\nPrice:"+price;
     pricemessage+="\nThank You";
     return pricemessage;
     }

     public int calculateprice(boolean addwhippedcream,boolean addchocolate)
     {
     int baseprice=5;
     if(addwhippedcream)
     baseprice=baseprice+1;
     if (addchocolate)
     baseprice=baseprice+2;
     int price=quantity*baseprice;
     return price;

     }
     public void increment(View view){
         if (quantity == 100) {
             // Show an error message as a toast
             Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
             // Exit this method early because there's nothing left to do
             return;
         }

     quantity=1+quantity;
     display(quantity);
     }
     public void decrement(View view){
         if (quantity == 1) {
             // Show an error message as a toast
             Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
             // Exit this method early because there's nothing left to do
             return;
         }

     quantity=quantity-1;
     display(quantity);
     }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}