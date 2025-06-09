package com.designPatterns.creational.abstractFactoryPatter.theme;

public class MacOSFactory implements UIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButtons();
	}

	@Override
	public ScrollBar createScrollbar() {
		// TODO Auto-generated method stub
		return new MacScrollBar();
	}

}
