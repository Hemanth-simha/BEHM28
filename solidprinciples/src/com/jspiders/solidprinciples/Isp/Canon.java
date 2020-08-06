package com.jspiders.solidprinciples.Isp;

public class Canon implements Printer,Scanner,Faxxer {

	@Override
	public void print() {
		System.out.println("Print by Canon");
	}

	@Override
	public void scan() {
		System.out.println("Scan by Canon");

	}

	@Override
	public void fax() {
		System.out.println("Fax by Canon");

	}

}
