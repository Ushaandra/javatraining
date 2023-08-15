<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bookapp.model.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg=(String)request.getAttribute("message"); %>
<h2>Expression Language</h2>
${message}

Title: ${book.title}<br>
Author:${book.author}<br>
Category: ${book.category}<br>
BookId: ${book.bookId}<br>
Price: ${book.price}

${message}

<%--
<%Book book=(Book)request.getAttribute("book");%>
Title: <%= book.getTitle()%><br>
Author: <%=book.getAuthor() %><br>
Category: <%=book.getCategory() %><br>
BookId: <%=book.getBookId() %><br>
Price: <%=book.getPrice() %>
 --%>








</body>
</html>