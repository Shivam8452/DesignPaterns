package com.paymentService;

public class UPI implements PaymentMethod {
	private String upiId;
	
	public UPI(String upiId) {
		this.upiId=upiId;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("PaymentMade throug upi");
		
	}
	
	

}
