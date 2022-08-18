// Simple airthmatic calculator

import java.util.Scanner;


public class Calculator {

		
		  public static void main(String[] args) {

		    char operator;
		    double numb1, numb2, result;

		    // Creating an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // asking user to choose operation
		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = input.next().charAt(0);

		    // asking user to input numbers
		    System.out.println("Enter first number: ");
		    numb1 = input.nextDouble();

		    System.out.println("Enter second number: ");
		    numb2 = input.nextDouble();

		    switch (operator) {

		   
		      case '+':
		        result = numb1 + numb2;
		        System.out.println(numb1 + " + " + numb2 + " = " + result);
		        break;

		      
		      case '-':
		        result = numb1 - numb2;
		        System.out.println(numb1 + " - " + numb2 + " = " + result);
		        break;

	
		      case '*':
		        result = numb1 * numb2;
		        System.out.println(numb1 + " * " + numb2 + " = " + result);
		        break;

		     
		      case '/':
		        result = numb1 / numb2;
		        System.out.println(numb1 + " / " + numb2 + " = " + result);
		        break;

		      
		    }

		 
		  }
		}