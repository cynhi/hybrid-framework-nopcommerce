package javaAccessModifier_2;

import javaAccessModifier_1.Computer;

public class Workstation {

	public static void main(String[] args) {
		Computer comp = new Computer();
//		comp.ssdSize = 500; // cant access becuz of private modifier in Computer
//		comp.setSsdSize(800);
	 
//		comp.name = "Kingston"; //cant access becuz of default modifier allows to access in same package only
//		comp.setName("Kingmax");
		
//		comp.title = "abc"; //cant access becuz of default modifier allows to access in same package or extends only
//		comp.setTitle("def");
		comp.number = 12;//can access becuz of public modifier
		comp.setNumber(0);
	}
}