package com.davidreghay.datastructures;

import java.util.Iterator;

public class LinkBag<Item> implements Bag<Item> {

	private Node first;
	private int N;

	@Override
	public void add(Item item) {
		Node oldfirst = first;
		first = new Node(item);
		first.next = oldfirst;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	private class Node {
		Item item;
		Node next;
		
		Node(Item item) {
			this.item = item;
		}
	}
	
	private class LinkedListIterator implements Iterator<Item> {
		
		private Node current = first;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}
		
		@Override
		public Item next() {
			Item next = current.item;
			current = current.next;
			return next;
		}
		
		@Override
		public void remove() { }
	}
}
