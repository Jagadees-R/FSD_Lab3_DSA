package com.BalancingBrackets.Check;

import java.util.Stack;

public class CheckBrackets 
{
	public boolean checkBalance(String bracketExp)
	{
		Stack<Character> stack = new Stack<>();
		for(char s:bracketExp.toCharArray())
		{
			if(s == '(' || s == '{' || s == '[')
			{
				stack.push(s);
			}
			else if(s == ')' && !stack.isEmpty() && stack.peek() == '(')
			{
				stack.pop();
			}
			else if(s == '}' && !stack.isEmpty() && stack.peek() == '{')
			{
				stack.pop();
			}
			else if(s == ']' && !stack.isEmpty() && stack.peek() == '[')
			{
				stack.pop();
			}
			else
			{
				return false;
			}
		}
		return stack.isEmpty();
	}
}
