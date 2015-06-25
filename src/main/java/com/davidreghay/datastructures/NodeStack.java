package com.davidreghay.datastructures;

/**
 * A {@link Stack} implemented using the {@link SingleNode} class.  Using the {@link Node} class would
 * be overkill, since there is no need for both prev and next Nodes. 
 * @author david.reghay
 *
 * @param <E>
 */
public class NodeStack<E> implements Stack<E> {
	
	private SingleNode<E> top;
	private int size;
	
	public NodeStack() {
		super();
	}
	
	public NodeStack(E element) {
		top = new SingleNode<E>(element);
	}
	
	@Override
	public E top() {
		return top.getElement();
	}
	
	@Override
	public E pop() {
		E element = top.getElement();
		top = top.getNext();
		size--;
		return element;
	}
	
	@Override
	public void push(E element) {
		SingleNode<E> newTop = new SingleNode<E>(element, top);
		top = newTop;
		size++;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	
}
