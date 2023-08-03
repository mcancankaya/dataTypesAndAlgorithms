package com.mccankaya.doublyLinkedList;

public class DoublyLinkedList<T> {
	private Node<T> head = null;
	private Node<T> tail = null;

	public void addFirst(T data) {
		Node<T> addNode = new Node<T>(data);
		if (checkHeadIsNull()) {
			head = addNode;
			tail = addNode;
		} else {
			Node<T> temp = head;
			head = addNode;
			head.setNext(temp);
			temp.setPrevious(head);
		}
	}

	public void addLast(T data) {
		Node<T> addNode = new Node<T>(data);
		if (checkHeadIsNull()) {
			addFirst(data);
		} else {
			tail.setNext(addNode);
			addNode.setPrevious(tail);
			tail = addNode;
		}
	}

	public void addIndex(int index, T data) {
		if (checkHeadIsNull() || index <= 0) {
			addFirst(data);
		} else if (index >= getLength()) {
			addLast(data);
		} else {
			Node<T> addNode = new Node<T>(data);
			Node<T> prevNode = head;
			Node<T> nextNode = head;
			for (int i = 0; i < index; i++) {
				nextNode = nextNode.getNext();
				prevNode = nextNode.getPrevious();
			}

			prevNode.setNext(addNode);
			addNode.setPrevious(prevNode);
			addNode.setNext(nextNode);
			nextNode.setPrevious(addNode);

		}
	}

	public void removeFirst() {
		Node<T> temp = head.getNext();
		if (!checkHeadIsNull()) {
			temp.setPrevious(null);
			head = temp;
		}

	}

	public void removeLast() {
		Node<T> temp = tail.getPrevious();
		if (!checkTailIsNull()) {
			temp.setNext(null);
			tail = temp;
		}

	}

	public void removeIndex(int index) {
		Node<T> tempPrev = head;
		Node<T> temp = head;
		int i = 0;
		while (i < index) {
			tempPrev = temp;
			temp = temp.getNext();
			i++;
		}

		tempPrev.setNext(temp.getNext());
		temp.getNext().setPrevious(tempPrev);

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

	public void printInDetail() {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getPrevious() == null) {
				System.out.println("(null)-" + temp.getData() + "-(" + temp.getNext().getData() + ")-" + " <-> ");
				temp = temp.getNext();
			} else if (temp.getNext() == null) {
				System.out.println("(" + temp.getPrevious().getData() + ")-" + temp.getData() + "-(null)-");
				temp = temp.getNext();
			} else {
				System.out.println("(" + temp.getPrevious().getData() + ")-" + temp.getData() + "-("
						+ temp.getNext().getData() + ")-" + " <-> ");
				temp = temp.getNext();
			}
		}
	}

	public void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " <-> ");
			temp = temp.getNext();
		}
	}

	private boolean checkHeadIsNull() {
		return head == null ? true : false;
	}

	private boolean checkTailIsNull() {
		return tail == null ? true : false;
	}
}
