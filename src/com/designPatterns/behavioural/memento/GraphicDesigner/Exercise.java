package com.designPatterns.behavioural.memento.GraphicDesigner;

import java.util.Scanner;

public class Exercise {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
      GraphicEditor graphicEditor = new GraphicEditor();
      CareTaker care = new CareTaker();
      for (int i = 0; i < 3; i++) {
          String shape = sc.next(); 
          int x = sc.nextInt();     
          int y = sc.nextInt();     
          String color = sc.next(); 
          int size = sc.nextInt(); 
          
          graphicEditor.setShape(shape, x, y, color, size);
          care.saveState(graphicEditor);
          
          
      }
      
      sc.close();
      care.undo(graphicEditor);
      System.out.println(graphicEditor.getShape());

  }
}
