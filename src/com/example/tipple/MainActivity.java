package com.example.tipple;

import java.util.Calendar;
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
        
        final Button button = (Button) findViewById(R.id.startButton);
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberOfBeer);
        numberPicker.setMinValue(1); 
        numberPicker.setMaxValue(20);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Collect form data. 
				final NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberOfBeer);
				int numberOfBeers = numberPicker.getValue(); 
				final TimePicker timePicker = (TimePicker) findViewById(R.id.finishTime); 
				// Final time
				int hour = timePicker.getCurrentHour(); // 0 - 23
				int minute = timePicker.getCurrentMinute(); // 0 - 59
				int endMinutes = hour*60*60 + minute*60; 
				
				// Current time
				Calendar c = Calendar.getInstance(); 
				hour = c.get(Calendar.HOUR_OF_DAY); // 0 - 23
				minute = c.get(Calendar.MINUTE); // 0 - 59
				int startMinutes = hour*60*60 + minute*60;
				
				// Start new Intent (DrinkActivity)
				Intent drinkCounter = new Intent(MainActivity.this, DrinkActivity.class); 
				drinkCounter.putExtra("numBeers", numberOfBeers);
				drinkCounter.putExtra("startTime", startMinutes);
				drinkCounter.putExtra("endTime", endMinutes);
				startActivity(drinkCounter); 
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
