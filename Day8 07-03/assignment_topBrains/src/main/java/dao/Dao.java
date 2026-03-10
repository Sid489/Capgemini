package dao;

import java.util.List;

import bean.Author;
import bean.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Dao implements IDao{
	
	static EntityManagerFactory emf;
	static EntityManager em;
	static EntityTransaction tx;
	
	static {
		emf = Persistence.createEntityManagerFactory("lms");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@Override
	public String insertAuthor(Author a, List<Book> books) {
		tx.begin();
		a.setBooks(books);
		em.persist(a);
		tx.commit();
		return "Inserted";
		
	}

	@Override
	public List<Author> getAll() {
		tx.begin();
		List<Author> aLi = em.createQuery("from Author",Author.class).getResultList();
		tx.commit();
		
		return aLi;
		
	}

	@Override
	public String updatePrice(int bId,double price) {
		tx.begin();
		Book b = em.find(Book.class, bId);
		b.setPrice(price);
		tx.commit();
		return "Price Updated";
		
		
	}

	@Override
	public String deleteBook(int bId) {
		tx.begin();
		Book b = em.find(Book.class, bId);
		em.remove(b);
		tx.commit();
		return "Book Deleted";
		
	}

	@Override
	public String deleteAuthor(int aId) {
		tx.begin();
		Author a = em.find(Author.class, aId);
		em.remove(a);
		tx.commit();
		return "Author Deleted";
		
	}

}
