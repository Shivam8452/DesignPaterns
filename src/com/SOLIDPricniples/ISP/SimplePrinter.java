package com.SOLIDPricniples.ISP;

public class SimplePrinter implements Printerer,Copier{
	
	public void print() {
		System.out.println("Printing....");
	}
	
	public void copy() {
		System.out.println("Copying...");
	}

}
