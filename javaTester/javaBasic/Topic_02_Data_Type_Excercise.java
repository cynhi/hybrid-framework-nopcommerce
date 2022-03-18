package javaBasic;

import org.testng.annotations.Test;

public class Topic_02_Data_Type_Excercise {
	
	@Test
	public void Ex_01() {
		int a = 6;
		int b = 2;
		System.out.println("P1" + (a+b));
		System.out.println("P2" + (a-b));
		System.out.println("P3" + (a*b));
		System.out.println("P4" + (a/b));
	}
	
	@Test
	public void Ex_02() {
		float width = 7.5f;
		float height = 3.8f;
		System.out.println("Area = " + (width * height));
	}
	
	@Test
	public void Ex_03() {
		String name = "Automation Testing";
		System.out.println("Hello " + name);
	}
	
}
