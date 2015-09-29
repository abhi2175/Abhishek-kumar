package com.abhishek.unitconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Speed extends Activity {
	
	TextView textViewselectspeedparameter;
	Spinner spinnerspeedunit;
	EditText editTextspeedvalue;
	Button convertspeedbutton;
	TextView speedresult;
	String uservalue;
	String str;
	double res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_speed);
		
		final String[] unit={"Km/hr to M/sec","M/sec to km/hr","Km/hr to Miles/hour","Miles/hour to Km/hr"};
		textViewselectspeedparameter=(TextView) findViewById(R.id.textViewselectspeedparameter);
	    spinnerspeedunit=(Spinner) findViewById(R.id.spinnerspeedunit);
	    editTextspeedvalue=(EditText) findViewById(R.id.editTextspeedvalue);
	    convertspeedbutton=(Button) findViewById(R.id.convertspeedbutton);
	    speedresult=(TextView) findViewById(R.id.speedresult);
	    
	    textViewselectspeedparameter.setText("Select Conversion Unit");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Speed.this,android.R.layout.simple_dropdown_item_1line,unit);
        
        spinnerspeedunit.setAdapter(adapter);
        spinnerspeedunit.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				switch (position)
				{
				case 0:
					editTextspeedvalue.setHint("Enter the value(Km/hr)");
					convertspeedbutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextspeedvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*0.2778);
						String str=Double.toString(res);
						speedresult.setText(str);
						}
						else
						{
						Toast.makeText(Speed.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 1:
					editTextspeedvalue.setHint("Enter the value(M/sec)");
					convertspeedbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextspeedvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*3.6);
						String str=Double.toString(res);
						speedresult.setText(str);
						}
						else
						{
						Toast.makeText(Speed.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 2:
					editTextspeedvalue.setHint("Enter the value(Km/hr)");
					convertspeedbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextspeedvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d/1.609344);
						String str=Double.toString(res);
						speedresult.setText(str);
						}
						else
						{
						Toast.makeText(Speed.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 3:
					editTextspeedvalue.setHint("Enter the value(Miles/hr)");
					convertspeedbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextspeedvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*1.609344);
						String str=Double.toString(res);
						speedresult.setText(str);
						}
						else
						{
						Toast.makeText(Speed.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				}
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
	}
}
