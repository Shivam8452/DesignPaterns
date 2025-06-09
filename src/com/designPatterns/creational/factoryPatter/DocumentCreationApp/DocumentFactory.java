package com.designPatterns.creational.factoryPatter.DocumentCreationApp;

public class DocumentFactory {
	
	public static Document createDocument(String type) {
		switch(type.toLowerCase()) {
		case "html":
			return new HTMLDocument();
		case "pdf":
			return new PDFDocument();
		case "word":
			return new WordDocument();
		default:
			throw new IllegalArgumentException("Type not supported");
		}
	}

}
