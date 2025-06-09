package com.designPatterns.creational.prototyprPattern.videoGame;

public interface Character<T> {
	public T Clone();
    void displayAttributes();

}
