package com.designPatterns.behavioural.memento.texteditor;

public class TextEditormain {
	
	public static void main(String args[]) {
		TextEditor text = new TextEditor();
		CareTaker t = new CareTaker();
		text.write("Hellow world!");
		t.saveState(text);
		
		text.write("Hello everyOne!");
		t.saveState(text);
		
		t.undo(text);
		
		System.out.println(text.read());
	}

}
