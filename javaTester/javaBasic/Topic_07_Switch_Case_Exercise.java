package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_07_Switch_Case_Exercise { 
	
	Scanner scanner = new Scanner(System.in);
	@Test
	public void Ex_01() {
		int a = scanner.nextInt();
		switch (a) {
			case 1:
				System.out.print("One");
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
			case 10:
				System.out.print("Ten");
				break;
			default:
				System.out.print("Only 1-10 are allowed");
				break;	
		}
		scanner.close();	
	}

	@Test
	public void Ex_02() {
		//Next line count '\n', so that if it go after nextInt, it will run incorrectly
		String operator = scanner.nextLine();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		//If input operator after number, should input without \n. Ex: 5 6 * (with * is input by below line of code):
		//String operator = scanner.next();
		
		switch (operator) {
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;	
			case "/":
				System.out.println(a/b);
				break;	
			case "%":
				System.out.println(a%b);
				break;
			default:
				System.out.println("Incorrect operator input");
				break;
		}
	}
}
