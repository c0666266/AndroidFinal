package com.example.jatin.splitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jatin on 18-04-2016.
 */
public class MoneyBorrowed extends Activity {

    private TextView showAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_borrowed);

        showAmount = (TextView) findViewById(R.id.showAmount);
        AddMoneyDB addMoneyHandler = new AddMoneyDB(this);

        double val = addMoneyHandler.viewTotal();

        showAmount.setText(val + "");
    }
}
