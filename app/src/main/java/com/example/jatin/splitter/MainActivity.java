package com.example.jatin.splitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //define variables to the widget
    private Button addMoneyButton;
    private Button totalMoneyButton;
    private Button viewMyShareButton;
    private Button moneyBorrowedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get references to the widget
        addMoneyButton = (Button) findViewById(R.id.addMoneyButton);
        totalMoneyButton =(Button) findViewById(R.id.totalMoneyButton);
        viewMyShareButton = (Button) findViewById(R.id.viewMyShareButton);
        moneyBorrowedButton = (Button) findViewById(R.id.moneyBorrowedButton);

        addMoneyButton.setOnClickListener(this);
        totalMoneyButton.setOnClickListener(this);
        viewMyShareButton.setOnClickListener(this);
        moneyBorrowedButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.addMoneyButton){
            Intent i =new Intent(MainActivity.this,AddMoney.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.viewMyShareButton){
            Intent i = new Intent(MainActivity.this,ViewMyShare.class);
            startActivity(i);
        }
    }
}
