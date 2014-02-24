package jet;

import static javax.swing.GroupLayout.Alignment.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.KeyboardFocusManager;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import lexerAndParser.*;
import ast.*;

public class start extends JFrame {
	int textFieldFocus = 0;
	LogicStatement[] startFomula = new LogicStatement[10];
	LogicStatement goalFomula;
	final JTextField[] fomulaList = new JTextField[11];
	public start() {
		
		JLabel label0 = new JLabel("Start Formula 1: ");
		final JTextField textField0 = new JTextField(40);
		JLabel label1 = new JLabel("Start Formula 2: ");
		final JTextField textField1 = new JTextField(40);
		JLabel label2 = new JLabel("Start Formula 3: ");
		final JTextField textField2 = new JTextField(40);
		JLabel label3 = new JLabel("Start Formula 4: ");
		final JTextField textField3 = new JTextField(40);
		JLabel label4 = new JLabel("Start Formula 5: ");
		final JTextField textField4 = new JTextField(40);
		JLabel label5 = new JLabel("Start Formula 6: ");
		final JTextField textField5 = new JTextField(40);
		JLabel label6 = new JLabel("Start Formula 7: ");
		final JTextField textField6 = new JTextField(40);
		JLabel label7 = new JLabel("Start Formula 8: ");
		final JTextField textField7 = new JTextField(40);
		JLabel label8 = new JLabel("Start Formula 9: ");
		final JTextField textField8 = new JTextField(40);
		JLabel label9 = new JLabel("Start Formula 10: ");
		final JTextField textField9 = new JTextField(40);
		JLabel goalLabel = new JLabel("Goal: ");
		final JTextField goal = new JTextField(40);
		final String emptyField = textField0.getText();
		fomulaList[0] = textField0;
		fomulaList[1] = textField1;
		fomulaList[2] = textField2;
		fomulaList[3] = textField3;
		fomulaList[4] = textField4;
		fomulaList[5] = textField5;
		fomulaList[6] = textField6;
		fomulaList[7] = textField7;
		fomulaList[8] = textField8;
		fomulaList[9] = textField9;
		fomulaList[10] = goal;
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
		JButton checkButton = new JButton("check");
		JButton cancelButton = new JButton("Cancel");

		// remove redundant default border of check boxes - they would hinder
		// correct spacing and aligning (maybe not needed on some look and
		// feels)
		andSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		iffSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		orSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		truthSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		falsitySymbol
				.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		equalsSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		impliesSymbol
				.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		notSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		forAllSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		thereExistSymbol.setBorder(BorderFactory.createEmptyBorder(15, 15, 15,
				15));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup(LEADING)
								.addComponent(label0).addComponent(label1)
								.addComponent(label2).addComponent(label3)
								.addComponent(label4).addComponent(label5)
								.addComponent(label6).addComponent(label7)
								.addComponent(label8).addComponent(label9)
								.addComponent(goalLabel))
				.addGroup(
						layout.createParallelGroup(LEADING)
								.addComponent(textField0)
								.addComponent(textField1)
								.addComponent(textField2)
								.addComponent(textField3)
								.addComponent(textField4)
								.addComponent(textField5)
								.addComponent(textField6)
								.addComponent(textField7)
								.addComponent(textField8)
								.addComponent(textField9)
								.addComponent(goal)
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
								.addComponent(checkButton)
								.addComponent(cancelButton)));

		layout.linkSize(SwingConstants.HORIZONTAL, checkButton, cancelButton);

		layout.setVerticalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label0).addComponent(textField0)
								.addComponent(checkButton))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label1).addComponent(textField1)
								.addComponent(cancelButton))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label2).addComponent(textField2))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label3).addComponent(textField3))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label4).addComponent(textField4))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label5).addComponent(textField5))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label6).addComponent(textField6))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label7).addComponent(textField7))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label8).addComponent(textField8))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(label9).addComponent(textField9))
				.addGroup(
						layout.createParallelGroup(BASELINE)
								.addComponent(goalLabel).addComponent(goal))
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

		andSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.AND);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		iffSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.IFF);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		orSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.OR);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		truthSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.TRUTH);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		falsitySymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.FALSITY);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		equalsSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.EQUALS);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		impliesSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.IMPLIES);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		notSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.NOT);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		forAllSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.FORALL);
				fomulaList[textFieldFocus].requestFocus();
			}
		});

		thereExistSymbol.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fomulaList[textFieldFocus].setText(fomulaList[textFieldFocus].getText() + Symbol.THEREEXISTS);
				fomulaList[textFieldFocus].requestFocus();
			}
		});
		
		textField0.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 0;

			}
		});

		textField1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 1;

			}
		});

		textField2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 2;

			}
		});

		textField3.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 3;

			}
		});

		textField4.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 4;

			}
		});

		textField5.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 5;

			}
		});

		textField6.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 6;

			}
		});

		textField7.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 7;

			}
		});

		textField8.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 8;

			}
		});

		textField9.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 9;

			}
		});

		goal.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {

				textFieldFocus = 10;

			}
		});

		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < 11; i++) { 
					
					fomulaList[i].setText("");
					
				}

			}
		});

		checkButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < fomulaList.length; i++) { 
					
					System.out.println("\n dfjhklasdhfkl;adshf;lkjas : " + i + " \n");
					System.out.println("in between");
					System.out.println(fomulaList[i].getText());
					System.out.println("in between");
					if(fomulaList[i].getText() == emptyField) { 
						System.out.println("fuck");
						
					}
					
					if (i != 10) {
						if (fomulaList[i].getText() != null) {
							
							String s = " " + fomulaList[i].getText();
							InputStream is;
							try {
								is = new ByteArrayInputStream(s.getBytes("UTF-8"));
								Lexer l = new Lexer(is);
								parser p = new parser(l);
								startFomula[i]= (LogicStatement) p.parse().value;
								System.out.println("try this");
								System.out.println("Start Fomula " + i + " : " + startFomula[i].toString());
								// TODO
							} catch (UnsupportedEncodingException e1) {
								e1.printStackTrace();
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
						}
						
					} else { 
						String s = goal.getText();
						InputStream is;
						try {
							is = new ByteArrayInputStream(s.getBytes("UTF-8"));
							Lexer l = new Lexer(is);
							parser p = new parser(l);
							goalFomula= (LogicStatement) p.parse().value;
							System.out.println("Goal Fomula: " + goalFomula.toString());
							// TODO
						} catch (UnsupportedEncodingException e1) {
							e1.printStackTrace();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					
				}
				

			}
		});

		

		setTitle("IP");
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}


	public static void main(String args[]) {
		// List<LogicStatement> l = new ArrayList();
		// LogicStatement a = new Variable("a");
		// LogicStatement b = new Variable("b");
		// l.add(a);
		// l.add(b);
		// System.out.println(l.size());

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
				new start().setVisible(true);
			}
		});
	}
}