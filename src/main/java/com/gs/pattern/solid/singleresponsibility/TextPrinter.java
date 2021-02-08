package com.gs.pattern.solid.singleresponsibility;

public class TextPrinter {

	private TextManipulator textManipulator;

	public TextPrinter(TextManipulator textManipulator) {
		this.textManipulator = textManipulator;
	}

	public void printEachWordInNewLine() {
		System.out.println("********* Printing Each Word as new Line *********** ");
		textManipulator.replaceWord(" ", "\n");
		System.out.println(textManipulator.getText());
	}

	public void printEachSentanceAsNewLine() {
		System.out.println("******** Printing Each Sentance as new Line ********* ");
		textManipulator.replaceWord(".", "\n");
		System.out.println(textManipulator.getText());
	}
	
}
