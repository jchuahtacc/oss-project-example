package edu.utexas.tacc.jchuah.wordle.model.base;

import edu.utexas.tacc.jchuah.wordle.model.Word;

public interface BaseWordList {
	// Stores Words
	
	// Add a word to this collection
	// Words may never be added more than once
	// If add is called with a word that already appears in this collection, the matching Word
	// object should have its increment method called
	public void add(String newWord);
	
	// Return the number of unique Word elements
	public int size();
	
	// Return Word objects as an array, sorted in descending order of occurrences
	public Word[] getArray();
}
