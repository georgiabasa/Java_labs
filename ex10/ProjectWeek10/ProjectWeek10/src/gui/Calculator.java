package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import algorithms.CalculatePostFixExpression;
import algorithms.CompileInFixExpression;
import algorithms.ConvertInfixToPostFix;

public class Calculator extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
    protected static JTextField calcLabel=new JTextField(""); 
	public Calculator(){
		this.setSize(250, 250);	
		this.setTitle("[ECE_Υ325] Week 10");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 		
		this.setFocusable(true);
		
		
		this.setLayout(new BorderLayout());
		this.add(calcLabel,BorderLayout.NORTH);
		this.add(createCalculatorPanel());
		
		setResizable(false);
		this.setVisible(true);
		this.setBackground(Color.RED);
	}
	
	private JPanel createCalculatorPanel() {
		JPanel p1=new JPanel();
		
		p1.setLayout(new GridLayout(5,4));
		
		p1.add(new MyButton("C",Color.black,new java.awt.Color(245,190,190))); 
		p1.add(new MyButton("(",Color.black,new java.awt.Color(245,190,190))); 
		p1.add(new MyButton(")",Color.black,new java.awt.Color(245,190,190)));
		p1.add(new MyButton("/",Color.black,new java.awt.Color(245,190,190)));
		
		
		p1.add(new MyButton("7",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("8",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("9",Color.black,new java.awt.Color(240,220,220)));
		p1.add(new MyButton("*",Color.black,new java.awt.Color(245,190,190)));
		
		p1.add(new MyButton("4",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("5",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("6",Color.black,new java.awt.Color(240,220,220)));
		p1.add(new MyButton("-",Color.black,new java.awt.Color(245,190,190)));
		
		p1.add(new MyButton("1",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("2",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("3",Color.black,new java.awt.Color(240,220,220)));
		p1.add(new MyButton("+",Color.black,new java.awt.Color(245,190,190)));
		
		p1.add(new MyButton("0",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton(".",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("^",Color.black,new java.awt.Color(240,220,220))); 
		p1.add(new MyButton("=",Color.black,new java.awt.Color(250,180,57)));
		p1.setBackground(new java.awt.Color(245,168,168));
		return p1;
		
	}
	
	
	protected static void appendToTextField(String append) {

		calcLabel.setText(calcLabel.getText() + append); 
	}

	protected static void clearTextField() {
		calcLabel.setText("");
	}
	
	protected static void initiateCalculation() {
		
		String infixExpression=calcLabel.getText();
		
		
		ConvertInfixToPostFix pstfix=new ConvertInfixToPostFix(infixExpression);
		//pstfix.print_infix();
		
		
		CompileInFixExpression infixeval=new CompileInFixExpression(pstfix.getinFixExpression()); 
		if(!infixeval.parseErrors()){
			
			pstfix.convertToPostfix();
			//pstfix.print_postfix();
			clearTextField();
			CalculatePostFixExpression evalPostfix=new CalculatePostFixExpression (pstfix.getPostFixExpression());
			appendToTextField(String.valueOf(evalPostfix.getResult()));
		}
		
	
	}
}
