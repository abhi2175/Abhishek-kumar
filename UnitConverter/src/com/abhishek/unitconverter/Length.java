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

public class Length extends Activity {

	TextView textViewselectlengthparameter;
	Spinner spinnerlengthunit;
	EditText editTextlenvalue;
	Button convertlenbutton;
	TextView lenresult;
	String uservalue;
	String str;
	double res;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_length);
		
		final String[] unit={"Meter to Centimeter","Centimeter to Meter","Centimeter to millimiter","Milimeter to Centimeter"};
		textViewselectlengthparameter=(TextView) findViewById(R.id.textViewselectlengthparameter);
	    spinnerlengthunit=(Spinner) findViewById(R.id.spinnerlengthunit);
	    editTextlenvalue=(EditText) findViewById(R.id.editTextlenvalue);
	    convertlenbutton=(Button) findViewById(R.id.convertlenbutton);
	    lenresult=(TextView) findViewById(R.id.lenresult);
	    
	    textViewselectlengthparameter.setText("Select Conversion Unit");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Length.this,android.R.layout.simple_dropdown_item_1line,unit);
        
        spinnerlengthunit.setAdapter(adapter);
        spinnerlengthunit.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				switch (position)
				{
				case 0:
					editTextlenvalue.setHint("Enter the value(m)");
					convertlenbutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextlenvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*100);
						String str=Double.toString(res);
						lenresult.setText(str);
						}
						else
						{
						Toast.makeText(Length.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 1:
					editTextlenvalue.setHint("Enter the value(cm)");
					convertlenbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextlenvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d/100);
						String str=Double.toString(res);
						lenresult.setText(str);
						}
						else
						{
						Toast.makeText(Length.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 2:
					editTextlenvalue.setHint("Enter the value(cm)");
					convertlenbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextlenvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*10);
						String str=Double.toString(res);
						lenresult.setText(str);
						}
						else
						{
						Toast.makeText(Length.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 3:
					editTextlenvalue.setHint("Enter the value(mm)");
					convertlenbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextlenvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d/10);
						String str=Double.toString(res);
						lenresult.setText(str);
						}
						else
						{
						Toast.makeText(Length.this,"First enter a value",Toast.LENGTH_SHORT).show();	
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

	
     
	
	


