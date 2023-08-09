package com.lumen.service;

import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public interface IBookService {
	
	//crud operation
	void addBook(Book book);
	void updateBook(int bookId,double price);
	void deleteBook(int bookId);
	
	List<Book> getAll();
	List<Book> getByAuthorContains(String author) throws BookNotFoundException;
	List<Book> getByCategory(String Category) throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author,String category) throws BookNotFoundException;
	Book getById(int bookId) throws BookNotFoundException;
}
