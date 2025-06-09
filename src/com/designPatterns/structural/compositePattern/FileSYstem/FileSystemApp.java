package com.designPatterns.structural.compositePattern.FileSYstem;

public class FileSystemApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Folder folder = new Folder("Documents");
		
		FileSystemComponent file1 = new File("file1.txt");
		FileSystemComponent file2 = new File("file2.txt");
		
		folder.addComponent(file1);
		folder.addComponent(file2);
		
		Folder subFOlder = new Folder("subFolder");

		FileSystemComponent file3 = new File("file3.txt");
		subFOlder.addComponent(file3);
		
		folder.addComponent(subFOlder);

        folder.showDetails();
	}

}
