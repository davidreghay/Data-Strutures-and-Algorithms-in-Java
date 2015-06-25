package com.davidreghay.datastructures;

/**
 * The SingleNode is a basic unit when it comes to data structures.  It simply stores an {@link #element} and references
 * links to a {@link #next}.  This class uses Generics to allow the construction  of Nodes storing any type of element.
 * Nodes are building blocks which can be used to create LinkedLists, Stacks, Queues, Trees, etc.  
 * Virtually any data structure can be built out of SingleNodes.  SingleNodes are slightly more compact than Nodes
 * since they do not have a prev field.  There are many cases where a prev field would be superfluous, as for example
 * in the case of a {@link Stack}.
 * 
 * @author david.reghay
 * @param <E> Generic type for elements to be stored in a SingleNode
 * 
 */
public class SingleNode<E> {
	
	private SingleNode<E> next;
	private E element;
	
	public SingleNode() {
		super();
	}
	
	/**
	 * 
	 * @param element the {@link #element} to store in the new {@link SingleNode}
	 */
	public SingleNode(E element) {
		this.element = element;
	}
	
	/**
	 * 
	 * @param element the {@link #element} to store in the new {@link SingleNode}
	 * @param next the {@link SingleNode} to set as this Node's {@link #next} field
	 */
	public SingleNode(E element, SingleNode<E> next) {
		this(element);
		this.next = next;
	}
	
	/**
	 * 
	 * @return the {@link #element} stored in the {@link SingleNode}
	 */
	public E getElement() {
		return element;
	}
	
	/**
	 * 
	 * @return the {@link #next} field of the {@link SingleNode}
	 */
	public SingleNode<E> getNext() {
		return next;
	}
	
	/**
	 * 
	 * @param element to store as the {@link #element} of the {@link SingleNode}
	 */
	public void setElement(E element) {
		this.element = element;
	}
	
	/**
	 * 
	 * @param next to set as the {@link #next} field of the {@link SingleNode}
	 */
	public void setNext(SingleNode<E> next) {
		this.next = next;
	}
	
}
