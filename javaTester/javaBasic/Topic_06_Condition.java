package javaBasic;


public class Topic_06_Condition { 
	
 public static void main(String[] args) {
	 boolean a = 8 < 12;
	 if (a) {
		 System.out.print("True");
	 }
	 
	 String name = "KJYCYN";
	 if (!name.contains("E")) {
		 System.out.print("False");
	 }
	 
	 int b = 10;
	 if (b < 10) {
		 System.out.print("Smaller");
	 } else if (b > 10) {
		 System.out.print("Bigger");
	 } else {
		 System.out.print("Equal");
	 }
 
 }
  
}
