package com.designPatterns.behavioural.memento.texteditor;

public class TextEditor {
	private String content;
	
	public void write(String content) {
		this.content=content;
	}
	
	public EditorMemento save() {
		return new EditorMemento(content);
	}
	
	public void restore(EditorMemento memento) {
		content = memento.getContent();
	}
	
	public String read() {
		return content;
	}

}
