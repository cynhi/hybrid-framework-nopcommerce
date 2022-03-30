package javaBasic;


import org.testng.annotations.Test;


public class Topic_12_String { 
	
	 @Test
	 public void String_01() {
		String s1 = "cat";
		s1 = "dog"; //=>"dog" will be in a new memory locator, "cat" is not changed => immutable
		String s2 = s1;
		String s3 = new String();
		
		System.out.println(s1==s2);//compare value & memory locator
		System.out.println(s1==s3);// ^
		System.out.println(s2==s3);// ^
		
		System.out.println(s2.equals(s3)); //only compare value, not compare memory locator
	 } 
	 
	 @Test
	 public void String_02() {
//		String s = "automation testing";
//		String s2 = "AutOmaTion teStIng";
//		String x = "engineer";
//		
//		System.out.println(s.length());
//		System.out.println(s.charAt(8));
//		System.out.println(s.concat(x));
//		System.out.println(s + x);
//		System.out.println(s.equals(s2));
//		System.out.println(s.equalsIgnoreCase(s2));
//		System.out.println(s.startsWith("a"));
//		System.out.println(s.endsWith("j"));
//		System.out.println(s.contains("test"));
//		System.out.println(s.indexOf("u"));
//		
//		String subString = s.substring(10);
//		String subString2 = s.substring(10, 12);
//		
//		String a = "Viewing 48 of 132 results";
//		String[] result = a.split(" ");
//		System.out.println(result[1]);
//		 
//		String productPrice = "$100.00";
		
//		productPrice = productPrice.replace("$", "");
		 
//		//String to others type 
//		float fProductPrice = Float.parseFloat(productPrice);
//		int iProductPrice = Integer.parseInt(productPrice);
//		
//		 //Others to String
//		String sproductPrice = String.valueOf(fProductPrice);
//		
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
		
		//Trim remove space, \t, \n at the begining & the end of string
		String b = "    \n    \t Hello \t \t \n \n";
		System.out.println(b.trim());
		
		String c = "   ";
		System.out.println(c.isBlank()); //true
		System.out.println(c.isEmpty()); //false
		
	 } 
	 @Test
	 public void String_03() {
		 //Dynamic locator
		 String dynamicButtonXpath = "//button[@id='%s']";
		 System.out.println("Login button locator is: " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		 System.out.println("Search button locator is: " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
	 }
	 
	 
	 
//	 System.out.println();
} 
