package com.designPatterns.behavioural.memento.GraphicDesigner;

public class GraphicMemento {
	private final String  ShapeType;
	private final int x;
	private final int y;
	private final String color;
	private final int size;
	
	public GraphicMemento(String Shapetype, int x, int y, String color, int size) {
		this.ShapeType=Shapetype;
		this.x=x;
		this.y=y;
		this.color=color;
		this.size=size;
	}
	
	public String getShapeType() {
		return ShapeType;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSize() {
		return size;
	}
}
