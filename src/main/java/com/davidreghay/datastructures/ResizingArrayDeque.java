package com.davidreghay.datastructures;

import java.util.Iterator;

public class ResizingArrayDeque<Item> implements Deque<Item> {

	Item[] a = (Item[]) new Object[1];
	int leftEnd = -1;
	int rightEnd = 0;
	int N = 0;
	
	@Override
	public Iterator iterator() {
		return new ReverseArrayIterator();
	}

	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public void pushLeft(Item item) {
		if(N == a.length) {
			resizeArray(a.length * 2);
		}
		a[getIndex(leftEnd--, a)] = item;
		N++;
	}

	@Override
	public void pushRight(Item item) {
		if(N == a.length) {
			resizeArray(a.length * 2);
		}
		a[getIndex(rightEnd++, a)] = item;
		N++;
	}

	@Override
	public Item popLeft() {
		if(isEmpty()) {
			return null;
		}
		int index = getIndex(++leftEnd, a);
		Item item = a[index];
		a[index] = null;
		N--;
		if(N > 0 && N == a.length / 4) {
			resizeArray(a.length / 2);
		}
		return item;
	}

	@Override
	public Item popRight() {
		if(isEmpty()) {
			return null;
		}
		int index = getIndex(--rightEnd, a);
		Item item = a[index];
		a[index] = null;
		N--;
		if(N > 0 && N == a.length / 4) {
			resizeArray(a.length / 2);
		}
		return item;
	}
	
	@Override
	public String toString() {
		 StringBuilder s = new StringBuilder();
		 s.append("[");
		 Iterator it = iterator();
		 while(it.hasNext()) {
			 s.append(it.next());
			 if(it.hasNext()) {
				 s.append(", ");
			 }
		 }
		 s.append("]");
		 return s.toString();
	}
	
	private void resizeArray(int newSize) {
		int index = rightEnd;
		Item[] newArray = (Item[]) new Object[newSize];
		for(Object item : this) {
			newArray[getIndex(--index, newArray)] = (Item) item;
		}
		a = newArray;
	}
	
	private int getIndex(int i, Item[] arr) {
		if(i < 0) {
			return arr.length + i;
		}
		return i % arr.length;
	}
	
	private class ReverseArrayIterator implements Iterator<Item> {

		int itemCount = N;
		int right = rightEnd;
		
		@Override
		public boolean hasNext() {
			return itemCount > 0;
		}

		@Override
		public Item next() {
			Item next = a[getIndex(--right, a)];
			itemCount--;
			return next;
		}

		@Override
		public void remove() { }
		
	}
	
}
