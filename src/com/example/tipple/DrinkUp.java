package com.example.tipple;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;

public class DrinkUp extends View {
    private Paint p;
    private int i = 10; 
    private Bitmap bottle; 
    private Bitmap beer; 

    public DrinkUp(Context context) {
        super(context);
        bottle = BitmapFactory.decodeResource(getResources(), R.drawable.beerbottle);
        beer = BitmapFactory.decodeResource(getResources(), R.drawable.slimbeernobackground);
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
		i+=50;
        Display display = this.getDisplay();
		Point size = new Point();
		display.getSize(size);
		int width = size.x;
		int height = size.y;
		p = new Paint(); 
		p.setColor(Color.BLACK);
		
		canvas.drawBitmap(beer, new Rect(0,0,beer.getWidth(), beer.getHeight()), new Rect(0,0, width, height), null);
		canvas.drawRect(new Rect(0, 0, width, i), p);
		canvas.drawBitmap(bottle, new Rect(0,0,bottle.getWidth(), bottle.getHeight()), new Rect(0,0, width, height), null);
    }
}
