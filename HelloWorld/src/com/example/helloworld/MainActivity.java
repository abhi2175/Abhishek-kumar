package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	Button cancelbutton,signupbutton,loginbutton;
	EditText usernameeditText,passwordeditText;
	String Stusername="user1";
	String Stpassword="1234";
	String entusername;
	String entpassword;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//activity gives UI for interaction
        
        loginbutton=(Button)findViewById(R.id.loginbutton);
        cancelbutton=(Button)findViewById(R.id.cancelbutton);
        signupbutton=(Button)findViewById(R.id.signupbutton);
        usernameeditText=(EditText)findViewById(R.id.usernameeditText);
        passwordeditText=(EditText)findViewById(R.id.passwordeditText);
        
        cancelbutton.setOnClickListener(this);
        
        signupbutton.setOnClickListener(new OnClickListner()
        {

			@Override
			public void onClick(View v) 
			{
		    Toast.makeText(MainActivity.this,"proceed to signup",Toast.LENGTH_SHORT).show();
			Log.d("[DEBUG]","Clicked on signup button");	
			}

        });
    }
           
    public void login(View v1)
    {
    	entusername=usernameeditText.getText().toString();
    	entpassword=passwordeditText.getText().toString();
    	
    	if(Stusername.equalsIgnoreCase(entusername)&& Stpassword.equals(entpassword))
    	{
    		Toast.makeText(this,"login succesfull",Toast.LENGTH_SHORT).show();
    		Log.d("[DEBUG]","succesfully login");
    	}
    	else
    	{
    		Toast.makeText(this,"login failed",Toast.LENGTH_SHORT).show();
    		usernameeditText.setText("");
    		passwordeditText.setText("");
    		Log.d("[DEBUG]","login failed");
    	}
    		
    }

	@Override
	public void onClick(View v) 
	{	
		Toast.makeText(this,"login cancelled",Toast.LENGTH_SHORT).show();
		usernameeditText.setText("");
		passwordeditText.setText("");
		Log.d("[DEBUG]","clicked on cancel button");
		
	}
}