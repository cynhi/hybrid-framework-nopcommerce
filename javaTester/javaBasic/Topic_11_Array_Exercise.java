package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;


public class Topic_11_Array_Exercise { 
	Scanner scanner = new Scanner(System.in);
	 String id;
	 String name;
	 int age;
	 int score;
	
	 @Test
	 public void Array_01() {
		 int[] arr = {2, 7, 6, 8, 9, 8};
		 int max = 0;
		 for (int i : arr) {
			 if (i > max) {
				 max = i;
			 }
		 }
		 System.out.println(max);

	 } 
	 
	 @Test
	 public void Array_02() {
		 int[] arr = {2, 7, 6, 8, 9};
		 System.out.println(arr[0] + arr[arr.length -1]);

	 } 
	 
	 @Test
	 public void Array_03() {
		 int[] arr = {2, 7, 6, 8, 9, 14, 28, 55, 96};
		 for (int i : arr) {
			 if (i % 2 == 0) {
				 System.out.print(i + " ");
			 }
		 }
		 
	 }
	 
	 @Test
	 public void Array_04() {
		 int[] arr = {3, -7, 2, 5, 9, -6, 10, 12};
		 int sum = 0; 
		 for (int i : arr) {
			 if (i > 0 && i % 2 != 0) {
				 sum += i;
			 }
		 }
		 System.out.println(sum);
		 
	 }
	 
	 @Test
	 public void Array_05() {
		 int[] arr = {3, -7, 2, 5, 9, -6, 10, 12};
		 for (int i : arr) {
			 if (i > 0 && i <=10) {
				 System.out.print(i + " ");
			 }
		 }
		 
	 }
	 
	 @Test
	 public void Array_06() {
		 int[] arr = {3, -7, 2, 5, 9, -6, 10, 12};
		 int sum = 0;
		 for (int i : arr) {
			 sum += i;
		 }
		 System.out.println(sum);
		 System.out.println(sum/(arr.length - 1));
		 
	 }
	
	 
}
