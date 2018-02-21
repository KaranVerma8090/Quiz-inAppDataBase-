package com.example.onlinequiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Question_page3 extends Activity {
	TextView e1;
	Button b1,b2;
	//String count;
	Bundle bd;
	//int count2;
	RadioButton rb;
	RadioGroup rg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_page3);
		e1=(TextView)findViewById(R.id.editText1);
	    b1=(Button) findViewById(R.id.button1);
	    b2=(Button) findViewById(R.id.button2);
	    rg=(RadioGroup) findViewById(R.id.radioGroup1);
	    bd=getIntent().getExtras();
	    b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					int check=rg.getCheckedRadioButtonId();
					rb=(RadioButton)findViewById(check);
					String ans=rb.getText().toString();
					if(ans.equalsIgnoreCase("a. Service"))
					{
						Question_page1.count=Integer.parseInt(bd.getString("next"));
						 //count=Integer.parseInt(count);
						
						Question_page1.count++;
						Toast.makeText(getBaseContext(),"data are saved successfully",2000).show();
					}
					else
					{
					Toast.makeText(getBaseContext(),"data are saved successfully",2000).show();
				}}
			});
		
			
	b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					//Intent i1=new Intent(MainActivity.this,First.class);
					//startActivity(i1);
					Intent i1=new Intent(Question_page3.this,Question_page4.class);
					i1.putExtra("next",String.valueOf(Question_page1.count));
					startActivity(i1);
				}
			});
				
				
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question_page3, menu);
		return true;
	}

}
