package com.davidreghay.datastructures;

import java.util.Iterator;

public class LinkDeque<Item> implements Deque<Item> {

	int N;
	
	Node leftEnd;
	
	Node rightEnd;
	
	@Override
	public Iterator iterator() {
		return new LinkListIterator();
	}

	@Override
	public boolean isEmpty() {
		return leftEnd == null;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public void pushLeft(Item item) {
		Node newNode = new Node(item);
		if(leftEnd == null) {
			leftEnd = newNode;
			rightEnd = newNode;
		} else {
			leftEnd.prev = newNode;
			newNode.next = leftEnd;
			leftEnd = newNode;
		}
		N++;
	}

	@Override
	public void pushRight(Item item) {
		Node newNode = new Node(item);
		if(rightEnd == null) {
			rightEnd = newNode;
			leftEnd = newNode;
		} else {
			rightEnd.next = newNode;
			newNode.prev = rightEnd;
			rightEnd = newNode;
		}
		N++;
	}

	@Override
	public Item popLeft() {
		if(isEmpty()) {
			return null;
		}
		Item item = leftEnd.item;
		leftEnd = leftEnd.next;
		N--;
		if(leftEnd == null) {
			rightEnd = null;
		} else {
			leftEnd.prev = null;
		}
		return item;
	}

	@Override
	public Item popRight() {
		if(isEmpty()) {
			return null;
		}
		Item item = rightEnd.item;
		rightEnd = rightEnd.prev;
		N--;
		if(rightEnd == null) {
			leftEnd = null;
		} else {
			rightEnd.next = null;
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

	private class Node {
		
		Item item;
		
		Node next;
		
		Node prev;
		
		Node(Item item) {
			this.item = item;
		}
		
	}
	
	private class LinkListIterator implements Iterator<Item> {
		
		Node current = leftEnd;
		
		public boolean hasNext() {
			return current != null;
		}
		
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
		public void remove() { }
		
	}
}
