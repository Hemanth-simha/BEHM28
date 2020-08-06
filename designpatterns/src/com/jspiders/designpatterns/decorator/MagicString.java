package com.jspiders.designpatterns.decorator;

public class MagicString{
	
	private String str;

	public MagicString(String str) {
		this.str=str;
	}
	
	public int length() {
		return str.length()+1;
	}
	
}
