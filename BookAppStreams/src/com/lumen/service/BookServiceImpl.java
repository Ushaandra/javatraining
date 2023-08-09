package com.lumen.service;

import java.util.List;
import java.util.stream.Collectors;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getByAuthor=books.stream()
				.filter((book)->book.getAuthor().contains(author))
				.collect(Collectors.toList());
		if(getByAuthor.size()==0)
			throw new BookNotFoundException("No books found with given author");
		return getByAuthor;
	}

	@Override
	public List<Book> getByCategory(String Category) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getByCategory=books.stream()
				.filter((book)->book.getCategory().equals(Category))
				.collect(Collectors.toList());
		if(getByCategory.size()==0)
			throw new BookNotFoundException("No books found with given category");
		return getByCategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getByPrice=books.stream()
				.filter((book)->book.getPrice()<price)
				.collect(Collectors.toList());
		if(getByPrice.size()==0)
			throw new BookNotFoundException("No books found with given price");
		return getByPrice;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getByAuthorandCategory=books.stream()
				.filter((book)->book.getCategory().equalsIgnoreCase(category))
				.filter((book)->book.getAuthor().contains(author))
				.collect(Collectors.toList());
		if(getByAuthorandCategory.size()==0)
			throw new BookNotFoundException("No books found with given author and category");
		return getByAuthorandCategory;
	}

	@Override
	public List<Book> getById(int bookId) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getById=books.stream()
				.filter((book)->book.getBookId()==bookId)
				.collect(Collectors.toList());
		if(getById.size()==0)
			throw new BookNotFoundException("No books found with given Id");
		return getById;
	}
	

}
