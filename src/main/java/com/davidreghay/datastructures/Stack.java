package com.davidreghay.datastructures;

public interface Stack<Item> extends Iterable {
	
	/**
	 * Add an item to the top of the stack
	 * 
	 * @param item - the item to add to the stack
	 */
	void push(Item item);
	
	/**
	 * Removes and returns the object at the top of the stack
	 * 
	 * @return the object at the top of the stack
	 */
	Item pop();
	
	/**
	 * Check if the stack is empty
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @return the size of the stack
	 */
	int size();
	
	/**
	 * Returns the object at the top of the stack without removing it
	 * @return the object at the top of the stack
	 */
	Item peek();
}
