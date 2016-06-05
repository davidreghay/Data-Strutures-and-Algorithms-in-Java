package com.davidreghay.algorithms;

import com.davidreghay.datastructures.*;
import java.util.Scanner;

public class Parentheses {
	public static void main(String args[]) {
		Stack<Character> stack = new LinkStack<Character>();
		Scanner s = new Scanner(System.in);
		boolean balanced = true;
		
		String input = s.nextLine().trim();
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			switch(c) {
				case '}':
					if(stack.isEmpty()) {
						balanced = false;
					} else {
						balanced = (stack.pop() == '{') ? true : false;
					}
					break;
				case ')':
					if(stack.isEmpty()) {
						balanced = false;
					} else {
						balanced = (stack.pop() == '(') ? true : false;
					}
					break;
				case ']':
					if(stack.isEmpty()) {
						balanced = false;
					} else {
						balanced = (stack.pop() == '[') ? true : false;
					}
					break;
				default:
					stack.push(c);
			}
			if(!balanced) {
				break;
			}
		}
		
		s.close();
		
		System.out.println(stack.isEmpty() && balanced);
	}
}
