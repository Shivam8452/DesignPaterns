package com.SOLIDPricniples.ISP;

public class Multipurpose implements Printerer,Scanner,Copier {

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("Copying....");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("Scanning....");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing....");
	}

}
