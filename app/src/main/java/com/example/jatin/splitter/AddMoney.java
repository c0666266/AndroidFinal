package com.example.jatin.splitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


/**
 * Created by jatin on 03-04-2016.
 */
public class AddMoney extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_money);
    }

    public void onButtonClick(View v){

        if(v.getId() == R.id.AddMoneyButton2)
        {
            Intent i =new Intent(AddMoney.this,ViewMyShare.class);
            startActivity(i);
        }
    }
}
