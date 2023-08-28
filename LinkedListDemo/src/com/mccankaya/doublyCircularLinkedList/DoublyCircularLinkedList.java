package com.mccankaya.doublyCircularLinkedList;

import com.mccankaya.doublyLinkedList.Node;

public class DoublyCircularLinkedList<T> {
	private Node<T> head = null;
	private Node<T> tail = null;

	public DoublyCircularLinkedList() {

	}

	public void addFirst(T data) {
		Node<T> addNode = new Node<T>(data);
		if (checkHeadIsNull()) {
			head = addNode;
			tail = addNode;
		} else {
			tail.setNext(addNode);
			addNode.setPrevious(tail);
			addNode.setNext(head);
			head.setPrevious(addNode);
			head = addNode;
		}
	}

	public void addLast(T data) {
		if (checkHeadIsNull()) {
			addFirst(data);
		} else {
			Node<T> addNode = new Node<T>(data);
			tail.setNext(addNode);
			addNode.setPrevious(tail);
			addNode.setNext(head);
			head.setPrevious(addNode);
			tail = addNode;
		}
	}

	public void addIndex(int index, T data) {
		if (checkHeadIsNull()) {
			addFirst(data);
		} else if (index >= getLength()) {
			addLast(data);
		} else {
			Node<T> addNode = new Node<T>(data);
			Node<T> nextNode = head;
			Node<T> prevNode = nextNode.getPrevious();
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
		if (!checkHeadIsNull()) {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.getNext();
				head.setPrevious(tail);
				tail.setNext(head);

			}
		}
	}

	public void removeLast() {
		if (!checkHeadIsNull()) {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				Node<T> tempPrev = tail.getPrevious();
				tempPrev.setNext(head);
				tail = tempPrev;
				head.setPrevious(tail);
			}
		}
	}

	public void removeIndex(int index) {
		if (index == 0) {
			removeFirst();
		} else if (index >= getLength() - 1) {
			removeLast();
		} else {
			Node<T> tempPrev = head;
			Node<T> temp = head;
			int i = 0;

			while (i < index) {
				temp = temp.getNext();
				tempPrev = temp.getPrevious();
				i++;
			}
			tempPrev.setNext(temp.getNext());
			temp.getNext().setPrevious(tempPrev);

		}
	}

	public int getLength() {
		if (checkHeadIsNull() || checkTailIsNull()) {
			return 0;
		} else {
			Node<T> temp = head;
			int count = 1;

			while (temp != tail) {
				count++;
				temp = temp.getNext();
			}

			return count++;
		}

	}

	public void printListDetail() {
		if (checkHeadIsNull()) {
			return;
		}
		Node<T> temp = head;
		{
			do {
				System.out.println("(" + temp.getPrevious().getData() + ") - " + temp.getData() + "- ( "
						+ temp.getNext().getData() + " ) <-> ");
				temp = temp.getNext();
			} while (temp != tail.getNext());
		}
	}

	public void printList() {
		if (checkHeadIsNull()) {
			return;
		}
		Node<T> temp = head;
		{
			do {
				System.out.print(temp.getData() + " <-> ");
				temp = temp.getNext();
			} while (temp != tail.getNext());
		}
	}

	private boolean checkTailIsNull() {
		return tail == null ? true : false;
	}

	private boolean checkHeadIsNull() {
		return head == null ? true : false;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

}
