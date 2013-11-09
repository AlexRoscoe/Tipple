package com.example.tipple;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TimePicker;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Collect form data. 
				final NumberPicker numberOfBeers = (NumberPicker) findViewById(R.id.numberOfBeer);
				final TimePicker finishTime = (TimePicker) findViewById(R.id.finishTime); 
				
				
				// Start new Intent (Your activity)
				Intent thing = new Intent(); 
				
				// Package data
				// Start intent
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
