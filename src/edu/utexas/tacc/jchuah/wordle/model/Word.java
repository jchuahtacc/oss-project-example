package edu.utexas.tacc.jchuah.wordle.model;

public class Word {
	// word stored in class
	public String word = "";

	// number of occurrences of this word
	public int count = 0;

	// size of this word, corresponding to FontList
	public String size = "";
	
	public Word(String word) {
		this.word = word;
	}
	
	public void increment() {
		count++;
	}
}
