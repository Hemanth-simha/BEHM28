package com.jspiders.solidprinciples.dip;

public class ProductFactory {

	public static Product createProduct()
	{
		Product product = new SQLRepository();
		return product;
	}
	
}
