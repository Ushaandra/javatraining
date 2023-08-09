package com.bookapp.util;

public class Queries {
	public static final String CREATEQUERY=
			"create table book(title varchar(20),author varchar(20),category varchar(20),"
			+ "bookId integer primary key,price double)";
	
	public static final String UPDATEQUERY=
			"update book set price=? where bookId=?";
	public static final String DELETEQUERY=
			"delete from book where bookId=?";
	
	public static final String INSERTQUERY=
			"insert into book(title,author,category,bookId,price) values(?,?,?,?,?)";
	
	public static final String QUERY=
			"select * from book";
	
	public static final String QUERYBYID=
			"select * from book where bookId=?";
	
	public static final String QUERYBYCATEGORY=
			"select * from book where category like ?";
	
	public static final String QUERYBYPRICE=
			"select * from book where price<?";
	
	public static final String QUERYBYAUTHOR=
			"select * from book where author like ?";
	
	public static final String QUERYBYAUTHORANDCATEGORY=
			"select * from book where author like %?% and category like ?";

}
