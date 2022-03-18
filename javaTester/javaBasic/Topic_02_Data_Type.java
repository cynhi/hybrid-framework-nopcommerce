package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
	//Primitive type / value type:
		byte bNumber; 
		short sNumber;
		int iNumber;
		long lNumber;
		float fNumber = 18.8f;
		double dNumber = 12.2d;
		char cChar;
		boolean bStatus;
	
		 
	//Reference type:
		//String 
		String addr = "HCMC";
	
		//Array
		String[] addresses = {addr, "BKK"};
		Integer[] age = {1, 2, 4, 5};
		
		//Class
		Topic_01_Variable topic1;
		Topic_02_Data_Type topic2;
		
		//Interface
		WebDriver driver;
		 
		//Object
		Object a;
		
		//Collection: list, set, queue, map
		List<WebElement> listNames = driver.findElements(By.id(""));
		Set<String>  setNames = driver.getWindowHandles();
		List<String> productName = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		
	}

}
