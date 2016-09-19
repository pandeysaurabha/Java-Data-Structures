package org.list.singly;

public class SinglyLinkedList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;

	public boolean add(T element) {
		Node<T> node = new Node<T>();
		node.setValue(element);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNextNode(node);
			tail = node;
		}
		return true;
	}

	public void iterate() {
		Node<T> temp = head;
		while (true) {
			if (temp == null) {
				break;
			}
			System.out.println(temp.getValue());
			temp = temp.getNextNode();
		}
	}

	public void removeFront() {

		if (head == null) {
			System.out.println("Underflow");
		}
		Node<T> temp = head;
		head = temp.getNextNode();

	}

	public int size() {
		int count = 0;
		Node<T> temp = head;
		while (true) {
			if (temp == null) {
				break;
			}
			temp = temp.getNextNode();
			count++;
		}
		return count;
	}
}
