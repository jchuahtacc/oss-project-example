package edu.utexas.tacc.jchuah.wordle;

import edu.utexas.tacc.jchuah.wordle.controller.AddDialog;
import edu.utexas.tacc.jchuah.wordle.model.WordList;
import edu.utexas.tacc.jchuah.wordle.model.base.BaseWordList;
import edu.utexas.tacc.jchuah.wordle.view.FontList;
import edu.utexas.tacc.jchuah.wordle.view.MainWindow;
import edu.utexas.tacc.jchuah.wordle.view.Renderer;
import edu.utexas.tacc.jchuah.wordle.view.base.BaseFontList;
import edu.utexas.tacc.jchuah.wordle.view.base.BaseRenderer;

public class Main {
	public static MainWindow window = new MainWindow();
	public static AddDialog add = new AddDialog();
	
	// XXX If you have other WordList, Renderer or FontList tasks you want to try, set them here.
	public static BaseWordList words = new WordList();
	public static BaseRenderer renderer = new Renderer();
	public static BaseFontList fonts = new FontList();
	
	public static void main(String[] args) {
		window.setVisible(true);
		add.setVisible(true);
	}

}
