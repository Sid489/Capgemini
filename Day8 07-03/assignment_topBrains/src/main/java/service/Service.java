package service;

import java.util.List;

import bean.Author;
import bean.Book;
import dao.Dao;
import dao.IDao;

public class Service implements IService {
	static IDao dao = new Dao();

	@Override
	public void insertAuthor(Author a, List<Book> books) {
		System.out.println(dao.insertAuthor(a, books));

	}

	@Override
	public void getAll() {
		List<Author> aLi = dao.getAll();
		
		aLi.forEach(a -> {
			System.out.println("Author Id: " + a.getAuthorId());
			System.out.println("Author Name: " +a.getAuthorName());
			System.out.println();
			System.out.println("Books Written");
			System.out.println("-------------------------");
			a.getBooks().forEach(e->System.out.println(e.getTitle()+ "-" + (int)e.getPrice()));
			System.out.println();
			
		});
		
		
	}

	@Override
	public void updatePrice(int bId, double price) {
		System.out.println(dao.updatePrice(bId, price));

	}

	@Override
	public void deleteBook(int bId) {
		System.out.println(dao.deleteBook(bId));

	}

	@Override
	public void deleteAuthor(int aID) {
		System.out.println(dao.deleteAuthor(aID));

	}

}
