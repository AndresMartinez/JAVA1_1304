package com.amartinez.lib;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioGroup;

public class FormThings {
	                           // Creates the class   /    This creates the stuff that goes inside
	public static LinearLayout singleEntryWithButton(Context context , String hint , String buttonText ) {
		
		//creates layout 
		LinearLayout ll = new LinearLayout(context);
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT , LayoutParams.WRAP_CONTENT);
		ll.setLayoutParams(lp);
		
		
		//creates Edit text
	    EditText et = new EditText(context);
		
	    lp = new LayoutParams(0, LayoutParams.WRAP_CONTENT, 1.0f);
	    et.setHint(hint);
	    et.setLayoutParams(lp);
	    et.setId(1);
		
		
		//Creates Buttons
		Button b = new Button(context);
		b.setText(buttonText);
		b.setId(2);
		b.setTag(et);
		
		
		ll.addView(et);
		ll.addView(b);
		
		
		
		
		
		return ll;
	} 

	
	public static RadioGroup getOptions(Context context, String[] options){
		RadioGroup boxes = new RadioGroup(context);
		
		for (int i = 0; i < options.length; i++) {
			RadioButton rb = new RadioButton(context);
			
			rb.setText(options[i]);
			rb.setId(i+1);
			boxes.addView(rb);
			
		}
		
		
		return boxes;
		
	}
}











































