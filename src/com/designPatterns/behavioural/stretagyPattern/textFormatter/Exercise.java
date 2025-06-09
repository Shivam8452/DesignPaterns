package com.designPatterns.behavioural.stretagyPattern.textFormatter;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Document doc = new Document();
          
          doc.setContent("Shivam Yadav");
          
          doc.setFormatter(new PlainTextFormatter());
          doc.display();
          
          doc.setFormatter(new HTMLFormatter());
          doc.display();
          
          doc.setFormatter(new MarkdownFormatter());
          doc.display();
	}

}
