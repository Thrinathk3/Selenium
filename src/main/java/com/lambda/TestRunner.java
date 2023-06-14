package com.lambda;

public class TestRunner {
	public static void main(String[] args){
		//Functional Programming (control +1 in inner class)
		//1.Parameter the abstract method and lambda expression same
		//2.Return type to void
		//3.Only one abstract or unimplemented method
		//
		
		
		IStringPrintable<String, String, String>obj = (a,b)->(a+" "+b).toUpperCase();
		System.out.println(obj.print("Thrinath","k"));
		
		
		/**
		 * 
		 * IStringPrintable obj = (a,b)->(a+" "+b).toLowerCase();
			System.out.println(obj.print("Thrinath","K"));
		 * 
		 * 
		 * 
		 * IPrintable<String> obj = (a)->System.out.println(a.toLowerCase());
			obj.print("TINGU");
		
			IPrintable<Integer> obj1 = (a)->System.out.println(a);
			obj1.print(22);
		 *	
		 *
		 * IStringPrintable obj = a->System.out.println(a.toLowerCase());
			obj.print("TINGU");
		 * 
		 * 
		 * taking two strings
		 * IPrintable obj2 = (a,b) ->System.out.println(a+" "+b);
			obj2.print("Thrinath","K");
		 * 
		 * taking int parameter
		 * IPrintable obj2 = (a) ->System.out.println(a);
			obj2.print(6);
		 * 
		 * return type String
		 * IPrintable obj2 = a ->a.toLowerCase();
			System.out.println(obj2.print("THRINATH.K"));
		 * 
		 * return type Boolean
		 * IPrintable obj2 = a ->a.length()>0;
				System.out.println(obj2.print("THRINATH.K"));
		 * IPrintable obj2 = a ->a.toLowerCase();
			System.out.println(obj2.print("THRINATH.K"));
		 *
		 *ScannerInterface obj4 =() -> 0;
			System.out.println(obj.scan());
		 *ScannerInterface obj4 =() -> 0;
			obj4.scan();
		 *
		 */ 
		
		
		
	}

}
