package com.abhishek.unitconverter;

import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
    ImageButton tempbutton;
    ImageButton lengthbutton;
    ImageButton massbutton;
    ImageButton speedbutton;
    ImageButton currencybutton;
    ImageButton storagebutton;
    TextView textViewselect,textViewtemp,textViewlen,textViewweight,textViewspeed,textViewcurrency,textViewstorage;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tempbutton=(ImageButton) findViewById(R.id.tempbutton);
        lengthbutton=(ImageButton) findViewById(R.id.lengthbutton);
        massbutton=(ImageButton) findViewById(R.id.massbutton);
        speedbutton=(ImageButton) findViewById(R.id.speedbutton);
        currencybutton=(ImageButton) findViewById(R.id.currencybutton);
        storagebutton=(ImageButton) findViewById(R.id.storagebutton);
        textViewselect=(TextView) findViewById(R.id.textViewselect);
        textViewtemp=(TextView) findViewById(R.id.textViewtemp);
        textViewlen=(TextView) findViewById(R.id.textViewlen);
        textViewweight=(TextView) findViewById(R.id.textViewweight);
        textViewspeed=(TextView) findViewById(R.id.textViewspeed);
        textViewcurrency=(TextView) findViewById(R.id.textViewcurrency);
        textViewstorage=(TextView) findViewById(R.id.textViewstorage);
        textViewselect.setText("Select Conversion Parameter");
        textViewtemp.setText("Temperature");
        textViewlen.setText("     Length");
        textViewweight.setText("         Weight");
        textViewspeed.setText("           Speed");
        textViewcurrency.setText("         Currency");
        textViewstorage.setText("   Digital Storage");
        
        tempbutton.setOnClickListener(new OnClickListener() 
        {	
        	@Override
			public void onClick(View arg0) 
			{
				Intent i=new Intent(MainActivity.this, Temperature.class);
				startActivity(i);	
			}
		});
        
         lengthbutton.setOnClickListener(new OnClickListener()
         {
			 @Override
			public void onClick(View v) {
			    Intent i=new Intent(MainActivity.this, Length.class);
				startActivity(i);	
			}
		});
         
         massbutton.setOnClickListener(new OnClickListener() 
         {	
			@Override
			public void onClick(View v)
			{
				Intent i=new Intent(MainActivity.this, Mass.class);
				startActivity(i);		
			}
		});
         
         speedbutton.setOnClickListener(new OnClickListener()
         {	
			@Override
			public void onClick(View v) 
			{
				Intent i=new Intent(MainActivity.this, Speed.class);
				startActivity(i);		
				
			}
		});
        
         currencybutton.setOnClickListener(new OnClickListener() 
         {	
			@Override
			public void onClick(View v) {
				Intent i=new Intent(MainActivity.this, Currency.class);
				startActivity(i);
				
			}
		});
         
         storagebutton.setOnClickListener(new OnClickListener() 
         {
			@Override
			public void onClick(View v) 
			{
				Intent i=new Intent(MainActivity.this, DigitalStorage.class);
				startActivity(i);
			}
		});
    }
}
