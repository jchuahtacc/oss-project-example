package edu.utexas.tacc.jchuah.wordle.controller;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import edu.utexas.tacc.jchuah.wordle.Main;

public class AddDialog extends JDialog {
	JTextField input = new JTextField();
	JButton ok = new JButton("OK");
	JLabel prompt = new JLabel("Enter a word");
	JPanel panel = new JPanel();
	public AddDialog() {
		super(Main.window);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		prompt.setSize(120, 30);
		panel.add(prompt);
		input.setSize(120, 30);
		panel.add(input);
		ok.setSize(120, 30);
		panel.add(ok);
		setUndecorated(true);
		getContentPane().add(panel);
		JRootPane root = SwingUtilities.getRootPane(ok);
		root.setDefaultButton(ok);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.words.add(input.getText());
			}
		});
		
		pack();
	}
}
