package com.davidreghay.datastructures;

/**
 * A Stack is a LIFO (Last In, First Out) type data structure.  It consists of a top element which you can "push"
 * other elements on top of like a spring-loaded plate stack, or like a PEZ&trade; dispenser.  You can also "pop"
 * the top element off of the stack.
 * 
 * @author david.reghay
 *
 * @param <E> The type of elements to store in the stack
 */
public interface Stack<E> {
	/**
	 * Gets the top element of the stack without removing it from the stack
	 * @return the top element
	 */
	public E top();
	/**
	 * Gets the top element of the stack and removes it from the stack
	 * @return the top element
	 */
	public E pop();
	/**
	 * Pushes an element on top of the stack
	 * @param element to push onto the {@link Stack}
	 */
	public void push(E element);
	/**
	 * Gets the size of the stack
	 * @return the size of the {@link Stack}
	 */
	public int size();
}
