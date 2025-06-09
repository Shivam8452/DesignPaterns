package com.designPatterns.behavioural.templateMEthod.fileParser;

public abstract class DataParser {
	public void parser() {
		openFile();
		parseFile();
		closeFile();
	}
	
	protected void openFile() {
		System.out.println("Opening file");
	}
	
	protected void closeFile() {
		System.out.println("Closing file");
	}
	
	protected abstract void parseFile();
}
