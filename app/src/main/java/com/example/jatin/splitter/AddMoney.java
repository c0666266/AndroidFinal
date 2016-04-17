package com.example.jatin.splitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



/**
 * Created by jatin on 03-04-2016.
 */
public class AddMoney extends Activity implements View.OnClickListener {

    //define variables to the widget
    private TextView descriptionTextView;
    private EditText descriptionEditText;
    private EditText enterMoneyEditText;
    private Button addMoneyButton2;

    private String billAmountString = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_money);

        descriptionEditText = (EditText) findViewById(R.id.descriptionEditText);
        enterMoneyEditText = (EditText) findViewById(R.id.enterMoneyEditText);
        addMoneyButton2 = (Button) findViewById(R.id.addMoneyButton2);

        addMoneyButton2.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
    //get the bill amount
        billAmountString = enterMoneyEditText.getText().toString();
    // convert bill amount to float
        float billAmount;
        if (billAmountString.equals("")) {
            billAmount = 0;
        }
        else {
            billAmount = Float.parseFloat(billAmountString);
        }
    // split the total billAmount
        float splitAmount = 0;
        splitAmount = billAmount/2;

    }
}
