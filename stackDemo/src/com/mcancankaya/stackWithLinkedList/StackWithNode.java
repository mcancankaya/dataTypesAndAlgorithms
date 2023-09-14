package com.mcancankaya.stackWithLinkedList;

public class StackWithNode<T> {
	private int capacity;
	private int count;
	private Node<T> top;

	public StackWithNode(int capacity) {
		this.capacity = capacity;
		this.count = 0;
		this.top = null;
	}

	public void push(T data) {

		Node<T> node = new Node<T>(data);
		if (isFull()) {
			System.err.println("Stack is full !!!");
		} else if (isEmpty()) {
			top = node;
			count++;
			System.out.println("push() : " + data);
		} else {
			node.setNext(top);
			top = node;
			System.out.println("push() : " + data);
			count++;
		}
	}

	public T pop() {
		Node<T> temp;
		if (isEmpty()) {
			System.err.println("Stack is empty !!!");
			return null;
		} else if (count == 1) {
			temp = top;
			top = null;
			count--;
			System.out.println("pop() : " + temp.getData());
			return temp.getData();
		} else {
			count--;
			temp = top;
			top = top.getNext();
			System.out.println("pop() : " + temp.getData());
			return temp.getData();
		}

	}

	public void printStack() {
		if (!isEmpty()) {
			Node<T> temp = top;
			System.out.printf("-------------------------%n|%9sSTACK%9S|%n", "", "");
			int count = this.count;
			System.out.printf("-------------------------%n");
			while (temp != null) {
				System.out.printf("| %-2d | %-17s|%n", count--, temp.getData());
				temp = temp.getNext();
			}
			System.out.printf("-------------------------%n");
		}
	}

	public T getTopData() {
		if (isEmpty()) {
			System.err.println("Stack is empty !!!");
		}

		return this.top.getData();

	}

	public boolean isFull() {
		return count == capacity;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getCount() {
		return count;
	}

	public Node<T> getTop() {
		return top;
	}

}
