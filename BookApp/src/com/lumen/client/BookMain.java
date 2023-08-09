package com.lumen.client;


import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class BookMain {
	public static void main(String[] args) {
		IBookService bookService=new BookServiceImpl();
		System.out.println(bookService.getAll());
		System.out.println(bookService.getByAuthorContains("John"));
		System.out.println(bookService.getByCategory("selfhelp"));
		System.out.println(bookService.getByAuthorContainsAndCategory("Jhn", "selfhelp"));
		System.out.println(bookService.getById(2));
				
	}
}
