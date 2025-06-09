package com.designPatterns.behavioural.stretagyPattern.textFormatter;

public class MarkdownFormatter implements TextFormatter {

	@Override
	public String format(String text) {
		// TODO Auto-generated method stub
		return "**"+text+"**";
	}

}
