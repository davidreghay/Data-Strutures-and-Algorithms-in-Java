package com.davidreghay.datastructures;

public class CharacterBuffer implements Buffer {

	private Stack left = new LinkStack<Character>();
	private Stack right = new LinkStack<Character>();
	
	@Override
	public void insert(char c) {
		left.push(c);
	}

	@Override
	public char get() {
		return (Character) left.peek();
	}

	@Override
	public char delete() {
		return (Character) left.pop();
	}

	@Override
	public void left(int k) {
		for(; k > 0; k--) {
			right.push(left.pop());
		}
	}

	@Override
	public void right(int k) {
		for(; k < 0; k--) {
			left.push(right.pop());
		}
	}

	@Override
	public int size() {
		return left.size() + right.size();
	}

}
