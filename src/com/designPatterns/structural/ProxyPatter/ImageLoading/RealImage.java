package com.designPatterns.structural.ProxyPatter.ImageLoading;

public class RealImage implements Image {
	
	private String filename;
	
	public RealImage(String filename) {
		this.filename=filename;
		loadImageFromDisk();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying image: "+filename);
	}
	
	public void loadImageFromDisk() {
		System.out.println("Loading image from disk: "+filename);
	}

}
