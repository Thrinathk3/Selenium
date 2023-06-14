package com.lambdainterface;

import java.util.function.Consumer;

public class TestRunner {
	
	static void perform(Animal animal) {
		animal.run();
	}
	
	public static void main(String[] args) {
		/**
		 * perform(new Dog);
		 * Animal obj = new Dog();
		 * perform(obj);

			Animal obj1 = new Animal() {
				@Override
				public void run() {
				System.out.println("Running at 30KM Speed in inner class");
				}
			};
			perform(obj1);
		 *
		 *	Animal obj2 = () -> System.out.println("Running at 30KM Speed in lambda class");
			perform(obj2);

		 *perform(() -> System.out.println("Running at 30KM Speed in lambda class"));
		 *
		 *toUpper("thrinath");
		 *toLower("THRINATH");
		 */
		stringOperation((s)-> System.out.println(s.toUpperCase()), "thrinath" );
		stringOperation((s)-> System.out.println(s.toLowerCase()), "THRINATH" );
	}
	private static void stringOperation(Consumer<String> consumer, String name) {
		consumer.accept(name);
	}
	
	/*
	 * private static void toUpper(String s) { System.out.println(s.toUpperCase());
	 * } private static void toLower(String s) {
	 * System.out.println(s.toLowerCase()); }
	 */
}
