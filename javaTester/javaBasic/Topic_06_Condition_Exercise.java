package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_06_Condition_Exercise { 
	Scanner scanner = new Scanner(System.in);
 @Test
 public void Ex_01() {
	 int numb = scanner.nextInt();
	 if (numb % 2 ==0) {
		 System.out.println("Number " + numb + " is even");
	 } else {
		 System.out.println("Number " + numb + " is odd ");
	 }
 }
 @Test
 public void Ex_02() {
	 int a = scanner.nextInt();
	 int b = scanner.nextInt();
	 if (a >= b) {
		 System.out.println("Number " + a + " is bigger than or equal to number " + b);
	 } else {
		 System.out.println("Number " + a + " is smaller than number " + b);
	 }
 }
  
 @Test
 public void Ex_03() {
	 String a = scanner.nextLine();
	 String b = scanner.nextLine();
	 //Reference type should use equals, not ==
	 if (a.equals(b)) {
		 System.out.println("Same name");
	 } else {
		 System.out.println("Not the same name");
	 }
 }
 
 @Test
 public void EX_04() {
	 int a = scanner.nextInt();
	 int b = scanner.nextInt();
	 int c = scanner.nextInt();
	 
	 if (a > b && a > c) {
		 System.out.println("Biggest number is " + a);
	 } else if (b > c) {
		 System.out.println("Biggest number is " + b);
	 } else {
		 System.out.println("Biggest number is " + c);
	 }
 }
 
 @Test
 public void EX_05() {
	 int a = scanner.nextInt();
	 
	 if ( a <=10 && a >= 100) {
		 System.out.println(a + " is in [10, 100]");
	 } else {
		 System.out.println(a + " is not in [10, 100]");
	 }
 }
 
 @Test
 public void EX_06() {
	 float a = scanner.nextFloat();
	 
	 if (a < 5) {
		 System.out.println("D");
	 } else if (a < 7.5) {
		 System.out.println("C");
	 } else if (a < 8.5) {
		 System.out.println("B");
	 } else {
		 System.out.println("A");
	 }
 }
 
 @Test
 public void EX_07() {
	 int month = scanner.nextInt();
	 switch (month) {
	 	case 1:
	 	case 3:
	 	case 5:
	 	case 7:
	 	case 8:
	 	case 10:
	 	case 12:
	 		System.out.println("This month has 31 days");
	 		break;
	 	case 4:
	 	case 6:
	 	case 9:
	 	case 11:
	 		System.out.println("This month has 30 days");
	 		break;
	 	case 2:	
	 		System.out.println("This month has 28-29 days");
	 		break;
	 	default:
	 		System.out.println("Not a correct month input");
	 		break;
	 } 
 }
  
 
}
