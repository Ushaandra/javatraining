package com.lumen.service;

import java.util.ArrayList;
import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> authorList=new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthor().contains(author))
				authorList.add(book);
		}
		if(authorList.size()==0)
			throw new BookNotFoundException("No books with given requirements");
		return authorList;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> CategoryList=new ArrayList<>();
		for(Book book:books) {
			if(book.getCategory().equalsIgnoreCase(category))
				CategoryList.add(book);
		}
		if(CategoryList.size()==0)
			throw new BookNotFoundException("No books with given requirements");
		return CategoryList;
		
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> priceList=new ArrayList<>();
		for(Book book:books) {
			if(book.getPrice()<price)
				priceList.add(book);
		}
		if(priceList.size()==0)
			throw new BookNotFoundException("No books with given requirements");
		return priceList;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> authorAndCategoryList=new ArrayList<>();
		for(Book book:books) {
			if(book.getCategory().equalsIgnoreCase(category) && book.getAuthor().contains(author)) {
				authorAndCategoryList.add(book);
			}
			}
		if(authorAndCategoryList.size()==0)
			throw new BookNotFoundException("No books with given requirements");
		return authorAndCategoryList;
	}

	@Override
	public List<Book> getById(int bookId) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> idList=new ArrayList<>();
		for(Book book:books) {
			if(book.getBookId()==bookId)
				idList.add(book);
		}
		if(idList.size()==0)
			throw new BookNotFoundException("No books with given requirements");
		return idList;
	}

	@Override
	public List<Book> getAll() {
		List<Book> books=BookDetails.showBooks();
		return books;
	}
}

	

