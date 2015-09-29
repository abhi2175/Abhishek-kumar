package com.abhishek.unitconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperature extends Activity {
	
	TextView textViewselecttempparameter;
	Spinner spinnertempunit;
	EditText editTextentvalue;
	Button convertbutton;
	TextView result;
	String uservalue;
	String str;
	double res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
	
	    final String[] unit={"Celsius to Fahrenheit","Fahrenheit to Celsius","Celsius to Kelvin","Kelvin to Celsius"};
		textViewselecttempparameter=(TextView) findViewById(R.id.textViewselecttempparameter);
	    spinnertempunit=(Spinner) findViewById(R.id.spinnertempunit);
	    editTextentvalue=(EditText) findViewById(R.id.editTextentvalue);
	    convertbutton=(Button) findViewById(R.id.convertbutton);
	    result=(TextView) findViewById(R.id.result);
	    
	    textViewselecttempparameter.setText("Select Conversion Unit");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Temperature.this,android.R.layout.simple_dropdown_item_1line,unit);
        
        spinnertempunit.setAdapter(adapter);
        spinnertempunit.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				switch (position)
				{
				case 0:
					editTextentvalue.setHint("Enter the value(C)");
					convertbutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextentvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) ((d*9)/5+32);
						String str=Double.toString(res);
						result.setText(str);
						}
						else
						{
						Toast.makeText(Temperature.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 1:
					editTextentvalue.setHint("Enter the value(F)");
					convertbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextentvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) ((d-32)*5/9);
						String str=Double.toString(res);
						result.setText(str);
						}
						else
						{
						Toast.makeText(Temperature.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 2:
					editTextentvalue.setHint("Enter the value(C)");
					convertbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextentvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d+273.5);
						String str=Double.toString(res);
						result.setText(str);
						}
						else
						{
						Toast.makeText(Temperature.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 3:
					editTextentvalue.setHint("Enter the value(K)");
					convertbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextentvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d-273.5);
						String str=Double.toString(res);
						result.setText(str);
						}
						else
						{
						Toast.makeText(Temperature.this,"First enter a value",Toast.LENGTH_SHORT).show();	
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
