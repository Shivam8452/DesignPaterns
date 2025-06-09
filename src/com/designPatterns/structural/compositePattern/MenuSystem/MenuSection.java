package com.designPatterns.structural.compositePattern.MenuSystem;

import java.util.ArrayList;
import java.util.List;

public class MenuSection implements MenuComponent{
	
	private String sectionName;
    private List<MenuComponent> menuComponents;

    public MenuSection(String sectionName) {
        this.sectionName = sectionName;
        this.menuComponents = new ArrayList<>();
    }

    public void addItem(MenuComponent component) {
    	menuComponents.add(component);
    }
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("MenuSection: "+sectionName);
		for(MenuComponent component: menuComponents) {
			component.print();
		}
		
	}

}
