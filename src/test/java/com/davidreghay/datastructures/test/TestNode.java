package com.davidreghay.datastructures.test;

import com.davidreghay.datastructures.Node;

public class TestNode {
	public static void main(String[] args) {
		Node<String> node1 = new Node<String>("Hello, world! I'm node1!");
		Node<String> node2 = new Node<String>("Hello, world! I'm node2!", node1);
		Node<String> node3 = new Node<String>("Hello, world! I'm node3!", node2, node1);
		
		System.out.println(node1.getElement());
		System.out.println(node2.getElement());
		System.out.println(node3.getElement());
		
		Node<String> place = node1;
		place.setNext(node3);
		for(int i = 0; i < 3; i++) {
			System.out.println(place);
			System.out.println(place.getElement());
			place = place.getNext();
		}
	}
}
