package com.designPatterns.creational.singletonPattern.loggerApplication;

public class Main {
	
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		
		logger.info("Data is found");
	}

}
