package javaAccessModifier_2;

import javaAccessModifier_1.Computer;

public class PC extends Computer{
	//Access through child do not need to use object
	
//	public void showSSDSize() {
//		System.out.print(ssdSize); //cant access becuz of private modifier in Computer
//	}
	
//	name = "Kingston"; //cant access becuz of default modifier allows to access in same package only
//	setName("Kingmax");//^

	public void show() {
		title = "abc"; //can access becuz of protected modifier allows to access in same package
		setTitle("def");
	}
	
	public void abc() {
		number = 12;//can access becuz of public modifier
		setNumber(0);
	}
	
}
  