package com.designPatterns.behavioural.iteratorPatt.bookCollection;

public class Book implements Comparable<Book> {
	
	private String title;
	
	public Book(String title) {
		this.title=title;
	}
	
	public String getBook() {
		return title;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.title);
	}

}
