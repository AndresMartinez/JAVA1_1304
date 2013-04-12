package com.aMartinez.week1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Week1App extends Activity {
	
	
	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	EditText et;
	TextView  result;

	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT , LinearLayout.LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(lp);  
		
		
		TextView tv = new TextView(this);
		//tv.setText(getString(R.string.one)+ "," +getString(R.string.two)+ "," +getString(R.string.three)+ "," +getString(R.string.four));
		tv.setText("How many Candies does every one get?");
		//adds text view to linear layout
		ll.addView(tv);
		
	 
		
	    et = new EditText(this);
		et.setHint("Enter Candy Amount");
		//ll.addView(et);
		
		Button b = new Button(this);
		b.setText("Split up");
		//ll.addView(b);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				int one = getResources().getInteger(R.integer.one);
				int two = getResources().getInteger(R.integer.two);
				int three = getResources().getInteger(R.integer.three);
				int four = getResources().getInteger(R.integer.four);
				
				int entry = Integer.parseInt(et.getText().toString());
				
				int numO = (entry/one);
				int numT = (entry/two);
				int numTh = (entry/three);
				int numF = (entry/four);
				
				result.setText("One Person :" + numO +"\r\n" +
				      "Two People : " + numT + "\r\n" +
					  "Three People :" + numTh + "\r\n" +
				      "Four People : " + numF + "\r\n" 
				      
						
				
				);
				
				
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		//makes new layout
		LinearLayout form = new LinearLayout(this);
		form.setOrientation(LinearLayout.HORIZONTAL);
		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT  ,LinearLayout.LayoutParams.WRAP_CONTENT );
		form.setLayoutParams(lp);
		
		//adds  edit text and button to new nested liner layout form
		form.addView(et);
		form.addView(b);
		
		
		
		//adds form to original view "ll"
		ll.addView(form);
		
		
        result = new TextView(this);
		
		ll.addView(result);
		
		
		
		
		boolean b1 = true;
		boolean b2 = false;
        boolean b3 = !b1;
		int i = 1;
		boolean b4 = (i != 0);
		String s = "true";
		boolean b5 = Boolean.parseBoolean(s);
	
		
		
		 TextView show = new TextView(this);
		 show.setText("The value of b1 is " + b1 + "\r\n" +
		 "The value of b2 is " + b2 + "\r\n" +
		 "The value of b3 is " + b3	+ "\r\n" +
		 "The value of b4 is " + b4 +"\r\n" +
		 "The value of b5 is " + b5 +"\r\n"
		 );
		 ll.addView(show);
		 
		 
		 
		 TextView hit = new TextView(this);
		 for(int d = 0 ; d < 20 ; d ++)
		 {
		  hit.setText("value of d : " + d );
			 
		 };
		 ll.addView(hit);
		 
		 TextView same = new TextView(this);
		 if(b3 == b2)
	     same.setText( b3 + " == " + b2);
		 
		 ll.addView(same);
		 
		 
		 
		 
		 
		 
		 
		 
		
			
		

		//tell content to show up
		setContentView(ll);
		

		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.week1_app, menu);
		return true;
	}

}












