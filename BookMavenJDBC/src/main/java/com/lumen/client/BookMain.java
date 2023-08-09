package com.lumen.client;


import java.util.List;

import com.lumen.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class BookMain {
	public static void main(String[] args) {
		IBookService bookService=new BookServiceImpl();
		//title,author, category, bookId, price
		
//		bookService.addBook(new Book("Java in Action","John David","Tech",1,900));
//		bookService.addBook(new Book("5 an club","Robin Sharma","Selfhelp",2,300));
//		bookService.addBook(new Book("HTML for dummies","Ben John","Fiction",4,700));
//		bookService.addBook(new Book("Seven Habits","John Hopper","Selfhelp",5,800));

		List<Book> book = bookService.getAll();
//		book.forEach(System.out::println);
//		System.out.println();
		book=bookService.getByAuthorContains("John");
		book.forEach(System.out::println);
		book=bookService.getByCategory("Selfhelp");
		book.forEach(System.out::println);
		book=bookService.getByAuthorContainsAndCategory("Jhn", "selfhelp");
		book.forEach(System.out::println);
//		System.out.println(bookService.getById(2));
	}
}
