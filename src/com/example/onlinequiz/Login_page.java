package com.example.onlinequiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login_page extends Activity {
Button b1;
TextView e1,e2;
public static final String MyPREFERENCES="MyPrefs";
public static final String Name = "nameKey";
public static final String Password="passKey";
SharedPreferences sharedpreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_page);
		b1=(Button) findViewById(R.id.button1);
		
		e1=(TextView)findViewById(R.id.editText1);
		e2=(TextView) findViewById(R.id.editText2);
		sharedpreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		String val=sharedpreferences.getString(Name, null);
		if(val!=null)
		{
			Intent i=new Intent(getApplicationContext(), Home_page.class);
			i.putExtra("Name", val);
			startActivity(i);
		}
		
	
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name=e1.getText().toString();
				String pass=e2.getText().toString();
				if(name.equals("") || pass.equals(""))
				{
					Toast.makeText(getApplicationContext(), "login details Empty.!", Toast.LENGTH_LONG).show();
					return;
				}
				SharedPreferences.Editor editor=sharedpreferences.edit();
				editor.putString(Name, name);
				editor.putString(Password, pass);
				editor.commit();
				Intent i=new Intent(getApplicationContext(), Home_page.class);
				i.putExtra("Name", name);
				startActivity(i);
			}
		});
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_page, menu);
		return true;
	}

}
