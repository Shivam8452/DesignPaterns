package com.designPatterns.structural.ProxyPatter.ImageLoading;

public class ProxyImage implements Image {
	
	private String filename;
	
	private RealImage realImage;
	
	public ProxyImage(String filename) {
		this.filename=filename;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realImage==null) {
			realImage = new RealImage(filename);
		}
		
		realImage.display();
		
	}

}
