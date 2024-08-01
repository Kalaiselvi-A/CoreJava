package com.nexa.javabasics;

import java.util.Scanner;

public class RepititionArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		int cnt=0; int op=0; 
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
				}
				op = (cnt>op)?op:cnt;
			}
		}
		
		System.out.println(op);
	}

}
