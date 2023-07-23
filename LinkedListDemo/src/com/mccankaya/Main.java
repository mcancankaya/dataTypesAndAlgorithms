package com.mccankaya;

import com.mccankaya.linkedList.LinkedList;

public class Main{
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("1.");
		list.addFirst("2.");
		list.addFirst("3.");
		list.addLast("son1");
		list.addLast("Son2");
		list.printList();
	}
}