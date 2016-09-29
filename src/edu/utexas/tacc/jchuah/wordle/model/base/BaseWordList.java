package edu.utexas.tacc.jchuah.wordle.model.base;

import edu.utexas.tacc.jchuah.wordle.model.Word;

public interface BaseWordList {
	// TODO: Pick a structure to store new words
	
	// TODO: Implement this method to store new words
	//			- Words should not occur in your word list more
	//			than once, regardless of case
	//			- If a Word already occurs in your list, call
	//			that word's increment() method instead
	public void add(String newWord);
	
	// TODO: Return the number of words
	public int size();
	
	// TODO: Return an array of all instances of Word that you have stored,
	//			sorted in order of occurrences
	public Word[] getArray();
}
