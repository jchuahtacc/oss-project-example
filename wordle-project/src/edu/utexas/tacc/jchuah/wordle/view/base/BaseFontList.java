package edu.utexas.tacc.jchuah.wordle.view.base;

import java.awt.Font;
import java.util.HashMap;

public class BaseFontList {
	HashMap<String, Font> map = new HashMap<String, Font>();
	
	// TODO: In child classes, add your own fonts and labels
	public BaseFontList() {
		map.put("big", new Font("Courier New", Font.ITALIC, 16));
	}
	
	public Font get(String label) {
		return map.get(label);
	}
	
	public boolean validFont(String label) {
		return map.keySet().contains(label);
	}
}
