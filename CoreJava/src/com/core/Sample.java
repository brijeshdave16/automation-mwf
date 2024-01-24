package com.core;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A");
		a=sc.nextInt();
		System.out.println("Enter Number B");
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("Sum of "+c);
		
	}	
}
