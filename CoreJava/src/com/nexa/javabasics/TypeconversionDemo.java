package com.nexa.javabasics;

public class TypeconversionDemo {

	public static void main(String[] args) {
		
		//Type Conversion or IMPLLICIT CONVERSION
		byte b = 127;
		int a = b;		//conversion of byte to int
		System.out.println(a);
		
//		int m = 12; 
//		byte n = m; 	//conversion of int to byte (not possible)
//		System.out.println(n);
		 
		
		// therefore, conversion of int to byte is done by
		//CASTING or EXPLICIT CONVERSION
		int l = 12;
		byte k = (byte)l;
		System.out.println(k);
		
		// if the byte range exceed,
		int p = 257;
		byte q = (byte)p;	//257 % 256
							//p % byte_range
		System.out.println(q); 	//output: 1
		
		
		
		//********General Concepts*********
		System.out.println();
		System.out.println(257%256);
		System.out.println(12%256);
		System.out.println(-257%256);
		System.out.println();
		
		
		//********TYPE PROMOTION********
		byte num1 = 10;
		byte num2 = 55;
		int result = num1*num2;	//automatically promoted to int
		
		System.out.println(result);
	}

}
