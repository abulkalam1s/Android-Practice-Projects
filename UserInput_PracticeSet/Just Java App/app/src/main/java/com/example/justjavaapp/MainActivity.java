package com.example.justjavaapp;
/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

//package com.example.android.justjava;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {

        if (quantity > 100) {
            //Error message to display;
            Toast.makeText(this, "Sorry!,We can't provide more than 100 cups of Coffee.", Toast.LENGTH_LONG).show();
            return; //you can use return type without returning any value in void return type method.
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 1) {
            //Error message to display;
            Toast.makeText(this, "Sorry!,You have to order at least one cup of Coffee.", Toast.LENGTH_LONG).show();
            return; //you can use return type without returning any value in void return type method.
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        // Figure out if the user wants whipped cream topping
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.cB_WhippedCream);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        // Figure out if the user wants chocolate topping
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.cB_Chocolate);
        boolean hasChocolate = chocolateCheckBox.isChecked();

//        // Getting the name from the EditText
        EditText editTextName = findViewById(R.id.et_name);
        String name = editTextName.getText().toString();

        // Calculate the price
        int price = calculatePrice(hasWhippedCream, hasChocolate);

        // Display the order summary on the screen
        String message = createOrderSummary(price, name, hasWhippedCream, hasChocolate);
//      displayMessage(message);
//
        String[] email = {"abulkalamjmt3@gmail.com"};
        String subject = "Order for a Coffee";
//        //composeEmail(email, subject);

        composeEmail(email, subject, message);

        //Maps Intent
//        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
//                Uri.parse("geo:0,0?q=37.423156,-122.084917(" + name + ")"));
//        startActivity(intent);

        //Camera Intent for Photo
//        final int REQUEST_IMAGE_CAPTURE = 1;
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        try {
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//        } catch (ActivityNotFoundException e) {
//            // display error state to the user
//        }


    }

    //Method for passing intent to email app
//    public void composeEmail(String[] addresses, String subject) {
//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
//        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
//        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }

    public void composeEmail(String[] name, String subject, String message){
        Intent email = new Intent(Intent.ACTION_SEND);
       // email.setData(Uri.parse("mailto:")); // only email apps should handle this
        email.putExtra(Intent.EXTRA_EMAIL, name);
        email.putExtra(Intent.EXTRA_SUBJECT, subject);
        email.putExtra(Intent.EXTRA_TEXT, message);

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));
    }


    /**
     * Calculates the price of the order.
     *
     * @return total price
     */
    private int calculatePrice(boolean addWhippedCream, boolean addChocolate) {
        int rate = 5, totalCost = 0;
        if (addWhippedCream == true && addChocolate == true) {
            rate += 2 + 3;
        } else if (addWhippedCream == true) {
            rate += 2;
        } else if (addChocolate == true) {
            rate += 3;
        } else {
            rate = rate;
        }
        totalCost = quantity * rate;
        return totalCost;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /**
     * Create summary of the order.
     *
     * @param price           of the order
     * @param addWhippedCream is whether or not to add whipped cream to the coffee
     * @param addChocolate    is whether or not to add chocolate to the coffee
     * @return text summary
     */
    private String createOrderSummary(int price, String name, boolean addWhippedCream, boolean addChocolate) {
        String priceMessage = "Name: " + name;
        priceMessage += "\nAdd whipped cream? " + addWhippedCream;
        priceMessage += "\nAdd chocolate? " + addChocolate;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }



}