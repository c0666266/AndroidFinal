package com.example.jatin.splitter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


/**
 * Created by jatin on 03-04-2016.
 */
public class ViewMyShare extends Activity {

    //define variables to the widget
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_my_share);

    }
}
