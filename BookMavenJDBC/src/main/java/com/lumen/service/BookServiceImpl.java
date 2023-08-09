package com.lumen.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public class BookServiceImpl implements IBookService{
	
	IBookDao bookDao=new BookDaoImpl();

	@Override
	public List<Book> getAll() {
		return bookDao.findAll();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> book=bookDao.findByAuthorContains(author);
		if(book.size()==0)
			throw new BookNotFoundException();
		book.stream().collect(Collectors.toList());
		return book;
	}

	@Override
	public List<Book> getByCategory(String Category) throws BookNotFoundException {
		List<Book> book=bookDao.findByCategory(Category);
		if(book.size()!=0)
			return book.stream().collect(Collectors.toList());
		throw new BookNotFoundException();
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> book=bookDao.findByPriceLessThan(price);
		if(book.size()!=0)
			return book.stream().collect(Collectors.toList());
		throw new BookNotFoundException();
		
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> book=bookDao.findByAuthorContainsAndCategory(author,category);
		if(book.size()!=0)
			return book.stream().collect(Collectors.toList());
		throw new BookNotFoundException();
		
	}

	

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

	@Override
	public void updateBook(int bookId, double price) {
		bookDao.updateBook(bookId, price);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		Book book=(Book)bookDao.findById(bookId);
		if(book==null)
			return book;
		throw new BookNotFoundException();
	}

	
}

	

