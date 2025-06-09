package com.designPatterns.creational.abstractFactoryPatter.theme;

public class Application {
	
	private Button button;
	
	private ScrollBar scrollBar;
	
	public Application(UIFactory factory) {
		this.button=factory.createButton();
		this.scrollBar=factory.createScrollbar();
	}
	
	public void renderUI() {
		button.render();
		scrollBar.scroll();
	}
	
	public static void main(String[] args) {
		Application app = new Application(new MacOSFactory());
		app.renderUI();
	}

}
