package dao;

import java.util.List;

import bean.Author;
import bean.Book;

public interface IDao {
	public String insertAuthor(Author a,List<Book> books);
	public List<Author> getAll();
	public String updatePrice(int bId,double price);
	public String deleteBook(int bId);
	public String deleteAuthor(int aID);

}
