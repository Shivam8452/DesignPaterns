package com.designPatterns.behavioural.iteratorPatt.bookCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
	
	private List<Book> bookCol = new ArrayList();
	
	public void addBooks(Book book) {
		bookCol.add(book);
	}
	
	public List<Book> getBooks(){
		return bookCol;
	}
	
	public Iterator<Book> createIterator(){
		return new BookIterator(this.bookCol);
	}
	
	
	public class BookIterator implements Iterator<Book>{
		
		private int position = 0;
		private List<Book> books;
		
		public BookIterator(List<Book> books) {
			this.books=books;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return position<books.size();
		}

		@Override
		public Book next() {
			// TODO Auto-generated method stub
			return books.get(position++);
		}
		
	}

}
