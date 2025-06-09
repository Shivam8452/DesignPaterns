package com.uml;

class Animal{
	public void eat() {
		System.out.println("Dog is eating");
	}
}

class Dog extends Animal{
	public void barks() {
		System.out.println("Dog is barking");
	}
}

public class inheritanceExample {
	
	public static void main(String args[]) {
		Dog d = new Dog();
		d.barks();
		d.eat();
	}
	

}
