package com.mccankaya.singlyLinkedList;

/**
 * @author can
 */
public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	public SinglyLinkedList() {
	}

	public void addFirst(T data) {
		Node<T> addNode = new Node<T>(data);
		Node<T> temp = head;

		if (checkHeadIsNull()) {
			head = addNode;
			tail = addNode;
		} else {
			addNode.setNext(temp);
			head = addNode;
		}
	}

	public void addLast(T data) {
		Node<T> addNode = new Node<T>(data);
		Node<T> temp = tail;
		if (checkHeadIsNull()) {
			addFirst(data);
		} else {
			temp.setNext(addNode);
			tail = addNode;
		}
	}

	public void addIndex(int index, T data) {

		if (checkHeadIsNull() || index <= 0) {
			addFirst(data);
		} else if (index > getLength()) {
			addLast(data);

		} else {
			Node<T> tempPrev = head;
			Node<T> temp = head;
			Node<T> addNode = new Node<T>(data);

			for (int i = 0; i < index; i++) {
				tempPrev = temp;
				temp = temp.getNext();
			}
			tempPrev.setNext(addNode);
			addNode.setNext(temp);
		}
	}

	public void removeFirst() {
		if (!checkHeadIsNull()) {
			head = head.getNext();
		}
	}

	public void removeLast() {
		if (tail != null) {
			Node<T> tempPrev = head;
			Node<T> temp = head;
			while (temp.getNext() != null) {
				tempPrev = temp;
				temp = temp.getNext();
			}
			temp = tempPrev;
			tempPrev.setNext(null);
			tail = temp;

		}
	}

	public void removeIndex(int index) {
		Node<T> tempPrev = head;
		Node<T> temp = head;
		int i = 0;
		while (i<index) {
			
			tempPrev = temp;
			temp = temp.getNext();
			i++;
		}
		tempPrev.setNext(temp.getNext());
		
		
	}

	public void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
	}

	private boolean checkHeadIsNull() {
		return head == null ? true : false;
	}

	public int getLength() {
		Node<T> temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}

		return count;
	}

	public Node<T> getFirst() {
		return head;
	}

	public void setFirst(Node<T> head) {
		this.head = head;
	}

	public Node<T> getLast() {
		return tail;
	}

	public void setLast(Node<T> tail) {
		this.tail = tail;
	}
}
