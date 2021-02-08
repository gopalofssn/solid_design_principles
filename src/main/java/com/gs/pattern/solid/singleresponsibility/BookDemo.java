package com.gs.pattern.solid.singleresponsibility;

public class BookDemo {

	public static void main(String[] args) {
		Book book = new Book("Dr Sues", "Jingle", "This is content and kids love it !!!. very good book. nice");
		BookPrinter bookPrinter = new BookPrinter(book);
		bookPrinter.printBookContentSentanceByLine();
		bookPrinter.printBookContentWordByLine();
		
		System.out.println("** \nOriginal book content - " + book.getContent());
	}

}
