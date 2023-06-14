package com.lambda;

@FunctionalInterface
public interface IStringPrintable<T,U,R> {
	
	
	public abstract R print(T t, U u);
	
	
	/****
	 * 
	 * public String print(String a, String b);
	 * public void print(String s);
	 */
	
}
