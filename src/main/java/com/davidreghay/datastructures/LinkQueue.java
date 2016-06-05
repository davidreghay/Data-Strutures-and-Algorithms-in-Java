package com.davidreghay.datastructures;

import java.util.Iterator;


public class LinkQueue<Item> implements Queue<Item> {

	Node first;
	Node last;
	private int N;
	
	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}

	@Override
	public void enqueue(Item item) {
		Node oldlast = last;
		last = new Node(item);
		if(isEmpty()) {
			first = last;
		} else {
			oldlast.next = last;			
		}
		N++;
	}

	@Override
	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		if(isEmpty()) {
			last = null;
		}
		return item;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public int size() {
		return N;
	}
	
	private class Node {
		Item item;
		Node next;
		
		Node(Item item) {
			this.item = item;
		}
	}
	
	private class LinkedListIterator implements Iterator<Item> {

		Node current = first;
		
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
		public void remove() {}
		
	}

}
