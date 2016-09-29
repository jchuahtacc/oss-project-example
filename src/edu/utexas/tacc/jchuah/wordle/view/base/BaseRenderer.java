package edu.utexas.tacc.jchuah.wordle.view.base;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JLabel;
import edu.utexas.tacc.jchuah.wordle.Main;
import edu.utexas.tacc.jchuah.wordle.model.Word;

public abstract class BaseRenderer {
	static double dt = 0.5;
	static double r = 2;
	
	BaseFontList fonts = new BaseFontList();
	ArrayList<JLabel> added = new ArrayList<JLabel>();
	
	public void placeWords() {

		added.clear();
		
		Word[] wordArray = Main.words.getArray();
		
		pickSizes(wordArray);
		
		for (Word word : wordArray) {
			addWord(word);
		}
		
		Main.window.pack();
	}
	
	public abstract void pickSizes(Word[] wordArray);
	
	// Finds an empty location
	public void setEmptyLocation(JLabel l) {

		int width = l.getWidth();
		int height = l.getHeight();
		
		boolean insert = false;
		
		double t = 0;
		Rectangle adding = new Rectangle(0, 0, width, height);
		Rectangle present = new Rectangle(0, 0, 20, 20);
		int x = 0;
		int y = 0;
		while (!insert) {
			x = (int)(t * Math.cos(t) * r);
			y = (int)(t * Math.sin(t) * r);
			adding.x = x;
			adding.y = y;
			for (JLabel label : added) {
				Point p = label.getLocation();
				present.width = label.getWidth();
				present.height = label.getHeight();
				present.x = p.x;
				present.y = p.y;
				if (!adding.intersects(present)) {
					l.setLocation(adding.x, adding.y);
					return;
				}
			}
		}
	}
	
	// Add word to screen
	public void addWord(Word word) {
		JLabel l = new JLabel(word.word);
		Font f = fonts.get(word.size);
		l.setFont(f);
		setEmptyLocation(l);
		added.add(l);
		Main.window.getContentPane().add(l);
	}
}
