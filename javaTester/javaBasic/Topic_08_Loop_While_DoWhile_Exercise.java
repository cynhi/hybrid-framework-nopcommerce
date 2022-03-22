package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;


public class Topic_08_Loop_While_DoWhile_Exercise { 
	Scanner scanner = new Scanner(System.in);
	String[] name = {"a", "b", "c", "d"};
	
	
//	 @Test
//	 public void Ex_01() {
//		 int a = scanner.nextInt();
//		 
//		 do {
//			 if (a%2==0) {
//				 System.out.print(a + " ");
//			 }
//			 a++;
//			 
//		 }  while(a<=100);
//	 }
	 
	 //a wont be changed after running
	 @Test
	 public void Ex_02_1() {
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int i = a;
		 while (i<=b) {
			 if (i%3 ==0 && i%5 ==0) {
				 System.out.print(i + " ");
			 }
			 i++;
		 }
		
	 }
	 
	 //a will be changed after running
	 @Test
	 public void Ex_02_2() {
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 while (a<=b) {
			 if (a%3 ==0 && a%5 ==0) {
				 System.out.print(a + " ");
			 }
			 a++;
		 }
		
	 }
	 
	 @Test
	 public void Ex_03() {
		 int n = scanner.nextInt();
		 int sum = 0;
		 while (n > 0) {
			 if (n%2 != 0) {
				 sum += n; 
			 }
			 n--;
		 }
		 System.out.println(sum);
		
	 }
	 
	 @Test
	 public void Ex_04() {
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 while (a <= b) {
			 if(a%3 == 0) {
				 System.out.println(a);
			 }
			 a++;
		 }
		 scanner.close();
	 }
	 
	
  
 
}
