package com.davidreghay.datastructures;

import java.util.Iterator;

public class FixedCapacityStack<Item> implements Stack<Item> {

	private Item[] a;
	private int N = 0;
	
	public FixedCapacityStack(int cap) {
		a = (Item[]) new Object[cap];
	}
	
	@Override
	public void push(Item item) {
		// TODO Auto-generated method stub
		a[N++] = item;
	}

	@Override
	public Item pop() {
		// TODO Auto-generated method stub
		return a[--N];
	}
	
	@Override
	public Item peek() {
		// TODO Auto-generated method stub
		return a[N];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return N == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return N;
	}

	@Override
	public Iterator iterator() {
		return new ReverseArrayIterator();
	}
	
	public boolean isFull() {
		return N == a.length;
	}
	
	private class ReverseArrayIterator implements Iterator<Item> {

		private int i = N;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return a[--i];
		}

		@Override
		public void remove() {		}
		
	}
}
