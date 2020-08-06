package com.jspiders.solidprinciples.ocp;

//Extension Class
public class VehicleInsuranceCustomer implements Customer {

	@Override
	public boolean isLoyalCustomer() {
		return false;
	}

}
