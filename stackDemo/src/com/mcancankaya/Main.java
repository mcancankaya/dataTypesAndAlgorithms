package com.mcancankaya;

import com.mcancankaya.stackWithArray.StackWithArray;
import com.mcancankaya.stackWithLinkedList.StackWithNode;

public class Main {
	public static void main(String[] args) {

		// stackWithArrayExample();
		// stackWithNode();
	}

	public static void stackWithNode() {
		StackWithNode<String> stack = new StackWithNode<String>(5);
		stack.push("İzmir");
		stack.push("Ankara");
		stack.push("Adıyaman");
		stack.push("Selanik");
		System.out.println("Stack count : " + stack.getCount());
		stack.printStack();
		stack.pop();
		stack.push("İstanbul");
		System.out.println("Stack count : " + stack.getCount());
		stack.printStack();
		stack.pop();
		stack.pop();
		System.out.println("Stack count : " + stack.getCount());
		stack.pop();
		stack.pop();
		System.out.println("Stack count : " + stack.getCount());
		stack.printStack();
	}

	public static void stackWithArrayExample() {
		StackWithArray<Integer> stack = new StackWithArray<Integer>(Integer.class, 5);
		System.out.println("is empty : " + stack.isEmpty());
		System.out.println("is full : " + stack.isFull());

		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10); // Stack is full

		System.out.println("is empty : " + stack.isEmpty());
		System.out.println("is full : " + stack.isFull());

		System.out.println(stack.pop()); // 9
		System.out.println(stack.pop()); // 8
		System.out.println(stack.pop()); // 7
		System.out.println(stack.pop()); // 6
		System.out.println(stack.pop()); // 5
		System.out.println(stack.pop()); // null because Stack is empty

		System.out.println("is empty : " + stack.isEmpty());
		System.out.println("is full : " + stack.isFull());

	}

}
