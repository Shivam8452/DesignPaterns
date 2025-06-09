package com.designPatterns.behavioural.Command.textEditorII;

public class BoldCommand implements Command {
	
	private TextEditor editor;
	
	public BoldCommand(TextEditor editor) {
		this.editor=editor;
	}
	
	public void execute() {
		editor.boldText();
	}
}
