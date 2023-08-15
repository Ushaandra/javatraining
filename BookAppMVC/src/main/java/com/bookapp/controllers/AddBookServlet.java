package com.bookapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.DBConnection;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IBookService bookService=new BookServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String category=request.getParameter("category");
		int bookId=Integer.parseInt(request.getParameter("bookId")) ;
		double price=Double.parseDouble(request.getParameter("price"));
		
		Book book=new Book();
		book.setAuthor(author);
		book.setBookId(bookId);
		book.setCategory(category);
		book.setPrice(price);
		book.setTitle(title);
		
		bookService.addBook(book);
		
		request.setAttribute("emessage", "book added successfully");
		request.setAttribute("message", "Have a great day!!");
		RequestDispatcher dispatcher=request.getRequestDispatcher("admin.jsp");
		dispatcher.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
