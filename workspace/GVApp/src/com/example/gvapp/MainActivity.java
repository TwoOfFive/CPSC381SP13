package com.example.gvapp;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    //Drew: Will eventually create an intent that is passed through startActivity to open the club list.
    //Drew: Or we could populate the list with clubs that calls a function listing only it's events when clicked.
    public void ClubTab(View view){
    	
    }

    
}
