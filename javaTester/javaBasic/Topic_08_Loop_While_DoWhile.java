package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;


public class Topic_08_Loop_While_DoWhile { 
	Scanner scanner = new Scanner(System.in);
	String[] name = {"a", "b", "c", "d"};
	
	//While check condition first before run
	//For: increase i++ at the end of a running round
	//While: can increase i++ anywhere in code (even before checking condition)
	 @Test
	 public void Loop_While() {
		 int i =0;
		 while (i < 5) {
			 System.out.print(i);
			 i++;
		 }

	 }
	 
	 //Do while: do once before checking condition
	 @Test
	 public void Loop_Do_While() {
		 int i =0;
		 do {
			 System.out.print(i);
			 i++;
		 } while (i< 5);
	 }
  
 
}
