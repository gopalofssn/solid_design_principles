package com.gs.pattern.solid.singleresponsibility;

public class BookPrinter {

	private Book book;

	public BookPrinter(Book book) {
		this.book = book;
	}

	public void printBookAuthor() {
		System.out.println("Author - " + book.getAuthor());
	}

	public void printBookContentWordByLine() {
		TextManipulator textManipulator = new TextManipulator(this.book.getContent());
		TextPrinter textPrinter = new TextPrinter(textManipulator);
		textPrinter.printEachWordInNewLine();
	}

	public void printBookContentSentanceByLine() {
		TextManipulator textManipulator = new TextManipulator(this.book.getContent());
		TextPrinter textPrinter = new TextPrinter(textManipulator);
		textPrinter.printEachSentanceAsNewLine();
	}

	public void printBookName() {
		System.out.println("Book Name - " + book.getName());
	}

}
