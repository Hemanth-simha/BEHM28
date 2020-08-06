package com.jspiders.solidprinciples.ocp;

public class HomeInsuranceCustomer implements Customer {

	@Override
	public boolean isLoyalCustomer() {
		return false;
	}

}
