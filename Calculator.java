/*Names: Brian Cabantug, Huy Le
 *Project No.: Project 10 Part 2
 *Due Date: November 3, 2016
 *Professor: Ray Ahmadnia
 *
 *Description: The program is a calculator that can calculate addition, subtraction, multiplication,
 *division, factorials, and operations of negative numbers. A clear button is added to clear the text field.
 */

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener{
	//creation of components for the calculator
	Label
		lblCalc = new Label("Texas Instruments TI-35X");
	Button
		btnOne = new Button("1"),
		btnTwo = new Button("2"),
		btnThree =  new Button("3"),
		btnFour = new Button("4"),
		btnFive = new Button("5"),
		btnSix = new Button("6"),
		btnSeven = new Button("7"),
		btnEight = new Button("8"),
		btnNine = new Button("9"),
		btnZero =  new Button("0"),
		btnEQ = new Button("="),
		btnNegPos = new Button("+/-"),
		btnClear = new Button("CLEAR"),
		btnPlus = new Button("+"),
		btnMinus = new Button("-"),
		btnMultiply = new Button("*"),
		btnDivide = new Button("/"),
		btnFactorial = new Button("n!");
	TextField
		txtWin = new TextField();
	
	String n = " ", n1st, n2st;
	int n1, n2;
	
	//initializes the buttons and applet and adds them to the panel
	public void init(){
		setLayout(null);
		//adds the window to add to the 
		txtWin.setBounds(20,20, 200,50);
		//makes it so that typing will not affect the window
		txtWin.setEditable(false);
		add(txtWin);
		
		//first row of buttons
		btnSeven.setBounds(20, 90, 40, 40);
		add(btnSeven);
		btnEight.setBounds(70, 90, 40, 40);
		add(btnEight);
		btnNine.setBounds(120, 90, 40,40);
		add(btnNine);
		btnPlus.setBounds(170, 90, 40,40);
		add(btnPlus);
		
		//second row of buttons
		btnFour.setBounds(20, 140, 40, 40);
		add(btnFour);
		btnFive.setBounds(70, 140, 40, 40);
		add(btnFive);
		btnSix.setBounds(120, 140, 40,40);
		add(btnSix);
		btnMinus.setBounds(170, 140, 40,40);
		add(btnMinus);
		
		//3rd row of buttons
		btnOne.setBounds(20, 190, 40, 40);
		add(btnOne);
		btnTwo.setBounds(70, 190, 40, 40);
		add(btnTwo);
		btnThree.setBounds(120, 190, 40,40);
		add(btnThree);
		btnMultiply.setBounds(170, 190, 40,40);
		add(btnMultiply);
		
		//4th row of buttons
		btnZero.setBounds(20, 240, 40, 40);
		add(btnZero);
		btnEQ.setBounds(70, 240, 90, 40);
		add(btnEQ);
		btnDivide.setBounds(170, 240, 40,40);
		add(btnDivide);
		
		//5th row of buttons
		btnNegPos.setBounds(20, 290, 40, 40);
		add(btnNegPos);
		btnClear.setBounds(70, 290, 90, 40);
		add(btnClear);
		btnFactorial.setBounds(170, 290, 40,40);
		add(btnFactorial);
		//places label at bottom
		lblCalc.setBounds(20,330,150,50);
		add(lblCalc);
		
		
		//adds actionListener to all buttons
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnFour.addActionListener(this);
		btnFive.addActionListener(this);
		btnSix.addActionListener(this);
		btnSeven.addActionListener(this);
		btnEight.addActionListener(this);
		btnNine.addActionListener(this);
		btnZero.addActionListener(this);
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnEQ.addActionListener(this);
		btnNegPos.addActionListener(this);
		btnClear.addActionListener(this);
		btnFactorial.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e){
		//when the number buttons are pressed
		if(e.getSource() == btnOne){
			n+="1";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnTwo){
			n+="2";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnThree){
			n+="3";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnFour){
			n+="4";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnFive){
			n+="5";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnSix){
			n+="6";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnSeven){
			n+="7";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnEight){
			n+="8";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnNine){
			n+="9";
			txtWin.setText(n);
		}
		else if(e.getSource() == btnZero){
			n+="0";
			txtWin.setText(n);
		}
		
		//operation buttons 
		//when add button is pressed
		else if(e.getSource() == btnPlus){
			//adds a plus sign to the string
			n += " + ";
			txtWin.setText(n);
		}
		//when subtract button is pressed
		else if(e.getSource() == btnMinus){
			//adds a subtraction sign to the string
			n += " - ";
			txtWin.setText(n);
		}
		//when multiply button is pressed
		else if(e.getSource() == btnMultiply){
			//adds a multiply sign to the string
			n += " * ";
			txtWin.setText(n);
		}
		//when divide is press
		else if(e.getSource() == btnDivide){
			//adds a divide sign to the string
			n += " / ";
			txtWin.setText(n);
		}
		
		//when negative sign is pressed
		else if(e.getSource() == btnNegPos){
			//adds negation sign to make number negative
			n+="-";
			txtWin.setText(n);
		}
		
		//when Factorial is pressed, (auto calculation)
		else if(e.getSource() == btnFactorial){
			//adds negation sign to make number negative
			n+=" !";
			txtWin.setText(n);
		}
		
		//when clear is pressed,clears the selection on txtWindow
		else if(e.getSource() == btnClear){
			txtWin.setText(" ");
			n = " ";
			txtWin.requestFocus();
		}
		
		//calculation
		//when equals is pressed
		else if(e.getSource() == btnEQ){
			//takes all the text in the window and processes it
			n = txtWin.getText().trim();
			String token[] = n.split(" ");
			//if factorial calculation
			if(token[1].equals("!")){
				n1 = Integer.parseInt(token[0]);
				int ans = 1;
				//calculates factorial
				for(int i = 1; i <= n1; i++){
					ans *= i;
				}
				//displays the calculation
				txtWin.setText(token[0] + "! " + " = "+ Integer.toString(ans));
			}
			else{
				//parses the numbers
				n1 = Integer.parseInt(token[0]);
				n2 = Integer.parseInt(token[2]);		
				//if addition
				if(token[1].equals("+")){
					//displays answer
					txtWin.setText(token[0] + " + " + token[2] + " = "+Integer.toString(n1+n2));
				}
				//subtraction
				else if(token[1].equals("-")){
					txtWin.setText(token[0] + " - " + token[2] + " = "+Integer.toString(n1-n2));
				}
				//multiplication
				else if(token[1].equals("*")){
					txtWin.setText(token[0] + " * " + token[2] + " = "+Integer.toString(n1*n2));
				}//division
				else if(token[1].equals("/")){
					txtWin.setText(token[0] + " / " + token[2] + " = "+Integer.toString(n1/n2));
				}
			}	
		}
	}
}
