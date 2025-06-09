package com.designPatterns.creational.factoryPatter.TransportService;

public class TransportService {
	
	public static void main(String[] args) {
		Transport transport = TransportFactory.createTransport("Truck");
		transport.deliver();
	}

}
