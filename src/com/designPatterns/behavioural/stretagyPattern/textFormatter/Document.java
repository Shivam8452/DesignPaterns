package com.designPatterns.behavioural.stretagyPattern.textFormatter;

public class Document {
	private String content;
    private TextFormatter formatter;
    
    public void setContent(String content) {
        this.content = content;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void display() {
        // TODO: Print the formatted content using the chosen formatter.
    	String cont = formatter.format(content);
    	System.out.println(cont);
    }
}
