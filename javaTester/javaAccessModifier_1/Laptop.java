package javaAccessModifier_1;

public class Laptop {
	
	public static void main(String[] args) {
		Computer comp = new Computer();
//		comp.ssdSize = 500; // cant access becuz of private modifier in Computer
//		comp.setSsdSize(800);
	 
		comp.name = "Kingston"; //can access becuz of default modifier allows to access in same package
		comp.setName("Kingmax");
		
		comp.title = "abc"; //can access becuz of protected modifier allows to access in same package
		comp.setTitle("def");
		
		comp.number = 12;//can access becuz of public modifier
		comp.setNumber(0);
	}
}
