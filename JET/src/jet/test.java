package jet;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import lexerAndParser.Lexer;
import lexerAndParser.parser;
import ast.LogicStatement;
import ast.Symbol;

public class test extends JFrame {
	public test() {
		JLabel label = new JLabel("Start Formula");
		JLabel label2 = new JLabel("Result");
		final JLabel result = new JLabel(" ");
		final JTextField textField = new JTextField(40);
		JButton andSymbol = new JButton("∧");
		JButton iffSymbol = new JButton("↔");
		JButton orSymbol = new JButton("∨");
		JButton truthSymbol = new JButton("⊤");
		JButton falsitySymbol = new JButton("⊥");
		JButton equalsSymbol = new JButton("=");
		JButton impliesSymbol = new JButton("→");
		JButton notSymbol = new JButton("¬");
		JButton forAllSymbol = new JButton("∀");
		JButton thereExistSymbol = new JButton("∃");
		JButton showTreeButton = new JButton("Show Tree");
		JButton cancelButton = new JButton("Cancel");

		// remove redundant default border of check boxes - they would hinder
		// correct spacing and aligning (maybe not needed on some look and
		// feels)
		andSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		iffSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		orSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		truthSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		falsitySymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		equalsSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		impliesSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		notSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		forAllSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		thereExistSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup(LEADING).addComponent(label)
								.addComponent(label2))
				.addGroup(
						layout.createParallelGroup(LEADING)
								.addComponent(textField)
								.addComponent(result)
								.addGroup(
										layout.createSequentialGroup()
												.addGroup(
														layout.createParallelGroup(
																LEADING)
																.addComponent(
																		andSymbol)
																.addComponent(
																		iffSymbol))
												.addGroup(
														layout.createParallelGroup(
																LEADING)
																.addComponent(
																		orSymbol)
																.addComponent(
																		truthSymbol))
												.addGroup(
														layout.createParallelGroup(
																LEADING)
																.addComponent(
																		falsitySymbol)
																.addComponent(
																		equalsSymbol))
												.addGroup(
														layout.createParallelGroup(
																LEADING)
																.addComponent(
																		impliesSymbol)
																.addComponent(
																		notSymbol))
												.addGroup(
														layout.createParallelGroup(
																LEADING)
																.addComponent(
																		forAllSymbol)
																.addComponent(
																		thereExistSymbol))))
				.addGroup(
						layout.createParallelGroup(LEADING)
								.addComponent(showTreeButton)
								.addComponent(cancelButton)));

		layout.linkSize(SwingConstants.HORIZONTAL, showTreeButton, cancelButton);

		layout.setVerticalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label).addComponent(textField)
								.addComponent(showTreeButton))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label2).addComponent(result)
								.addComponent(cancelButton))
				.addGroup(
						layout.createParallelGroup(LEADING)
								.addGroup(
										layout.createSequentialGroup()
												.addGroup(
														layout.createParallelGroup(
																BASELINE)
																.addComponent(
																		andSymbol)
																.addComponent(
																		orSymbol)
																.addComponent(
																		falsitySymbol)
																.addComponent(
																		impliesSymbol)
																.addComponent(
																		forAllSymbol))
												.addGroup(
														layout.createParallelGroup(
																BASELINE)
																.addComponent(
																		iffSymbol)
																.addComponent(
																		truthSymbol)
																.addComponent(
																		equalsSymbol)
																.addComponent(
																		notSymbol)
																.addComponent(
																		thereExistSymbol)))));

		setTitle("IP");
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		andSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.AND);

			}
		});

		iffSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.IFF);

			}
		});

		orSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.OR);

			}
		});

		truthSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.TRUTH);

			}
		});

		falsitySymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.FALSITY);

			}
		});

		equalsSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.EQUALS);

			}
		});

		impliesSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.IMPLIES);

			}
		});

		notSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.NOT);

			}
		});

		forAllSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.FORALL);

			}
		});

		thereExistSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + Symbol.THEREEXISTS);

			}
		});
		
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");

			}
		});
		
		showTreeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				InputStream is;
				try {
					is = new ByteArrayInputStream(s.getBytes("UTF-8"));
					Lexer l = new Lexer(is);
					parser p = new parser(l);
					LogicStatement ls = (LogicStatement) p.parse().value;
					result.setText(ls.toString());
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager
							.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					// "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					// UIManager.getCrossPlatformLookAndFeelClassName());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				new test().setVisible(true);
			}
		});
	}
}