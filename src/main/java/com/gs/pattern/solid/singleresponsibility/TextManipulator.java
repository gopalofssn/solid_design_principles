package com.gs.pattern.solid.singleresponsibility;

public class TextManipulator {

	private String text;

	public TextManipulator(String text) {
		this.text = text;
	}
	
	public void replaceWord(String oldWord, String newWord) {
		text = text.replace(oldWord, newWord);
	}
	
	public void removeWord(String wordToBeRemoved) {
		replaceWord(wordToBeRemoved, "");		
	}
	
	public String getText() {
		return this.text;
	}
}
