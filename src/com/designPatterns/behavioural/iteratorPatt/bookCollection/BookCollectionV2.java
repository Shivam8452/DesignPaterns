package com.designPatterns.behavioural.iteratorPatt.bookCollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookCollectionV2 implements Iterable<Book> {
	
	private Set<Book> books = new TreeSet<>();
	
	public void addBooks(Book book) {
		books.add(book);
	}
	
	public Set<Book> getBooks() {
		return books;
	}

	@Override
	public Iterator<Book> iterator() {
		// TODO Auto-generated method stub
		return books.iterator();
	}
	

}
