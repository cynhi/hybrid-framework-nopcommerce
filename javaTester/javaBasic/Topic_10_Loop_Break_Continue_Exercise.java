package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;


public class Topic_10_Loop_Break_Continue_Exercise { 
	Scanner scanner = new Scanner(System.in);
	String[] name = {"a", "b", "c", "d"};
	
	 @Test
	 public void Ex_02_1() {
		 int a = scanner.nextInt();
		 switch(a) {
			 case 1:
				 System.out.print("JAN");
				 break;
			 case 2:
				 System.out.print("FEB");
				 break;
			 case 3:
				 System.out.print("MAR");
				 break;
			 case 4:
				 System.out.print("APR");
				 break;
			 case 5:
				 System.out.print("MAY");
				 break;
			 case 6:
				 System.out.print("JUN");
				 break;
			 case 7:
				 System.out.print("JUL");
				 break;
			 case 8:
				 System.out.print("AUG");
				 break;
			 case 9:
				 System.out.print("SEP");
				 break;
			 case 10:
				 System.out.print("OCT");
				 break;
			 case 11:
				 System.out.print("NOV");
				 break;
			 case 12:
				 System.out.print("DEC");
				 break;
			 default:
				 System.out.print("Incorrect input number.");
				 break;
		 }
		
	 }
	 
	
  
 
}
