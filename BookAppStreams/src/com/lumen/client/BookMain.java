package com.lumen.client;

import java.util.ArrayList;
import java.util.List;

import com.lumen.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class BookMain {
	public static void main(String[] args) {
		IBookService bookService=new BookServiceImpl();
		List<Book> books=new ArrayList<>();
		books=bookService.getAll();
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getByAuthorContains("John");
		books.forEach(System.out::println);
		System.out.println();
		
		books=bookService.getByCategory("Selfhelp");
		books.forEach(System.out::println);
		System.out.println();
		
		books=(bookService.getByAuthorContainsAndCategory("John", "Selfhelp"));
		books.forEach(System.out::println);
		System.out.println();
		
		books=(bookService.getById(2));
		books.forEach(System.out::println);
	}
}
