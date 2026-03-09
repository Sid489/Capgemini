package com.cg.service;

import java.util.List;

import com.cg.bean.Author;
import com.cg.bean.Book;
import com.cg.dao.AuthorDao;
import com.cg.dao.IAuthorDao;

public class AuthorService implements IAuthorService{
	IAuthorDao dao = new AuthorDao();

	@Override
	public List<Book> getAllBook(int aId) {
		
		return dao.getAllBook(aId);
	}

	@Override
	public String addAuthor(Author a) {
		
		return dao.addAuthor(a);
	}

	@Override
	public String addBook(Book b) {
		
		return dao.addBook(b);
	}

	@Override
	public String updatePrice(String name, double price) {
		
		return dao.updatePrice(name, price);
	}

}
