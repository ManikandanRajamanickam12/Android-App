package com.example.android.testapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private  int quantity=0;
private int quantity2=0;
private int quantity3=0;
private  int quantity4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        EditText text=(EditText)findViewById(R.id.namefield);
        String name=text.getText().toString();
        EditText texts=(EditText)findViewById(R.id.year);
        String year=text.getText().toString();



        int price =calculateprice(hasece103,haseie201,hasece203,haseie302);

        int price2 =calculateprice(hasece103,haseie201,hasece203,haseie302);

        int price3 =calculateprice(hasece103,haseie201,hasece203,haseie302);

        String priceMessage= ordersummary(name,year,price,hasece103,haseie201,hasece203,haseie302);

        displayMessage(priceMessage);

    }
    public String ordersummary(String name,String year,int price,boolean addece103,boolean addeie201,boolean addece203,boolean addeie302){
        String pricemessage="Name:"+name;
        String message="yr&dpmt:"+year;
        pricemessage+="\nadd ECE103:"+ addece103;
        pricemessage+="\nadd EIE201:"+addeie201;
        pricemessage+="\nadd ECE203:"+addece203;
        pricemessage+="\nadd EIE302:"+addeie302;
        pricemessage+="\nQuantityECE103:"+quantity;
        pricemessage+="\nQuantityEIE201:"+quantity2;
        pricemessage+="\nQuantityECE203:"+quantity3;
        pricemessage+="\nQuantityEIE302:"+quantity4;
        pricemessage+="\nPrice:"+price;
        pricemessage+="\nThank You";
        return pricemessage;
    }

    public int calculateprice(boolean addece103,boolean addeie201,boolean addece203,boolean addeie302)
    {
        int baseprice=20;
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
        int price2=quantity2*baseprice;
        return price2;
        int price3=quantity3*baseprice;
        return price3;
        int price4=quantity4*baseprice;
        return price4;





    }
    public void increment(View view){

        quantity=1+quantity;
        display(quantity);
    }
    public void decrement(View view){

        quantity=quantity-1;
        display(quantity);
    }
    public void secondincrement(View view){

        quantity2=1+quantity2;
        display2(quantity2);
    }
    public void seconddecrement(View view){

        quantity2=quantity2-1;
        display2(quantity2);
    }
    public void thirdincrement(View view){

        quantity3=1+quantity3;
        display3(quantity3);
    }
    public void thirddecrement(View view){

        quantity3=quantity3-1;
        display3(quantity3);
    }
    public void fourthincrement(View view){

        quantity4=1+quantity4;
        display4(quantity4);
    }
    public void fourthdecrement(View view){

        quantity4=quantity4-1;
        display4(quantity4);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void display2(int number2) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view2);
        quantityTextView.setText("" + number2);
    }
    private void display3(int number3) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view3);
        quantityTextView.setText("" + number3);
    }
    private void display4(int number4) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view4);
        quantityTextView.setText("" + number4);
    }








    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}
