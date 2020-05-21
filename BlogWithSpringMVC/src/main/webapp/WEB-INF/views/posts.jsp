
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Blog Site-posts</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
 <div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>id</th>
				<th>Title</th>
				<th>Text</th>
				<th>Date</th>
				<th>Written by</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${posts}" var="Post">
				<tr>
					<td>${Post.postId}</td>
					<td>${Post.title}</td>
					<td>${Post.text}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy"
							value=${post.postDate} /></td>
					<td>${Post.authorId}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div>
		<a type="button" class="btn btn-success" href="/login">Login</a>
	</div>
</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>

