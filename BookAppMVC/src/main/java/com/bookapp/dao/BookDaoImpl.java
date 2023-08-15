package com.bookapp.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.util.Queries;
import com.bookapp.model.Book;

public class BookDaoImpl implements IBookDao{
	
	//title,author, category, bookId, price

	@Override
	public void addBook(Book book) {
		System.out.println(book);
		try (Connection connection= DBConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
				statement.setString(1,book.getTitle());
				statement.setString(2, book.getAuthor());
				statement.setString(3, book.getCategory());
				statement.setInt(4, book.getBookId());
				statement.setDouble(5, book.getPrice());
				statement.execute();
			
		}
		catch(SQLException e) {
			e.getMessage();
		}

	}
	
	

	@Override
	public void updateBook(int bookId, double price) {
		try (Connection connection= DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
			statement.setInt(1,bookId);
			statement.setDouble(2,price);
			statement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBook(int bookId) {
		try (Connection connection= DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);){
			statement.setInt(1, bookId);
			statement.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Book> findAll() {
		List<Book> listOfBooks=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERY);
				ResultSet rs=statement.executeQuery()){
			while(rs.next()){
				String title=rs.getString("title");
				String author=rs.getString("author");
				String category=rs.getString("category");
				int bookId=rs.getInt("bookid");
				double price=rs.getDouble("price");
				Book book=new Book(title,author,category,bookId,price);
				listOfBooks.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfBooks;
	}

	@Override
	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
		List<Book> listOfBooks=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYAUTHOR);
				ResultSet rs=statement.executeQuery()){
			statement.setString(1, author);
			statement.execute();
			while(rs.next()) {
				String title=rs.getString("title");
				String author1=rs.getString("author");
				String category=rs.getString("category");
				int bookId=rs.getInt("bookid");
				double price=rs.getDouble("price");
				Book book=new Book(title,author1,category,bookId,price);
				listOfBooks.add(book);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfBooks;
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		List<Book> listOfBooks=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYCATEGORY);
				ResultSet rs=statement.executeQuery()){
			statement.setString(1, category);
			statement.execute();
			while(rs.next()) {
				String title=rs.getString("title");
				String author=rs.getString("author");
				String category1=rs.getString("category");
				int bookId=rs.getInt("bookid");
				double price=rs.getDouble("price");
				Book book=new Book(title,author,category1,bookId,price);
				listOfBooks.add(book);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfBooks;
	}

	@Override
	public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> listOfBooks=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYPRICE);
				ResultSet rs=statement.executeQuery()){
			statement.setDouble(1, price);
			statement.execute();
			while(rs.next()) {
				String title=rs.getString("title");
				String author=rs.getString("author");
				String category=rs.getString("category");
				int bookId=rs.getInt("bookid");
				double price1=rs.getDouble("price");
				Book book=new Book(title,author,category,bookId,price1);
				listOfBooks.add(book);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfBooks;
	}

	@Override
	public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> listOfBooks=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYAUTHORANDCATEGORY);
				ResultSet rs=statement.executeQuery()){
			statement.setString(1, author);
			statement.setString(2, category);
			statement.execute();
			while(rs.next()) {
				String title=rs.getString("title");
				String author1=rs.getString("author");
				String category1=rs.getString("category");
				int bookId=rs.getInt("bookid");
				double price=rs.getDouble("price");
				Book book=new Book(title,author1,category1,bookId,price);
				listOfBooks.add(book);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfBooks;
	}

	@Override
	public Book findById(int bookId) throws BookNotFoundException {
		Book books=new Book();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYID);
				ResultSet rs=statement.executeQuery()){
			statement.setInt(1, bookId);
			statement.execute();
			while(rs.next()) {
				String title=rs.getString("title");
				String author=rs.getString("author");
				String category=rs.getString("category");
				int bookId1=rs.getInt("bookid");
				double price1=rs.getDouble("price");
				books=new Book(title,author,category,bookId1,price1);
					
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

}
