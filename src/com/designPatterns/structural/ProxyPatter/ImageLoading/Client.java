package com.designPatterns.structural.ProxyPatter.ImageLoading;

public class Client {
	
	public static void main(String[] args) {
		Image image = new ProxyImage("dog.png");
		Image image2 = new ProxyImage("dog.png");
		
		image.display();
		image.display();

	}

}
