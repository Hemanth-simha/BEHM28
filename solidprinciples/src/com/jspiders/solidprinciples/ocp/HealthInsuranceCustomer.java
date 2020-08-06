package com.jspiders.solidprinciples.ocp;

public class HealthInsuranceCustomer implements Customer {

	@Override
	public boolean isLoyalCustomer() {
		return true;
	}

}
