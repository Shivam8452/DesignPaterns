package com.designPatterns.behavioural.stretagyPattern.textFormatter;

public class HTMLFormatter implements TextFormatter {

	@Override
	public String format(String text) {
		// TODO Auto-generated method stub
		text = "<html><body>" + text + "</body></html>";
		return text;
	}

}
