package com.example.jatin.splitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        if(v.getId()== R.id.AddMoneyButton)
        {
            Intent i = new Intent(MainActivity.this,AddMoney.class);
            startActivity(i);
        }

        else if(v.getId()== R.id.ViewMyShareButton)
        {
            Intent i = new Intent(MainActivity.this,ViewMyShare.class);
            startActivity(i);
        }

    }
}
