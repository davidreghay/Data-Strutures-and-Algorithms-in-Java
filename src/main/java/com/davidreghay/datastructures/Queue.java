package com.davidreghay.datastructures;

/**
 * 
 * @author david.reghay
 *
 */
public interface Queue<Item> extends Iterable {
	
	/**
	 * Adds an item to the back of the queue
	 * 
	 * @param item
	 */
	void enqueue(Item item);
	
	/**
	 * Removes and returns the item at the front of the queue
	 * @return the item at the front of the queue
	 */
	Item dequeue();
	
	/**
	 * Check if the queue is empty
	 * 
	 * @return true if the queue is empty, else false
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @return the size of the queue
	 */
	int size();
}
