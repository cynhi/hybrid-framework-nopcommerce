package javaBasic;


import java.util.Scanner;

import org.testng.annotations.Test;


public class Topic_12_String_Exercise { 
	Scanner scanner = new Scanner(System.in);
	
	 @Test
	 public void String_01() {
		 String a = scanner.nextLine();
		 char[] b = a.toCharArray();
		 int count = 0; 
		 for (char item : b) {
			 if (item >= 'A' && item <='Z') {
				 count += 1;
			 }
		 }
		 System.out.println(count);
		
	 } 
	 
	 @Test
	 public void String_02() {
		 String a = "Automation Testing 345 Tutorials Online 789";
		 char[] b = a.toCharArray();
		 int aCount = 0;
		 for  (char item : b) {
			 if (item == 'a') {
				 aCount += 1;
			 }
		 }
		 System.out.println(aCount);
		 
		 System.out.println(a.contains("Testing"));
		 System.out.println(a.startsWith("Automation"));
		 System.out.println(a.endsWith("Online"));
		 System.out.println(a.indexOf("Tutorials"));
		 System.out.println(a.replace("Online", "Offline"));
	 } 
	 @Test
	 public void String_03() {
		 String a = scanner.nextLine();
		 char[] b = a.toCharArray();
		 String output = new String();
		 
		 for (int i = a.length(); i >0; i--) {
			 output += b[i-1];
		 }
		 
		 System.out.println(output);
		 
	 }
	 
	 
	 
} 
