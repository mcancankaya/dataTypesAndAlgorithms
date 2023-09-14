package com.mcancankaya.stackWithArray;

import java.lang.reflect.Array;

public class StackWithArray<T> {

	private T[] stack;
	private int size;
	private int index;

	public StackWithArray(Class<T> clazz, int size) {
		this.size = size;
		stack = (T[]) Array.newInstance(clazz, size);
		index = -1;
	}

	public void push(T data) {
		if (isFull()) {
			System.err.println("Stack dolu !!!");
		} else {
			stack[++index] = data;
			System.out.println("push () : " + stack[index]);
		}
	}

	public T pop() {
		if (!isEmpty()) {
			return stack[index--];
		} else {
			System.err.println("Dizi boş !!!");
			return null;
		}

	}

	public boolean isFull() {
		return index == size - 1;
	}

	public boolean isEmpty() {
		return index == -1;
	}
}
