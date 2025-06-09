package com.designPatterns.behavioural.memento.texteditor;

import java.util.Stack;

public class CareTaker {
	
	private final Stack<EditorMemento> history = new Stack();
	
	public void saveState(TextEditor edit) {
		history.push(edit.save());
	}
	
	public void undo(TextEditor edit) {
		if(!history.empty()) {
			history.pop();
			edit.restore(history.peek());
		}
	}

}
