package com.reabelx.JavaCalc;

/* 2014 ryan reabel */

/*Console Input Imports.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaCalcMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int menuSelect;
		// Initialize the menu.
		System.out.println("Welcome. This is javaCalc v0.0.10122014");
		System.out
				.println("Select a calculation: 1:Add, 2:Sub, 3:Mul, 4:Div :");
		// grab user input, if not an integer, throw error.
		try {
			menuSelect = Integer.parseInt(reader.readLine());

			switch (menuSelect) {
			case 1:
				add();
				break;
			case 2:
				subtract();
				break;
			case 3:
				multiply();
			case 4:
				divide();
			default:
				break;
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Please enter a number.");
		} finally {
			System.out.println("Thank you for using this app.");
		}

	}
	
	public static void add(){
		String added = "added";
		int firstNumber; 
		int secondNumber;
		try {
			firstNumber = getNumber(added);
			secondNumber = getNumber(added);
			int result = firstNumber + secondNumber;
			System.out.println(firstNumber+ "+" +secondNumber+ "="+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void subtract(){
		String added = "subtracted";
		int firstNumber; 
		int secondNumber;
		try {
			firstNumber = getNumber(added);
			secondNumber = getNumber(added);
			int result = firstNumber - secondNumber;
			System.out.println(firstNumber+ "-" +secondNumber+ "="+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void multiply(){
		String actioned = "multiplied";
		int firstNumber; 
		int secondNumber;
		try {
			firstNumber = getNumber(actioned);
			secondNumber = getNumber(actioned);
			int result = firstNumber * secondNumber;
			System.out.println(firstNumber+ "*" +secondNumber+ "="+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void divide(){
		String divided = "divided";
		int firstNumber; 
		int secondNumber;
		try {
			firstNumber = getNumber(divided);
			secondNumber = getNumber(divided);
			int result = firstNumber / secondNumber;
			System.out.println(firstNumber+ "/" +secondNumber+ "="+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static int getNumber(String calc) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Please enter a number to be " +calc);
		return Integer.parseInt(reader.readLine());
		
	}
	
}
