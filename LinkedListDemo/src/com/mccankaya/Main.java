package com.mccankaya;

import java.util.Scanner;

import com.mccankaya.linkedList.LinkedList;

public class Main{
	
	public static void main(String[] args) {
		stringTest();
	}
	
	public static void stringTest() {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		boolean status = true;
		int action;
		System.out.println("---- Linked List Demo ----");
		do {
			System.out.println("\n1. Başa ekle\n2. Sona ekle\n3. Araya ekle\n4. Listeyi yazdır\n5. Baştan Sil\n6. Sondan Sil\n7. Aradan Sil");
			System.out.print("Lütfen bir işlem seçin : ");
			action = scanner.nextInt();
			
			switch (action) {
			case 1:
				System.out.print("Başa eklemek istediğin elemanı gir : ");
				list.addFirst(scanner.next());
				break;
			case 2:
				System.out.print("Sona eklemek istediğin elemanı gir : ");
				list.addLast(scanner.next());
				break;
			case 3:
				int index;
				System.out.print("Eklenecek indis numarasını gir : ");
				index = scanner.nextInt();
				System.out.print(index + ". indise eklemek istediğin elemanı gir : ");
				list.addIndex(index, scanner.next());
				break;
			case 4:
				list.printList();
				break;
			case 5:
				list.removeFirst();
				break;
			case 6:
				list.removeLast();
				break;
			case 7:
				System.out.print("Silmek istediğin indisi gir : ");
				list.removeIndex(scanner.nextInt());
				break;
			default:
				System.out.println("Hatalı Seçim.");;
			}
		
		}while(status);
		
	}
	
}