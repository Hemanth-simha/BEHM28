package com.jspiders.solidprinciples.dip;

public class DisplayProducts {
	
	public void display()
	{
		Product product = ProductFactory.createProduct();
		int products = product.readProducts();
		System.out.println("Products per page is : "+products/10);
	}
	
	
}
