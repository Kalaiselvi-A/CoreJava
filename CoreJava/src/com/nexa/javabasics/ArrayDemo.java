package com.nexa.javabasics;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[10];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int num : arr) {
			if(perfect(sumDigit(num))){
				System.out.println(num+" ");
			}
		}
	}

	

	private static int sumDigit(int num) {
		int sum = 0;
		if(num!=0) {
			sum+=num;
		}
		return sum;
	}
	private static boolean perfect(int sumDigit) {
		int sqrt = (int)(Math.sqrt(sumDigit));
		return sqrt*sqrt == sumDigit;
	}
}
