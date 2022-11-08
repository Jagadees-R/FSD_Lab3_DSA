package com.BalancingBrackets.Main;

import java.util.Scanner;

import com.BalancingBrackets.Check.CheckBrackets;

public class DriverClass 
{
	public static void main(String[] args)
	{
		CheckBrackets balanceBrackets = new CheckBrackets();
		System.out.println("Enter the Bracket String you need to check");
		String stack="";
		Scanner sc = new Scanner(System.in);
		stack = sc.next();
		if(stack.length() % 2 !=0)
		{
			System.out.println("Please enter appropriate number of brackets");
		}
		else
		{
			if(balanceBrackets.checkBalance(stack))
			{
				System.out.println("The entered String has Balanced Brackets");
			}
			else
			{
				System.out.println("The entered String do not contain Balanced Brackets");
			}
			sc.close();
		}
	}	
}
