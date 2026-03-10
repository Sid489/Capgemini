package service;

import java.util.List;

import bean.Author;
import bean.Book;

public interface IService {
	public void insertAuthor(Author a,List<Book> books);
	public void getAll();
	public void updatePrice(int bId,double price);
	public void deleteBook(int bId);
	public void deleteAuthor(int aID);

}
