package org.test;

import org.list.singly.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {

		SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

		// Add element in list
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		// Traverse Linked List
		linkedList.iterate();

	}

}
