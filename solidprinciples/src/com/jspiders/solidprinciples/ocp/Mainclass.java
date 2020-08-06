package com.jspiders.solidprinciples.ocp;

public class Mainclass {

	public static void main(String[] args) {
		
		 Customer health = new HealthInsuranceCustomer();
 InsurancePremiumCaluclator caluclator = new InsurancePremiumCaluclator();
		 double discount = caluclator.calculate(health);
		 System.out.println
		 ("HealthInsuranceCustomer got a discount of : "+discount+"%");
	
		 Customer home = new HomeInsuranceCustomer();
InsurancePremiumCaluclator caluclator1 = new InsurancePremiumCaluclator();
		 double discount1 = caluclator1.calculate(home);
		 System.out.println
		 ("HomeInsuranceCustomer got a discount of : "+discount1+"%");
	
	}

}
