package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_03_Compare_Primitive_Reference {
	int numb = 2;
	
	public static void main(String[] args) {
		//Primitive type / value type: store value inside of it (stack)
		int a = 8;
		int b = a;
		System.out.println(a); //=> 8 
		System.out.println(a); //=> 8
		
		b = 12;
		System.out.println(a); //=> 8 
		System.out.println(a); //=> 12
	
		//Reference type: store location to the memory that it refers to (heap)
		Topic_03_Compare_Primitive_Reference x = new Topic_03_Compare_Primitive_Reference();
		Topic_03_Compare_Primitive_Reference y = x;
		System.out.println(x.numb); //=> 2
		System.out.println(y.numb); //=> 2
		
		y.numb = 12;
		System.out.println(x.numb); //=> 12
		System.out.println(y.numb); //=> 12
	}

}
