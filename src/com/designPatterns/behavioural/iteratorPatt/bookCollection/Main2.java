package com.designPatterns.behavioural.iteratorPatt.bookCollection;

import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookCollectionV2 books = new BookCollectionV2();
		
		books.addBooks(new Book("Java"));
		books.addBooks(new Book("C++"));
		books.addBooks(new Book("Python"));
		
		Iterator<Book> iter = books.iterator();
		
		while(iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book.getBook());
		}

	}

}
