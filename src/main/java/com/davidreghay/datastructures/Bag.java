package com.davidreghay.datastructures;

/**
 * 
 * @author david.reghay
 *
 */
public interface Bag<Item> extends Iterable {
	/**
	 * Add an item the the Bag
	 * 
	 * @param item - The item to add to the Bag
	 */
	void add(Item item);
	
	/**
	 * Check if the Bag is empty
	 * 
	 * @return true if the Bag is empty, else false
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @return the number of items in the Bag
	 */
	int size();
}
