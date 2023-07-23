package com.mccankaya.linkedList;
/**
 * @author can
 */
public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void addFirst(T data) {
		Node<T> addNode = new Node<T>(data);
		Node<T> temp = head;
		
		if (checkHeadIsNull()) {
			head = addNode;
			tail = addNode;
		}else {
			addNode.setNext(temp);
			head = addNode;
		}
	}
	
	public void addLast(T data) {
		Node<T> addNode = new Node<T>(data);
		Node<T> temp = tail;
		if (checkHeadIsNull()) {
			addFirst(data);
		}else {
			temp.setNext(addNode);
			tail = addNode;
		}
	}
	
	public void printList() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+" -> ");
			temp = temp.getNext();
		}
	}
	
	
	private boolean checkHeadIsNull() {
		return head==null?true:false;
	}
	
	private int getLength() {
		Node<T> temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}
	
	
	public Node<T> getFirst(){
		return head;
	}
	
	public void setFirst(Node<T> head) {
		this.head = head;
	}
	
	public Node<T> getLast(){
		return tail;
	}
	
	public void setLast(Node<T> tail) {
		this.tail = tail;
	}
}
