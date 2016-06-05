package com.davidreghay.datastructures;

public interface Deque<Item> extends Iterable {
	
	/**
	 * is the deque empty?
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * number of items in the deque
	 * @return
	 */
	int size();
	
	/**
	 * add an item to the left end
	 * @param item
	 */
	void pushLeft(Item item);
	
	/**
	 * add an item to the right end
	 * @param item
	 */
	void pushRight(Item item);
	
	/**
	 * remove an item from the left end
	 * @return the removed item
	 */
	Item popLeft();
	
	/**
	 * remove an item from the right end
	 * @return
	 */
	Item popRight();
}
