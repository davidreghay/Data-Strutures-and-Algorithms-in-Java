package com.davidreghay.datastructures;

public interface Steque<Item> extends Iterable {
	
	/**
	 * is the steque empty?
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * number of items in the steque
	 * @return
	 */
	int size();
	
	/**
	 * add an item to the top/front
	 * @param item
	 */
	void push(Item item);
	
	/**
	 * remove an item from the top/front
	 * @return the removed item
	 */
	Item pop();
	
	/**
	 * insert at the bottom/back of the steque
	 * @param item
	 */
	void enqueue(Item item);
}
