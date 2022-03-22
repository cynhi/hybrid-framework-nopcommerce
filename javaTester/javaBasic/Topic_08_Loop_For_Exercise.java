package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_08_Loop_For_Exercise { 
	Scanner scanner = new Scanner(System.in);
	
	 @Test
	 public void Ex_01() {
		 int n = scanner.nextInt();
		 
		 for (int i = 0; i < n; i++) {
			 System.out.print(i+1 + " ");
		 }

	 }
	 @Test
	 public void Ex_02() {
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 
		 for (int i = a; i <= b; i++) {
			 System.out.print(i + " ");
		 }

	 }
	 
	 @Test
	 public void Ex_03() {
		 int sum = 0;
		 for (int i = 1; i < 11; i++) {
			 if (i%2 ==0) {
				 sum += i;
			 }
		 }
		 System.out.println(sum);
		
	 }
	 
	 @Test
	 public void Ex_04() {
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int sum = 0 ;
		 for (int i = a; i <= b; i++) {
			sum += i;
		 }
		 System.out.println(sum);
	 }
  
	 @Test
	 public void Ex_05() {
		 int n = scanner.nextInt();
		 int sum = 0;
		 for (int i = 0; i <= n; i++) {
			 if (i%2 != 0 ) {
				 sum += i;
			 }
		 }
		 System.out.println(sum);
		
	 }
	 
	 @Test
	 public void Ex_06() {
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 
		 for (int i = a; i <= b; i++) {
			 if (i%3 == 0) {
				 System.out.print(i + " ");
			 }
		 }
	 }
	 
	 @Test
	 public void Ex_07() {
		 int n = scanner.nextInt();
		 int result = 1;
		 for (int i = 1; i <= n; i++) {
			 result *= i;
		 }
		 System.out.println(result);
	 }
 
}
