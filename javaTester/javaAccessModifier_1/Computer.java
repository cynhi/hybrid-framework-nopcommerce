package javaAccessModifier_1;

public class Computer { //Default can use inside of package
	//Property
	private int ssdSize; //Private only uses inside this class
	String name; //Default can use inside of package
	protected String title;
	public int number;
	
	
	//Method
	private void setSsdSize(int ssdSize) {
		this.ssdSize = ssdSize;
	}
	
	void setName(String name) { //Default can use inside of package
		this.name = name; 
	}
	
	protected void setTitle(String title) {
		this.title = title;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.ssdSize = 500;//private here means nothing bcuz access in the same class
		comp.setSsdSize(800); 
	 
		
		comp.name = "Kingston";
		comp.setName("Kingmax"); 
		
		comp.title = "abc";
		comp.setTitle("def");
		
		comp.number = 12;
		comp.setNumber(0);
	}
}
