

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <title>Blog Site</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed top">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link">Blog Site</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/posts">Posts</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/login">Login Page</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/createaccount">Create new Account</a>
    </li>
  	</ul>
		</nav>
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
					<td><fmt:formatDate pattern="yyyy-MM-dd"
							value=${post.postDate} /></td>
					<td>${Post.authorId}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>

