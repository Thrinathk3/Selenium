package com.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Foreach {
	public static void main(String[] args) {


		List<String> list =Arrays.asList("Thri", "nath"," K");

		Consumer<String> consumer = (s)-> System.out.print(s);
		Consumer<String> consumer1 = (s)-> System.out.print(s.toUpperCase());

		list.forEach(consumer.andThen(consumer1));

		/*
		 * list.forEach(consumer); 
		 * list.forEach(consumer1);
		 */
	}
}
