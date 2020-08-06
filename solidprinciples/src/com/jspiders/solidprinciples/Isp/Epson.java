package com.jspiders.solidprinciples.Isp;

public class Epson implements Printer,Scanner {

	@Override
	public void print() {
		System.out.println("Print by Epson");

	}

	@Override
	public void scan() {
		System.out.println("Scan by Epson");

	}


}
