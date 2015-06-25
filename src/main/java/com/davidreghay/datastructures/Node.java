package com.davidreghay.datastructures;

/**
 * The Node is a basic unit when it comes to data structures.  It simply stores an {@link #element} and references
 * links to a {@link #next} and a {@link #prev}ious Node.  This class uses Generics to allow the construction
 * of Nodes storing any type of element.  Nodes are building blocks which can be used to create LinkedLists,
 * Stacks, Queues, Trees, etc.  Virtually any data structure can be built out of Nodes.
 * 
 * @author david.reghay
 * @param <E> Generic type for elements to be stored in a Node
 * 
 */
public class Node<E> {
	
	private Node<E> next;
	private Node<E> prev;
	private E element;
	
	public Node() {
		super();
	}
	
	/**
	 * 
	 * @param element the {@link #element} to store in the new {@link Node}
	 */
	public Node(E element) {
		this.element = element;
	}
	
	/**
	 * 
	 * @param element the {@link #element} to store in the new {@link Node}
	 * @param next the {@link Node} to set as this Node's {@link #next} field
	 */
	public Node(E element, Node<E> next) {
		this(element);
		this.next = next;
	}
	
	/**
	 * 
	 * @param element the {@link #element} to store in the new {@link Node}
	 * @param next the {@link Node} to set as this Node's {@link #next} field
	 * @param prev the {@link Node} to set as this Node's {@link #prev} field
	 */
	public Node(E element, Node<E> next, Node<E> prev) {
		this(element, next);
		this.prev = prev;
	}
	
	/**
	 * 
	 * @return the {@link #element} stored in the {@link Node}
	 */
	public E getElement() {
		return element;
	}
	
	/**
	 * 
	 * @return the {@link #next} field of the {@link Node}
	 */
	public Node<E> getNext() {
		return next;
	}
	
	/**
	 * 
	 * @return the {@link #prev} field of the {@link Node}
	 */
	public Node<E> getPrev() {
		return prev;
	}
	
	/**
	 * 
	 * @param element to store as the {@link #element} of the {@link Node}
	 */
	public void setElement(E element) {
		this.element = element;
	}
	
	/**
	 * 
	 * @param next to set as the {@link #next} field of the {@link Node}
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	/**
	 * 
	 * @param prev to set as the {@link #prev} field of the {@link Node}
	 */
	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
	
}
