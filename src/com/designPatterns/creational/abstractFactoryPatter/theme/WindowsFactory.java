package com.designPatterns.creational.abstractFactoryPatter.theme;

public class WindowsFactory implements UIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public ScrollBar createScrollbar() {
		// TODO Auto-generated method stub
		return new WindowScrollBar();
	}

}
