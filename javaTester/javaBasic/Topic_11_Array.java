package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;


public class Topic_11_Array { 
	Scanner scanner = new Scanner(System.in);
	
	
	 @Test
	 public void Array_01() {
		 //Array: can NOT add/edit/remove element after defining (fixed)
		 //Known: size/length
		 //Define:
		 String[] name = {"a", "b", "c", "d"};
		 float[] number = {1, 2, 3, 4, 5};
		 float number2[] = {1, 2, 3, 4, 5};
		 int[] age = new int[8]; //8 is length of array
		 
//		 //Get item
//		System.out.print(name[0]);
//		
//		//Fill
//		Arrays.fill(age, 1808);
//		for (int i : age) {
//			System.out.println(age);
//		}
		 
		//Compare
		 Arrays.equals(number, number2);
		//Sort
		 Arrays.sort(name);
		 
		//Array to String
		String names = Arrays.toString(name);
		System.out.println(names);
		
		//Array of objects
		//Topic_11_Array[] students = new Topic_11_Array[3]
		//student[0] = new Topic_11_Array("Tuan", 24);

	 } 
	 
	 @Test
	 public void Array_02() {
		 //Define:
		 String[][] name = {{"a", "b"}, {"c"}, {"d"}};
		 
		 //Get item
		System.out.print(name[0][1]);

	 } 
	 
	 @Test
	 public void Array_List() {
		//Array: can add/edit/remove element after defining (flexible)
		 ArrayList<String> name = new ArrayList<String>();
		 name.add("Nhi");
	 }
  
	 @Test
	 public void Array_To_List() {
		 int[] a = {1, 2, 3, 4};
		 List<int[]> b = Arrays.asList(a);
		 
	 } 
}
