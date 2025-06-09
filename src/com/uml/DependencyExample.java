package com.uml;

class Document{
	private String content;
	
	public Document(String content) {
		this.content=content;
	}
	
	public String getContent() {
		return content;
	}
}

class Printer{
	
	public void PrintDoc(Document d) {
		System.out.println("Doc:"+d.getContent());
	}
}
public class DependencyExample {
	
	public static void main(String args[]) {
		Document d= new Document("Hi! My name is shivam");
		
		Printer p = new Printer();
		p.PrintDoc(d);
	}
}
