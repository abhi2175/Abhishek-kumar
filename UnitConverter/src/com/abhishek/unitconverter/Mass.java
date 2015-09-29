package com.abhishek.unitconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import java.lang.NullPointerException;
import java.lang.*;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Mass extends Activity {
	
	TextView textViewselectmassparameter;
	Spinner spinnermassunit;
	EditText editTextmassvalue;
	Button convertmassbutton;
	TextView massresult;
	String uservalue;
	String str;
	double res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mass);
	
		final String[] unit={"Kilogram to Gram","Gram to Kilogram","Kilogram to Pound","Pound to Kilogram"};
		textViewselectmassparameter=(TextView) findViewById(R.id.textViewselectmassparameter);
	    spinnermassunit=(Spinner) findViewById(R.id.spinnermassunit);
	    editTextmassvalue=(EditText) findViewById(R.id.editTextmassvalue);
	    convertmassbutton=(Button) findViewById(R.id.convertmassbutton);
	    massresult=(TextView) findViewById(R.id.massresult);
	    
	    textViewselectmassparameter.setText("Select Conversion Unit");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Mass.this,android.R.layout.simple_dropdown_item_1line,unit);
        
        spinnermassunit.setAdapter(adapter);
        spinnermassunit.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				switch (position)
				{
				case 0:
					editTextmassvalue.setHint("Enter the value(Kg)");
					convertmassbutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextmassvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*1000);
						String str=Double.toString(res);
						massresult.setText(str);
						}
						else
						{
						Toast.makeText(Mass.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 1:
					editTextmassvalue.setHint("Enter the value(g)");
					convertmassbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextmassvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d/1000);
						String str=Double.toString(res);
						massresult.setText(str);
						}
						else
						{
						Toast.makeText(Mass.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 2:
					editTextmassvalue.setHint("Enter the value(Kg)");
					convertmassbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextmassvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*2.20462);
						String str=Double.toString(res);
						massresult.setText(str);
						}
						else
						{
						Toast.makeText(Mass.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 3:
					editTextmassvalue.setHint("Enter the value(Pound)");
					convertmassbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextmassvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d/2.20462);
						String str=Double.toString(res);
						massresult.setText(str);
						}
						else
						{
						Toast.makeText(Mass.this,"First enter a value",Toast.LENGTH_SHORT).show();	
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
