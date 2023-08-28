package com.mccankaya.singlyCircularLinkedList;

public class SinglyCircularLinkedList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;

	public SinglyCircularLinkedList() {

	}

	public void addFirst(T data) {
		Node<T> addNode = new Node<T>(data);
		if (checkHeadIsNull()) {
			head = addNode;
			tail = addNode;
			tail.setNext(head);
		} else {
			addNode.setNext(head);
			head = addNode;
			tail.setNext(head);
		}
	}

	public void addLast(T data) {
		Node<T> addNode;
		if (checkHeadIsNull()) {
			addFirst(data);
		} else {
			addNode = new Node<T>(data);
			tail.setNext(addNode);
			tail = addNode;
			tail.setNext(head);
		}
	}

	public void addIndex(int index, T data) {
		Node<T> addNode = null;
		if (checkHeadIsNull()) {
			addFirst(data);
		} else {

			if (index >= getLength()) {
				addLast(data);
			} else if (index <= 0) {
				addFirst(data);
			} else {
				int count = 0;
				addNode = new Node<T>(data);
				Node<T> nextNode = head;
				Node<T> prevNode = nextNode;

				while (count < index) {
					prevNode = nextNode;
					nextNode = nextNode.getNext();
					count++;
				}

				prevNode.setNext(addNode);
				addNode.setNext(nextNode);
			}
		}
	}

	public void removeFirst() {
		if (head == null) {
			System.err.println("Liste Boş !");
			return;
		}
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			head = head.getNext();
			tail.setNext(head);
		}
	}

	public void removeLast() {
		if (head == null) {
			System.err.println("Liste Boş !");
			return;
		}
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			Node<T> temp = head;
			while (temp.getNext() != tail) {
				temp = temp.getNext();
			}
			tail = temp;
			tail.setNext(head);
		}
	}

	public void removeIndex(int index) {
		if (index >= getLength()) {
			removeLast();

		} else if (index <= 0) {
			removeFirst();
		} else {
			int count = 0;
			Node<T> nextNode = head;
			Node<T> prevNode = nextNode;
			while (count < index) {
				prevNode = nextNode;
				nextNode = nextNode.getNext();
				count++;
			}

			prevNode.setNext(nextNode.getNext());

		}
	}

	public void printList() {
		Node<T> temp = head;
		do {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		} while (temp != head);
	}

	public int getLength() {
		Node<T> temp = head;
		int count = 0;
		while (temp != tail) {
			count++;
			temp = temp.getNext();
		}
		count++;
		return count;
	}

	private boolean checkHeadIsNull() {
		return head == null ? true : false;
	}

}
