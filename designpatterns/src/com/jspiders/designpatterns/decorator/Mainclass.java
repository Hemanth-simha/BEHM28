package com.jspiders.designpatterns.decorator;

public class Mainclass {

	public static void main(String[] args) {
		
		String str = new String("java");
		int res1= str.length();
		
		
		MagicString mgStr= new MagicString("java");
		int res2 = mgStr.length();
	
		System.out.println("Res1 : "+res1);
		System.out.println("Res2 : "+res2);
	}

}
