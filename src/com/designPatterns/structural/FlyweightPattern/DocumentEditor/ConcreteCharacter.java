package com.designPatterns.structural.FlyweightPattern.DocumentEditor;

public class ConcreteCharacter implements CharacterFlyweight {
	private final String fontStyle;
    private final int fontSize;
    private final String color;

    public ConcreteCharacter(String fontStyle, int fontSize, String color) {
        this.fontStyle = fontStyle;
        this.fontSize = fontSize;
        this.color = color;
    }
	@Override
	public void display(String character) {
		// TODO Auto-generated method stub
		System.out.printf("Character: %s, Font Style: %s, Font Size: %d, Color: %s%n", 
                character, fontStyle, fontSize, color);
	}

}
