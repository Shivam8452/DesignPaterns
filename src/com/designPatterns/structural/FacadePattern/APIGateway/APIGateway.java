package com.designPatterns.structural.FacadePattern.APIGateway;

public class APIGateway {
	
	private OrderId orderId;
	private PaymentService payment;
	private UserService user;
	
	public APIGateway() {
		orderId = new OrderId();
		payment = new PaymentService();
		user = new UserService();
	}
	
	public String getFullPaymentDetail(String orderid, String userId, String Payment) {
		return "OrderId: "+orderId.getOrderId(orderid) + "\n UserID: "+user.getUserId(userId) +"\nPayment: "+payment.processPayemnt(Payment);
	}

}
