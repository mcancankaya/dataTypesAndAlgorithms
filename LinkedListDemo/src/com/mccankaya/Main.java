package com.mccankaya;

import java.util.Scanner;

import com.mccankaya.doublyCircularLinkedList.DoublyCircularLinkedList;
import com.mccankaya.doublyLinkedList.DoublyLinkedList;
import com.mccankaya.singlyCircularLinkedList.SinglyCircularLinkedList;
import com.mccankaya.singlyLinkedList.SinglyLinkedList;

/**
 * @author can
 */
public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

//		stringSinglyTest();
		// doublyLinkedListTest();
//		singlyCircularLinkedList();
		doublyCircularLinkedList();

	}

	public static void doublyCircularLinkedList() {
		DoublyCircularLinkedList<String> list = new DoublyCircularLinkedList<String>();
		boolean status = true;
		int action;

		StringBuilder builder = new StringBuilder("\n--- Doubly Circular Linked List Demo ---");
		builder.append("\n 1 - Başa ekle").append("\n 2 - Sona ekle").append("\n 3 - Araya ekle")
				.append("\n 4 - Listeyi yazdır").append("\n 6 - Liste Boyutunu yazdır").append("\n 7 - Baştan Sil")
				.append("\n 8 - Sondan Sil").append("\n 9 - İndis Sil").append("\n 0 - Programdan Çık");

		do {
			System.out.println(builder.toString());
			System.out.print("Lütfen bir işlem seçin : ");
			action = scanner.nextInt();
			switch (action) {
			case 1:
				System.out.print("Başa eklemek istediğiniz elemanı giriniz : ");
				list.addFirst(scanner.next());
				break;
			case 2:
				System.out.print("Sona eklemek istediğiniz elemanı giriniz : ");
				list.addLast(scanner.next());
				break;
			case 3:
				System.out.print("Eklenecek indis numarasını gir : ");
				int index = scanner.nextInt();
				System.out.print(index + ". indise eklemek istediğin elemanı gir : ");
				list.addIndex(index, scanner.next());
				break;
			case 4:
				System.out.println("--- Liste ---");
				list.printList();
				break;
			case 5:
				list.printListDetail();
				break;

			case 6:
				System.out.print("Eleman Sayısı : " + list.getLength());
				break;
			case 7:
				list.removeFirst();
				System.out.println("Baştaki eleman silindi.");
				break;
			case 8:
				list.removeLast();
				System.out.println("Sondaki eleman silindi.");
				break;
			case 9:
				System.out.print("Silinecek indisi gir : ");
				list.removeIndex(scanner.nextInt());
				break;
			case 0:
				System.out.println("Program bitti.");
				status = false;
				break;
			default:
				System.out.println("Hatalı Seçim.");
				break;
			}
			System.out.println();
			list.printList();
		} while (status);
	}

	public static void singlyCircularLinkedList() {
		SinglyCircularLinkedList<String> list = new SinglyCircularLinkedList<String>();
		boolean status = true;
		int action;

		StringBuilder builder = new StringBuilder("\n--- Singly Circular Linked List Demo ---");
		builder.append("\n 1 - Başa ekle").append("\n 2 - Sona ekle").append("\n 3 - Araya ekle")
				.append("\n 4 - Listeyi yazdır").append("\n 6 - Liste Boyutunu yazdır").append("\n 7 - Baştan Sil")
				.append("\n 8 - Sondan Sil").append("\n 9 - İndis Sil").append("\n 0 - Programdan Çık");

		do {
			System.out.println(builder.toString());
			System.out.print("Lütfen bir işlem seçin : ");
			action = scanner.nextInt();
			switch (action) {
			case 1:
				System.out.print("Başa eklemek istediğiniz elemanı giriniz : ");
				list.addFirst(scanner.next());
				break;
			case 2:
				System.out.println("Sona eklemek istediğiniz elemanı giriniz : ");
				list.addLast(scanner.next());
				break;
			case 3:
				System.out.print("Eklenecek indis numarasını gir : ");
				int index = scanner.nextInt();
				System.out.print(index + ". indise eklemek istediğin elemanı gir : ");
				list.addIndex(index, scanner.next());
				break;
			case 4:
				System.out.println("--- Liste ---");
				list.printList();
				break;

			case 6:
				System.out.print("Eleman Sayısı : " + list.getLength());
				break;
			case 7:
				list.removeFirst();
				System.out.println("Baştaki eleman silindi.");

				break;
			case 8:
				list.removeLast();
				System.out.println("Sondaki eleman silindi.");
				break;

			case 9:
				System.out.print("Silinecek indisi gir : ");
				list.removeIndex(scanner.nextInt());
				break;
			case 0:
				System.out.println("Program bitti.");
				status = false;
				break;
			default:
				System.out.println("Hatalı Seçim.");
				break;
			}
			System.out.println();
			list.printList();
		} while (status);

	}

	public static void doublyLinkedListTest() {
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();
		boolean status = true;
		int action;

		StringBuilder builder = new StringBuilder("\n---- Doubly Linked List Demo ----");
		builder.append("\n 1 - Başa ekle").append("\n 2 - Sona ekle").append("\n 3 - Araya ekle")
				.append("\n 4 - Listeyi yazdır").append("\n 5 - Listeyi Detaylı Yazdır")
				.append("\n 6 - Liste Boyutunu yazdır").append("\n 7 - Baştan Sil").append("\n 8 - Sondan Sil")
				.append("\n 9 - İndis Sil").append("\n 0 - Programdan Çık");

		do {

			System.out.println(builder.toString());
			System.out.print("Lütfen bir işlem seçin : ");
			action = scanner.nextInt();
			switch (action) {
			case 0:
				System.out.println("Çıkış yapıldı.");
				status = false;
				break;
			case 1:
				System.out.print("Başa eklemek istediğiniz elemanı giriniz : ");
				list.addFirst(scanner.next());
				break;
			case 2:
				System.out.print("Sona eklemek istediğiniz elemanı giriniz : ");
				list.addLast(scanner.next());
				break;
			case 3:
				System.out.print("Eklenecek indis numarasını gir : ");
				int index = scanner.nextInt();
				System.out.print(index + ". indise eklemek istediğin elemanı gir : ");
				list.addIndex(index, scanner.next());
				break;
			case 4:
				System.out.println("--- Liste ---");
				list.printList();
				break;
			case 5:
				System.out.println("--- Liste ---");
				list.printInDetail();
				break;
			case 6:
				System.out.println("Eleman sayısı : " + list.getLength());
				break;
			case 7:
//				System.out.print("Gerçekten silmek istiyor musunuz ? (Y or N)");
//				String c1 = scanner.next();
//				if (c1.equals("Y")) {
//					list.removeFirst();
//				} else {
//					System.out.println("Silme işlemi iptal edildi.");
//				}
				list.removeFirst();
				break;
			case 8:
//				System.out.print("Gerçekten silmek istiyor musunuz ? (Y or N)");
//				String c2 = scanner.next();
//
//				if (c2.equals("Y")) {
//					list.removeLast();
//				} else {
//					System.out.println("Silme işlemi iptal edildi.");
//				}
				list.removeLast();
				break;
			case 9:
				System.out.print("Silmek istediğin indisi gir : ");
				int indexDelete = scanner.nextInt();
				list.removeIndex(indexDelete);
				break;
			default:
				System.out.println("Hatalı Seçim.");
				break;
			}
			list.printList();

		} while (status);
	}

	public static void stringSinglyTest() {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		boolean status = true;
		int action;
		StringBuilder builder = new StringBuilder("\n---- Singly Linked List Demo ----");
		builder.append("\n 1 -> Başa ekle").append("\n 2 -> Sona ekle").append("\n 3 -> Araya Ekle")
				.append("\n 4 -> Listeyi Yazdır").append("\n 5 -> Baştan Sil").append("\n 6 -> Sondan Sil")
				.append("\n 7 -> Aradan Sil").append("\n 8 -> Programdan Çık\n");

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
				System.out.print("--> " + index + ". indise eklemek istediğin elemanı gir : ");
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
				System.out.println("Hatalı Seçim.");
				break;
			}

		} while (status);

	}

}