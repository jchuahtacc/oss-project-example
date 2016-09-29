package edu.utexas.tacc.jchuah.wordle.view;

import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

import edu.utexas.tacc.jchuah.wordle.Main;
import edu.utexas.tacc.jchuah.wordle.controller.AddDialog;
import edu.utexas.tacc.jchuah.wordle.model.base.BaseWordList;

public class MainWindow extends JFrame {
	public MainWindow() {
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getRootPane().addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				if (Main.add != null) {
					Rectangle r = getBounds();
					Main.add.setLocation(r.x + r.width, r.y);
				}				
			}
			
		});
	}
}
