package com.cg.demo.lamb;

public class LambdaExp {
	public static void main(String[] args) {
		double amount = 1000;
		double homsize = 128.54;

		HomeTax home = (getamount, homTax) -> {
			return amount + (getamount * homTax * 0.01);
		};

		double paymentAmount = home.HomTax(amount, homsize);

		System.out.println(amount);
		System.out.println(homsize);
		System.out.println(paymentAmount);
	}

}
