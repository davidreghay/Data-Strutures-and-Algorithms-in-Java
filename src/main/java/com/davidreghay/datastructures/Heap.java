package com.davidreghay.datastructures;

/**
 * A Heap as based on the definition given in CLRS.  This is a purely generic form
 * without maintaining any heap-property (either max or min).
 * 
 * @author david.reghay
 *
 * @param <Item> The type of item that is held by the Heap
 */

public class Heap<Item> {
	private Item[] a;
	private int heapSize;
	
	/**
	 * Gives the index of the left child of a node at index i in the underlying array
	 * @param i
	 * @return
	 */
	public int left(int i) {
		return i * 2;
	}
	
	/**
	 * Gives the index of the right child of a node at index i in the underlying array
	 * @param i
	 * @return
	 */
	public int right(int i) {
		return i * 2 + 1;
	}
	
	/**
	 * Gives the index of the parent of a node at index i in the underlying array
	 * @param i
	 * @return
	 */
	public int parent(int i) {
		return i / 2;
	}
	
}
