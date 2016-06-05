package com.davidreghay.datastructures;

public interface Buffer {

	/**
	 * Inserts the character c at the cursor position
	 * @param c
	 */
	void insert(char c);
	
	/**
	 * Get the character at the cursor position
	 * @return
	 */
	char get();
	
	/**
	 * Delete and return the character at the cursor
	 * @return
	 */
	char delete();
	
	/**
	 * Move the cursor k positions to the left
	 * @param k
	 */
	void left(int k);
	
	/**
	 * Move the cursor k positions to the left
	 * @param k
	 */
	void right(int k);
	
	/**
	 * Number of characters in the buffer 
	 * @return
	 */
	int size();
	
}
