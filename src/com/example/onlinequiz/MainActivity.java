package com.example.onlinequiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {


 

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t=new Thread()
		{
			public void run()
			{
				try
				{
					Thread.sleep(3000);
					Intent intent=new Intent(getApplicationContext(), Login_page.class);
					startActivity(intent);
				}
				catch (Exception e) 
				{
					 e.printStackTrace();
				}
			}
		};
		t.start();
	}

    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
