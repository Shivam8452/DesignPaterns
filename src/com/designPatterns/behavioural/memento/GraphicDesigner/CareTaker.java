package com.designPatterns.behavioural.memento.GraphicDesigner;

import java.util.Stack;

public class CareTaker {
	private final Stack<GraphicMemento> history = new Stack();
    
	public void saveState(GraphicEditor editor) {
		history.push(editor.save());
	}
	
	public void undo(GraphicEditor editor) {
		if(!history.empty()) {
			history.pop();
			editor.restore(history.peek());
		}
	}
}
