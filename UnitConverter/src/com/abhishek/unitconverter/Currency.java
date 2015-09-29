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

public class Currency extends Activity {
	
	TextView textViewselectcurrencyparameter;
	Spinner spinnercurrencyunit;
	EditText editTextcurrencyvalue;
	Button convertcurrencybutton;
	TextView currencyresult;
	String uservalue;
	String str;
	double res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_currency);
		
		final String[] unit={"INR to USD","USD to INR","INR to Euro","Euro to INR"};
		textViewselectcurrencyparameter=(TextView) findViewById(R.id.textViewselectcurrencyparameter);
	    spinnercurrencyunit=(Spinner) findViewById(R.id.spinnercurrencyunit);
	    editTextcurrencyvalue=(EditText) findViewById(R.id.editTextcurrencyvalue);
	    convertcurrencybutton=(Button) findViewById(R.id.convertcurrencybutton);
	    currencyresult=(TextView) findViewById(R.id.currencyresult);
	    
	    textViewselectcurrencyparameter.setText("Select Conversion Unit");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Currency.this,android.R.layout.simple_dropdown_item_1line,unit);
        
        spinnercurrencyunit.setAdapter(adapter);
        spinnercurrencyunit.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				switch (position)
				{
				case 0:
					editTextcurrencyvalue.setHint("Enter the value(INR)");
					convertcurrencybutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextcurrencyvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*0.015);
						String str=Double.toString(res);
						currencyresult.setText(str);
						}
						else
						{
						Toast.makeText(Currency.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 1:
					editTextcurrencyvalue.setHint("Enter the value(USD)");
					convertcurrencybutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextcurrencyvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*66.16);
						String str=Double.toString(res);
						currencyresult.setText(str);
						}
						else
						{
						Toast.makeText(Currency.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 2:
					editTextcurrencyvalue.setHint("Enter the value(INR)");
					convertcurrencybutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextcurrencyvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*0.014);
						String str=Double.toString(res);
						currencyresult.setText(str);
						}
						else
						{
						Toast.makeText(Currency.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 3:
					editTextcurrencyvalue.setHint("Enter the value(Euro)");
					convertcurrencybutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextcurrencyvalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*74.07);
						String str=Double.toString(res);
						currencyresult.setText(str);
						}
						else
						{
						Toast.makeText(Currency.this,"First enter a value",Toast.LENGTH_SHORT).show();	
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
