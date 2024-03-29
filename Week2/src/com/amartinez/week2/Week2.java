package com.amartinez.week2;

import java.util.ArrayList;
import java.util.HashMap;

import com.amartinez.ecom.Money;

import com.amartinez.ecom.Product;
import com.amartinez.ecom.Phone;
import com.amartinez.lib.FormThings;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Week2 extends Activity {

	RadioGroup productOptions;
	ArrayList<Product> products;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout ll = new LinearLayout(this);
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(lp);
		ll.setOrientation(LinearLayout.VERTICAL);
		     
		
		
		
		LinearLayout entryBox = FormThings.singleEntryWithButton(this, "Type Something", "Go");
		
		Button moneyButton = (Button) entryBox.findViewById(2);
		
		moneyButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			    int selectedRadioId = productOptions.getCheckedRadioButtonId();
				RadioButton selectedRadio = (RadioButton) productOptions.findViewById(selectedRadioId);
				String radioText = (String) selectedRadio.getText(); 
				
				double  price = 0;
				
				for (int i = 0; i < products.size() ; i++) {
				 if(radioText.compareTo(products.get(i).getName()) == 0 ){
					 price = products.get(i).getPrice();
					 
				  }	 
				}
				
				
				EditText moneyText = (EditText) v.getTag();
				double money= Double.parseDouble(moneyText.getText().toString());
				
				
				double refund = money - price;
				
				HashMap<Money, Integer> change = Money.getChange(refund);
				
				Log.i("BUTTON CLICKED:", 
						"Dollar"  + change.get(Money.DOLLAR) +  "\r\n" +
						"Quarter" + change.get(Money.QUARTER) +  "\r\n" +
						"Dime"	  + change.get(Money.DIME) +  "\r\n" +	
						"Nickel"  + change.get(Money.NICKEL) +  "\r\n" +
						"Penny"   + change.get(Money.PENNY) 
                           );
				
				
			}
		});
		ArrayList<Product> products = new ArrayList<Product>() ;
		products.add(new Phone("iphone 4S", 99.99 ) );
		products.add(new Phone("iPhone 5" , 199.99) );
		products.add(new Phone("Galaxy S3" , 199.99) );
		products.add(new Phone("Galaxy Nexus" , 349.99) );
		products.add(new Phone("HTC One X" , 99.99) );
		
	   
		
       String[] productNames = new String[products.size()];	
       for (int i = 0; i < products.size( ) ; i++) {
		productNames[i] = products.get(i).getName();
		}
		
       RadioGroup productOptions = FormThings.getOptions(this, productNames);
		
	   ll.addView(productOptions);
		
		ll.addView(entryBox);
		
		setContentView(ll);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.week2, menu);
		return true;
	}

}

























