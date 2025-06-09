package com.designPatterns.structural.compositePattern.FileSYstem;

public class File implements FileSystemComponent{
	
	private String name;
	
	public File(String name) {
		this.name=name;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("File: "+name);
	}
	
	

}
