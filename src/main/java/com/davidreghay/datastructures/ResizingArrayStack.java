package com.davidreghay.datastructures;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Stack<Item> {

	private Item[] a = (Item[]) new Object[1];
	private int N = 0;
	
	@Override
	public void push(Item item) {
		if(N == a.length) {
			resize(a.length * 2);
		} 
		a[N++] = item;
	}

	@Override
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if(N > 0 && N == a.length / 4) {
			resize(a.length / 2);
		}
		return item;
	}
	
	@Override
	public Item peek() {
		return  a[N];
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
	
	private void resize(int size) {
		Item[] temp = (Item[]) new Object[size];
		for(int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
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
