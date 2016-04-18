package com.example.jatin.splitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by jatin on 03-04-2016.
 */
public class ViewMyShare extends Activity {

    //define variables to the widget
    private TextView editText1;
    private TextView editText2;
    private TextView editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_my_share);
        editText1 = (TextView) findViewById(R.id.editText1);
        editText2 = (TextView) findViewById(R.id.editText2);
        editText3 = (TextView) findViewById(R.id.editText3);

        Intent intent = getIntent();

        double value = getIntent().getDoubleExtra("amount", 0.0);

        editText1.setText(value+"");
        editText2.setText(value+"");
        editText3.setText(2*value + "");
    }
}
