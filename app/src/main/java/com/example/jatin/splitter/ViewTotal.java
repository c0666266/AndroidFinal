package com.example.jatin.splitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jatin on 18-04-2016.
 */
public class ViewTotal extends Activity{

    //define variables to the widget
    private TextView editText1;
    private TextView editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_my_share);
        editText1 = (TextView) findViewById(R.id.editText1);
        editText2 = (TextView) findViewById(R.id.editText2);

        AddMoneyDB addMoneyHandler = new AddMoneyDB(this);
        double val = addMoneyHandler.viewTotal();

        double val2 = addMoneyHandler.viewTotal2();

        editText1.setText(val2 + "");
        editText2.setText(val + "");
    }
}
