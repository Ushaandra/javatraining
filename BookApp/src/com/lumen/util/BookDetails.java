package com.lumen.util;

import java.util.Arrays;
import java.util.List;

import com.lumen.model.Book;

public class BookDetails {
	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book("Java in Action","John David","Tech",1,900),
				new Book("5 an club","Robin Sharma","Selfhelp",2,300),
				new Book("HTML for dummies","Ben John","Fiction",4,700),
				new Book("Seven Habits","John Hopper","Selfhelp",5,800)			
				);
	}
}
