package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_08_Loop_For { 
	Scanner scanner = new Scanner(System.in);
	String[] name = {"a", "b", "c", "d"};
	
	 @Test
	 public void Loop_For() {
//		 for (int i = 0; i < 10; i++) {
//			 System.out.println(i);
//		 }
		 
		 for (int i =0; i < name.length; i++) {
			 if (name[i].equals("d")) {
				 System.out.println(name[i]);
//				 return name[i]; ==> can return value & exit from loop if satify condition
				 break; //exit from loop
			 }
		 }
		
	 }
	 @Test
	 public void Loop_ForEach() {
		 String[] names = {"a", "b", "c", "d"};
		 for (String name : names) {
			 if (name.equals("d")) {
				System.out.println("Name is: " + name);
				break;
			 }
			 
			 
		 }
		
	 }
	 
	 @Test
	 public void Loop_For_03() {
		List<String> cities = new ArrayList<String>();
		cities.add("BKK");
		cities.add("KL");
		cities.add("SG");
		cities.add("SEOUL");
		
		System.out.println(cities);
		for (String city : cities) {
			System.out.println("Name is: " + city);
		}
		
	 }
  
 
}
