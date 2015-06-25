package com.davidreghay.datastructures.test;
import com.davidreghay.datastructures.NodeStack;
import com.davidreghay.datastructures.Stack;

public class TestNodeStack {
	public static void main(String[] args) {
		Stack<String> stack = new NodeStack<String>();
		stack.push("hi");
		System.out.println(stack.size());
		System.out.println(stack.top());
		stack.push("hello");
		System.out.println(stack.size());
		stack.push("what's up?");
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}
}
