package com.java8;

@FunctionalInterface
public interface IPrintable {
	
	public  void print();
	
	default void scan() {
		System.out.println("Scanning");
	}
	
	static void printToConsole() {
		System.out.println("printToConsole");
	}
	
	default void scanAsPdf() {
		System.out.println("Scanning as PDF");
	}
	
}
