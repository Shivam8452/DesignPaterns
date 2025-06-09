package com.designPatterns.behavioural.Command.textEditorII;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextEditor textEditor = new TextEditor();
		BoldCommand boldCommand = new BoldCommand(textEditor);
		
		Buttons buttons = new Buttons();
		buttons.setCommand(boldCommand);
		buttons.onCLick();
	}

}
