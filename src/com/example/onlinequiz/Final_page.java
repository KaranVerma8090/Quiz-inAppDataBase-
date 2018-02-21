package com.example.onlinequiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Final_page extends Activity {
Button b1;
TextView t1,t2;
Bundle bd;
int a;
String count;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final_page);
		t1=(TextView)findViewById(R.id.textView4);
		t2=(TextView)findViewById(R.id.textView5);
		b1=(Button)findViewById(R.id.button1);
		
		bd=getIntent().getExtras();
		 count=bd.getString("next");
		 t1.setText(count+" "+"out of 5");
		 a=Integer.parseInt(count);
		 if(a==0)
		 t2.setText("Gone For Duck(0%)");
		 else if(a==1)
			 t2.setText("Needs Improvement(20%)");
		 else if(a==2)
			 t2.setText("Better Luck Next TIme(40%)");
		 else if(a==3)
			 t2.setText("ALmost there(60%)");
		 else if(a==4)
			 t2.setText("Well Done(80%)");
		 else if(a==5)
			 t2.setText("EXCELLENT..!!(100%)");
		
   b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent (Final_page.this,Login_page.class);
		startActivity(i);	
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.final_page, menu);
		return true;
	}

}
