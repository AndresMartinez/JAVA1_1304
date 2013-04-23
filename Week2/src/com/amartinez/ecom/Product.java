package com.amartinez.ecom;

public interface Product {
    
	
	//set name of a product
	public boolean setName(String name);
	
	//set price of a product
	public boolean setPrice(double price);
	
	// get the name  of a product
	public String getName();
	
	// get the price of a product
    public double getPrice();


}
