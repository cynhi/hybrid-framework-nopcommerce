package javaBasic;

import java.util.Scanner;

public class Topic_01_Variable { 
//Global variable	
 static int studentNumber;
 static boolean statusValue;
 static final String BROWSER_NAME = "Chrome"; // constant
 String studentName = "KJY";
 
 public static void main(String[] args) {
	 //Local variable
	 int yearsOld;
	 
	 System.out.println(statusValue);
	 
//	 System.out.println(studentName); ==> got error cuz function is static but studentName is not static
//	 To use studentName:
	 
	 Topic_01_Variable topic = new Topic_01_Variable();
	 System.out.println(topic.studentName);
	 
	 //---
	 System.out.println(Topic_01_Variable.BROWSER_NAME);
	 
	 //---
	 Scanner scanner = new Scanner(System.in);
	 String name = scanner.nextLine();
	 //print with no /n
	 System.out.print(name);
     //print with /n
	 System.out.println(name);
 }
 
 //Getter
 public String getStudentName() {
	 return this.studentName;
 }
 
 //Setter
 public void setStudentName(String newStudentName) {
	 this.studentName = newStudentName;
 }
}
