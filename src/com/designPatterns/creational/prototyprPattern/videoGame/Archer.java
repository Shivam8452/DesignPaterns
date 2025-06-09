package com.designPatterns.creational.prototyprPattern.videoGame;

public class Archer implements Character<Archer> {
	
	private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Archer(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

	@Override
	public Archer Clone() {
		// TODO Auto-generated method stub
		return new Archer(this.name, this.health, this.attackPower, this.defense);
	}

	@Override
	public void displayAttributes() {
		// TODO Auto-generated method stub
		System.out.println("Archer - Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower + ", Defense: " + defense);
	}

}
