package com.uml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Professor{
	private String name;
	
	public Professor(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}

class Departments{
private String name;
	
	private List<Professor> prof;
	
	public Departments(String name, List<Professor> prof) {
		this.name = name;
		this.prof=prof;
	}
	
	public void showProfessor() {
		for(Professor p: prof) {
			System.out.println(p.getName());
		}
	}
}

public class AggregationExample {
	public static void main(String args[]) {
		String departName = "CSE";
		Professor p1 = new Professor("Shivam");
		Professor p2 = new Professor("Prateek");
		List<Professor> p =  Arrays.asList(p1,p2);
		
		
		
		Departments d = new Departments(departName, p);
		d.showProfessor();
	}
	
}
