package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Author;
import bean.Book;
import dao.Dao;
import dao.IDao;
import service.IService;
import service.Service;

public class Main {
	static IService ser;

	static {
		ser = new Service();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Select Choice");
			System.out.println("\t1. Insert Author");
			System.out.println("\t2. Get All");
			System.out.println("\t3. Update Price");
			System.out.println("\t4. Delete Book");
			System.out.println("\t5. deleteAuthor");
			System.out.println("\t6. Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Author Name & Email:");
				Author a = new Author(sc.next(), sc.next());
				List<Book> b = new ArrayList<>();

				System.out.println("Enter Book Count");
				int cnt = sc.nextInt();
				sc.nextLine();

				while (cnt-- > 0) {
					System.out.println("Enter Book Title & Price:");
					String title = sc.nextLine();
					b.add(new Book(title, sc.nextDouble(), a));
					sc.nextLine();

				}
				ser.insertAuthor(a, b);
				break;

			case 2:
				ser.getAll();
				break;

			case 3:
				System.out.println("Enter Book Id & new Price");
				int bId = sc.nextInt();
				sc.nextLine();
				ser.updatePrice(bId, sc.nextDouble());
				sc.nextLine();
				break;

			case 4:
				System.out.println("Enter Book Id");
				ser.deleteBook(sc.nextInt());
				sc.nextLine();
				break;

			case 5:
				System.out.println("Enter Author Id");
				ser.deleteAuthor(sc.nextInt());
				sc.nextLine();
				break;

			case 6:
				System.exit(0);

			}
		}

	}
}
