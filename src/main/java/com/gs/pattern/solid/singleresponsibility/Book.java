package com.gs.pattern.solid.singleresponsibility;

public class Book {

	private String author;
	private String name;
	private String content;

	public Book(String author, String name, String content) {
		super();
		this.author = author;
		this.name = name;
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
