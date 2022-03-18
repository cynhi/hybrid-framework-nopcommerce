package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_04_Operator_Exercise { 
	
	@Test	
 	public void Ex_01() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		System.out.println("After 15 years, age of " + name + " will be " + (age + 15));
	}
	
	@Test	
 	public void Ex_02() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
	 
		//No temp var
		a = a + b;
		b = a - b;
		a = a - b;
		 
		//With temp var
	//	int c = a;
	//	a = b;
	//	b = c;
		System.out.println("After swapping, a = " + a + " b = " + b);
		scanner.close();
	}
	
	@Test	
 	public void Ex_03() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		boolean result = (a > b) ? true : false;
		System.out.println("Result is " + result);
		scanner.close();
	 }
  
}
