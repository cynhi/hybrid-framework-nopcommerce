package javaBasic;

import java.util.Scanner;

public class Topic_04_Operator { 
	
 public static void main(String[] args) {
	 int number = 10;
	 number +=1; // = number++
	 System.out.print(number);
	 System.out.print(number--); // = number -=1
	 
	 //++ is post fix
	 System.out.print(number++); // print before plus, after this step, number = 11
	 //++ is prefix
	 System.out.print(++number); // plus 1 first, print later, after this step, number = 12
	 
	 int a = 5;
	 int b = 8;
	 int result = a++ + ++b - 8;
	 //=> priority: prefix > other operator > set value for 'result' > post fix
	 System.out.print(a);
	 System.out.print(result);
	 System.out.print(b);
	 
	 
//	 
////	 System.out.print(number % 10);
////	 System.out.print(number / 11);
////	 
//////	 condition: variable = (condition) ? value_if_true : value_if_false
////	 String address = "HCMC";
////	 boolean status = (address != "BKK") ? true : false;
////	 
////	 int a1 = 8;
////	 String name = (a1 == 8) ? "KJY" : "CYN";
////	 System.out.println(name);
 }
  
}
