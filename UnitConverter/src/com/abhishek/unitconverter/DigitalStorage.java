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

public class DigitalStorage extends Activity {

	TextView textViewselectstorageparameter;
	Spinner spinnerstorageunit;
	EditText editTextstoragevalue;
	Button convertstoragebutton;
	TextView storageresult;
	String uservalue;
	String str;
	double res;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_digital_storage);
		
		final String[] unit={"Bit to Byte","Byte to Bit","Byte to Kilobyte","Kilobyte to byte"};
		textViewselectstorageparameter=(TextView) findViewById(R.id.textViewselectstorageparameter);
	    spinnerstorageunit=(Spinner) findViewById(R.id.spinnerstorageunit);
	    editTextstoragevalue=(EditText) findViewById(R.id.editTextstoragevalue);
	    convertstoragebutton=(Button) findViewById(R.id.convertstoragebutton);
	    storageresult=(TextView) findViewById(R.id.storageresult);
	    
	    textViewselectstorageparameter.setText("Select Conversion Unit");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(DigitalStorage.this,android.R.layout.simple_dropdown_item_1line,unit);
        
        spinnerstorageunit.setAdapter(adapter);
        spinnerstorageunit.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				switch (position)
				{
				case 0:
					editTextstoragevalue.setHint("Enter the value(bit)");
					convertstoragebutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextstoragevalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*0.125);
						String str=Double.toString(res);
						storageresult.setText(str);
						}
						else
						{
						Toast.makeText(DigitalStorage.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 1:
					editTextstoragevalue.setHint("Enter the value(byte)");
					convertstoragebutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextstoragevalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*8);
						String str=Double.toString(res);
						storageresult.setText(str);
						}
						else
						{
						Toast.makeText(DigitalStorage.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 2:
					editTextstoragevalue.setHint("Enter the value(byte)");
					convertstoragebutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextstoragevalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*0.001);
						String str=Double.toString(res);
						storageresult.setText(str);
						}
						else
						{
						Toast.makeText(DigitalStorage.this,"First enter a value",Toast.LENGTH_SHORT).show();	
						}
						}
						});
				  break;
				  
				case 3:
					editTextstoragevalue.setHint("Enter the value(kb)");
					convertstoragebutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
						uservalue=editTextstoragevalue.getText().toString();
						
						if(uservalue.length()>0)
						{
						Double d=Double.parseDouble(uservalue);
						Double res=(Double) (d*1000);
						String str=Double.toString(res);
						storageresult.setText(str);
						}
						else
						{
						Toast.makeText(DigitalStorage.this,"First enter a value",Toast.LENGTH_SHORT).show();	
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
