package com.jspiders.intent1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button sendbutton;
    TextView msgtextview;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        sendbutton=(Button) findViewById(R.id.buttonstart);
        msgtextview=(TextView) findViewById(R.id.textViewmessage);
        
        sendbutton.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View v) {
		    
				
			}
		});
    }
}
