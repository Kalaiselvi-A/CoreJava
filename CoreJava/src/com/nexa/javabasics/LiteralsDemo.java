package com.nexa.javabasics;

public class LiteralsDemo {

	public static void main(String[] args) {
		//literals
		
		int num1 = 0b100;	//binary number for 4 #0b100 or #0B100
		System.out.println(num1);
		
		int num2 = 0x7E;	//hexaDecimal number
		System.out.println(num2);
		
		int num3 = 10_00_00_000;	//update in java
		System.out.println(num3);	//prints 100000000
		
		double num4 = 45;		//int automatically converted into double
		System.out.println(num4);	//prints 45.0
		
		double num5  = 13e100;	//epsilon
		System.out.println(num5);
		
		//character
		char c = 'a';
		System.out.println(c);
		
		//character can be incremented
		char ch = 'a';
		ch++;
		System.out.println(ch);		//prints b

	}

}
