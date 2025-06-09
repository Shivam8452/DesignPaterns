package com.designPatterns.behavioural.iteratorPatt.bookCollection;

import java.util.Iterator;

import com.designPatterns.behavioural.iteratorPatt.bookCollection.BookCollection.BookIterator;

public class Main {
	
	public static void main(String[] args) {
		BookCollection books = new BookCollection();
		
		Book book = new Book("Java");
		Book book2 = new Book("C++");
		Book book3 = new Book("Python");
		
		books.addBooks(book);
		books.addBooks(book2);
		books.addBooks(book3);
		
		Iterator<Book> iter = books.createIterator();
		
		while(iter.hasNext()) {
			Book b = iter.next();
			System.out.println(b.getBook());
		}
	}

}
