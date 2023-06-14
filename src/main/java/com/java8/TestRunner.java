package com.java8;

public class TestRunner {
	public static void main(String[] args){
		
		//Conventional Way
		IPrintable obj = new LogFileImpl();
		obj.print();

		
		//Anonymous inner class
		IPrintable obj1 = new IPrintable() {
			@Override
			public void print() {
				System.out.println("From anonymous Inner Class");
			}
		};
		obj1.print();
		
		
		//Functional Programming
		//1.Parameter the abstract method and lambda expression same
		//2.Return type to void
		//Only one abstract or unimplemented method
		IPrintable obj2 = ()-> System.out.println("From Lambda expression");
		obj2.print();
		
	}

}
