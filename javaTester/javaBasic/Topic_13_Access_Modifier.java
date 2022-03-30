package javaBasic;


import org.testng.annotations.Test;


public class Topic_13_Access_Modifier { 
	
	 @Test
	 public void OOP() {
		 //Inheritance: child inherit from parent to reuse functions,...
		 
		 //Encapsulation: wrap attributes & methods of a class then modify the access of other class (public, private,...) 
		 
		 //Polymophism: 2 method has same names but different arguments/no of arguments but differ data type...
		 //Ex: at work you are a worker, at home you are a dad,...depends on context to know who you are
		 
		 
		 //Abstraction: template for other class to implement (abstract class, interface)
//		=> Flexible (ez to update), Easy to reuse, optimize, reduce lines of code or repeat code, cover data (user only knows the output)
		 
		 
		
	 } 
	 
	 @Test
	 public void Access_Modifier() {
		 //private (use for property & method, not use for class)
		 
		 
		 //-----
		 //default (when non is defined)
		 //Class: class Cat => only can access when in same package
		 //Method/property:
		 
		 //-----
		 //protected (use for property & method, not use for class)
		  
		 //----- 
		 //public
		 //Class: public class Dog => if in same package, no need to import. Can access from any package
//		          public final class => not allow inherit from any package (includes itself).
//		          But still can access by definding new object/instance: Car car = new Car();
		 
//		          public abstract class Computer => allow inherit, not allow access by definding new obj/instance
		 
		//Method/property:
		 
		 
		//-----
	 } 
	 
	 
	 
//	 Contructor: declaration function
//	 Non-modifier: final, static, abstract, transient, volatile, native, synchronized
//	 System.out.println();
} 
