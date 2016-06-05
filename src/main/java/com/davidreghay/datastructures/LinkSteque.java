package com.davidreghay.datastructures;

import java.util.Iterator;

public class LinkSteque<Item> implements Steque<Item> {

	int N = 0;
	Node head;
	Node tail;
	
	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public void push(Item item) {
		Node newHead = new Node(item);
		newHead.next = head;
		head.prev = newHead;
		head = newHead;
		if(head.next == null) {
			tail = head;
		}
		N++;
	}

	@Override
	public Item pop() {
		if(isEmpty()) {
			return null;
		}
		Item item = head.item;
		head = head.next;
		head.prev = null;
		N--;
		return item;
	}

	@Override
	public void enqueue(Item item) {
		if(isEmpty()) {
			head = new Node(item);
			tail = head;
		} else {
			Node newTail = new Node(item);
			newTail.prev = tail;
			tail.next = newTail;
			tail = newTail;
		}
		N++;
	}
	
	private class Node {
		
		Item item;
		Node next;
		Node prev;
		
		Node(Item item) {
			this.item = item;
		}
		
	}

	private class LinkedListIterator implements Iterator {

		Node current = head;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Object next() {
			Node next = current;
			current = current.next;
			return next;
		}

		@Override
		public void remove() { }
		
	}
}
