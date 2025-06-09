package com.uml;

class Teacher{
	private String name;
	
	public Teacher(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void teaches(Student s) {
		System.out.println("Teacher:"+name+"Teaches: "+s.getName());
		
	}
	
}

class Student{
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

public class AssociationExample {
	
	public static void main(String args[]) {
		Teacher t = new Teacher("Prateek");
		Student s = new Student("Shivam");
		
		t.teaches(s);
	}

}
