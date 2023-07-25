package com.mccankaya;

import java.util.Scanner;

import com.mccankaya.singlyLinkedList.SinglyLinkedList;

public class Main{
	
	public static void main(String[] args) {
		try {
			stringTest();	
		}catch(Exception e){
			System.out.println("----> HATA OLUŞTU PROGRAM YENİDEN BAŞLATILDI <----");
			main(args);
		}

	}
	
	public static void stringTest() {
		Scanner scanner = new Scanner(System.in);
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		boolean status = true;
		int action;
		StringBuilder builder = new StringBuilder("\n---- Singly Linked List Demo ----");
		builder.append("\n 1 -> Başa ekle").append("\n 2 -> Sona ekle").append("\n 3 -> Araya Ekle").append("\n 4 -> Listeyi Yazdır").append("\n 5 -> Baştan Sil")
		.append("\n 6 -> Sondan Sil").append("\n 7 -> Aradan Sil").append("\n 8 -> Programdan Çık\n");
		
		do {
			System.out.println(builder.toString());
			System.out.print("--> Lütfen bir işlem seçin : ");
			action = scanner.nextInt();
			
			switch (action) {
			case 1:
				System.out.print("--> Başa eklemek istediğin elemanı gir : ");
				list.addFirst(scanner.next());
				break;
			case 2:
				System.out.print("--> Sona eklemek istediğin elemanı gir : ");
				list.addLast(scanner.next());
				break;
			case 3:
				int index;
				System.out.print("--> Eklenecek indis numarasını gir : ");
				index = scanner.nextInt();
				System.out.print("--> "+index + ". indise eklemek istediğin elemanı gir : ");
				list.addIndex(index, scanner.next());
				break;
			case 4:
				System.out.println("--- > Liste < ---");
				list.printList();
				break;
			case 5:
				list.removeFirst();
				break;
			case 6:
				list.removeLast();
				break;
			case 7:
				System.out.print("--> Silmek istediğin indisi gir : ");
				list.removeIndex(scanner.nextInt());
				break;
			case 8:
				System.out.print("Çıkış yapıldı. Si yu egeyn");
				status = false;
				break;
			default:
				System.out.println("Hatalı Seçim.");;
			}
		
		}while(status);
		
	}
	
}