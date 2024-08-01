package com.nexa.javabasics;

import java.util.Scanner;

public class TwoDimensionSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1)
					sum+=mat[i][j];
			}
		}
		
		System.out.println("Sum of border: "+sum);
		int sum1 = 0; int c=0;
		int m=sum;
		//count of digits
		while(sum>0) {
			c++;
			sum/=10;
		}
		
		System.out.println("Count: "+c);
		
		while(m>0) {
			int op = m%10;
			sum1 += (int)Math.pow(op,c);
			c--;
			m /= 10;
		}
		System.out.println(sum1);
	}

}
