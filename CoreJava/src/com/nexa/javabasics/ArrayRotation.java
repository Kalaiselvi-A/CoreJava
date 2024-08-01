package com.nexa.javabasics;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rot = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=rot-1;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<rot-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
