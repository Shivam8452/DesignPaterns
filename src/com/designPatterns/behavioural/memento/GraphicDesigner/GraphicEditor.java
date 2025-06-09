package com.designPatterns.behavioural.memento.GraphicDesigner;

public class GraphicEditor {
	private String ShapeType;
	private int x;
	private int y;
	private String color;
	private int size;
	
	public void setShape(String Shapetype, int x, int y, String color, int size) {
		this.ShapeType=Shapetype;
		this.x=x;
		this.y=y;
		this.color=color;
		this.size=size;
	}
	
	public GraphicMemento save() {
		return new GraphicMemento(ShapeType, x, y, color, size);
	}
	
	public void restore(GraphicMemento memento) {
		ShapeType = memento.getShapeType();
		x=memento.getX();
		y=memento.getY();
		color=memento.getColor();
		size=memento.getSize();
	}
	
	
	public String getShape() {
		return "Shape type: "+ShapeType+" Position( "+x+","+y+")"+"color: "+color+" size:"+size;
	}
	
	

}
