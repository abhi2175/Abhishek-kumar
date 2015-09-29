package com.jspiders.converter;

import android.net.ParseException;
import java.lang.*;
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

public class MainActivity extends Activity {

	
	Spinner spinnerunit;
	EditText editTextnum1,editTextnum2;
	Button buttonconvert;
	TextView textViewresult;
	String entvalue1;
	String entvalue2;
	int tmp;
	String str1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        final String[] unit={"TEMPERATURE","LENGHT","CURRENCY"};
        spinnerunit=(Spinner) findViewById(R.id.spinnerunit);
        editTextnum1=(EditText) findViewById(R.id.editTextnum1);
        editTextnum2=(EditText) findViewById(R.id.editTextnum2);
        buttonconvert=(Button) findViewById(R.id.buttonconvert);
        textViewresult=(TextView) findViewById(R.id.textViewresult);
        
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,unit);
        
        spinnerunit.setAdapter(adapter);
        
        spinnerunit.setOnItemSelectedListener(new OnItemSelectedListener() 
        {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
			switch (position)
			{	
			case 0:
				editTextnum1.setHint("celsius");
				editTextnum2.setHint("Farenheit");
				buttonconvert.setOnClickListener(new OnClickListener() 
				{	
					@Override
					public void onClick(View v) 
					{
					entvalue1=editTextnum1.getText().toString();
					entvalue2=editTextnum2.getText().toString();
					
					if(entvalue1.length()>0)
					{
					Double d=Double.parseDouble(entvalue1);
					Double tmp=(Double) ((d*9)/5+32);
					String str1=Double.toString(tmp);
					textViewresult.setText(str1);
                    }
					else if(entvalue2.length()>0)
                    {
					Double d=Double.parseDouble(entvalue2);
					Double tmp=((d-32)*5/9);
					String str1=Double.toString(tmp);
					textViewresult.setText(str1);
					}
					else
					{
					Toast.makeText(MainActivity.this,"please enter any value first",Toast.LENGTH_SHORT).show();	
					}
					}
				});
				break;
				
			case 1:
				editTextnum1.setHint("kilometers");
				editTextnum2.setHint("metres");
				buttonconvert.setOnClickListener(new OnClickListener() 
				{	
					@Override
					public void onClick(View v) 
                    {
					entvalue1=editTextnum1.getText().toString();
					entvalue2=editTextnum2.getText().toString();
						
					if(entvalue1.length()>0)
					{
					Double d=Double.parseDouble(entvalue1);
					Double tmp=(Double) (d*1000);
					String str1=Double.toString(tmp);
					textViewresult.setText(str1);
	                }
					else if(entvalue2.length()>0)
	                {
					Double d=Double.parseDouble(entvalue2);
					Double tmp=(d/1000);
					String str1=Double.toString(tmp);
					textViewresult.setText(str1);
	                }
					else
					{
					Toast.makeText(MainActivity.this,"please enter any value first",Toast.LENGTH_SHORT).show();	
					}
	                }
				});
				break;
				
			case 2:
				editTextnum1.setHint("INR");
				editTextnum2.setHint("USD");
				buttonconvert.setOnClickListener(new OnClickListener() 
				{	
					@Override
					public void onClick(View v) 
					{
					entvalue1=editTextnum1.getText().toString();
					entvalue2=editTextnum2.getText().toString();
					
					if(entvalue1.length()>0)
					{
					Double d=Double.parseDouble(entvalue1);
					Double tmp=(Double) (d/61);
					String str1=Double.toString(tmp);
					textViewresult.setText(str1);
                    }
					else if(entvalue2.length()>0)
                    {
					Double d=Double.parseDouble(entvalue2);
					Double tmp=(d*61);
					String str1=Double.toString(tmp);
					textViewresult.setText(str1);
                    }
					else
					{
					Toast.makeText(MainActivity.this,"please enter any value first",Toast.LENGTH_SHORT).show();	
					}
				    }
				    });
				    break;    
    }
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
});
        }
}
    
