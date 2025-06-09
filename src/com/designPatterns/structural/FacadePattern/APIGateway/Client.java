package com.designPatterns.structural.FacadePattern.APIGateway;

final class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIGateway api = new APIGateway();
		System.out.println(api.getFullPaymentDetail("1234", "567", "890"));
	}

}
