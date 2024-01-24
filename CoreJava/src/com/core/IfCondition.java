/*
 * If Condition

 * 
 * 1.Simple If
 * If(Condition)
 * {
 * 		statement;
 * }
 * 
 * 2.if/else
 * 
 * if(condition)
 * {
 * 		statement;
 * }
 * else
 * {
 * 		statement;
 * }
 * 
 * 3.Nested If
 * if(condition)
 * {
 *    if(condition)
 *    {
 *    		statement;
 *    }
 *    else
 *    {
 *      statement;
 *    }
 *    
 *    4.Ladder if\else
 *    if(condition)
 * {
 *    else if(condition)
 *    {
 *    		statement;
 *    }
 *    else if
 *    {
 *      statement;
 *    }
 * }
 * 
 */



package com.core;

import java.util.Scanner;

public class IfCondition {

	
	public static void main(String[] args) {

		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Negetive");
		}

		
	}
	
	
}












