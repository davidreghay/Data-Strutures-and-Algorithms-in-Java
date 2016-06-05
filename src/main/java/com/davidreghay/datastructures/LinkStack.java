package com.davidreghay.datastructures;

import java.util.Iterator;

public class LinkStack<Item> implements Stack<Item> {

	private Node first;
	private int N;
	
	/**
	 * Empty constructor for an empty stack
	 */
	public LinkStack() { }
	
	/**
	 * Constructs a new stack containing the exact same items, in order, as the
	 * stack supplied as the parameter.
	 * 
	 * @param s
	 */
	public LinkStack(Stack s) {
		LinkStack<Item> temp = new LinkStack<Item>();
		
		for(Object o : s) {
			temp.push((Item) o);
		}

		for(Object o : temp) {
			this.push((Item) o);
		}
	}
	
	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}

	@Override
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node(item);
		first.next = oldfirst;
		N++;
	}

	@Override
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	@Override
	public Item peek() {
		return first.item;
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
		
		public Node(Item item) {
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
