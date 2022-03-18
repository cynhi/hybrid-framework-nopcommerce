package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Topic_05_Casting_Type { 
	
	public static void main(String[] args) {
		//Primitive casting includes:
			//Implicit: from small to big => widening (not lost data)
			// byte > short > int > long > float
			//Ngam dinh: tu gan kieu
			byte bNum = 124;
			short sNum = bNum;
			System.out.println(sNum);
		
			// Explicit : big to small => narrowing
			//Reference casting (Tuong minh): chi ro kieu can gan
			double dNum2 = 654321547;
			float fNum2 = (float) dNum2;
			long lNum2 = (long) fNum2;
			System.out.println(dNum2);
			System.out.println(lNum2);
			
			WebDriver driver = null;
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	}
  
}
