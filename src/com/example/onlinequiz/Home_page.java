package com.example.onlinequiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Home_page extends Activity {
Button b1;
TextView a1,a2,a3;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
		a1=(TextView)findViewById(R.id.textView1);
		a2=(TextView)findViewById(R.id.textView3);
		a3=(TextView)findViewById(R.id.textView4);
		b1=(Button)findViewById(R.id.button1);
		
		
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent (Home_page.this,Question_page1.class);
				startActivity(i);	
			}
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_page, menu);
		return true;
	}

}
