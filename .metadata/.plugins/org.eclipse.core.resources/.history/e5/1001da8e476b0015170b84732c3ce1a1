package com.jspiders.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener {

    
	RadioButton radiobuttonoption1;
	RadioGroup radiogroupselections;
	ToggleButton togglebutton;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       radiobuttonoption1=(RadioButton) findViewById(R.id.radioButtonoption1); 
       radiogroupselections=(RadioGroup) findViewById(R.id.radioGroup1);
       radiogroupselections.setOnCheckedChangeListener(MainActivity.this);
       togglebutton=(ToggleButton) findViewById(R.id.toggleButton);
       
       //this is for toggle button
       togglebutton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
		{
			
			
		}
	});
       
       
       
       
       
       //this is for radio button
       radiobuttonoption1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean state) {
			
			if(state==true)
			{
				Toast.makeText(MainActivity.this,"you have selected optoion1",Toast.LENGTH_SHORT).show();
			}
		}
	});  
       
    }

	//this is for radio group
	
	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) 
	{
	switch (id) {
	case R.id.radioselection1:
		Toast.makeText(MainActivity.this,"you have selected selection1",Toast.LENGTH_SHORT).show();
		break;
		
	case R.id.radioselection2:
		Toast.makeText(MainActivity.this,"you have selected selection2",Toast.LENGTH_SHORT).show();
		break;
		
	case R.id.radioselection3:
		Toast.makeText(MainActivity.this,"you have selected selection3",Toast.LENGTH_SHORT).show();
		break;
		
	case R.id.radioselection4:
		Toast.makeText(MainActivity.this,"you have selected selection4",Toast.LENGTH_SHORT).show();
		break;

	default:
		break;
	}
		
	}

}
    
