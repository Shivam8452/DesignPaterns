package com.paymentService;

public class Client {
	
	public static void main(String args[]) {
		PaymentService ps = new PaymentService();
		ps.addpaymentMethod("CredCard", new CreditCard("Shiva123", 1234));
		ps.addpaymentMethod("DebitCard", new DebitCard("ShivamDC",5678));
		ps.addpaymentMethod("UPI",new UPI("Shivam"));
		
		ps.makePayment("UPI");
		ps.makePayment("DebitCard");

		ps.makePayment("CredCard");

	}

}
