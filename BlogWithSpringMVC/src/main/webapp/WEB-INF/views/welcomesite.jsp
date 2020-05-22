
<!DOCTYPE html>
<html>
<head>
<title>Blog Site</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
</head>
<body>
<div class="container">
	hi ${login}
</div>
<br />
 <a href="/posts/${login}">Click here</a> to see all of your posts.
 <br />
 	<div class="container">
		<a type="button" class="btn btn-success" href="/posts/addpost">Add post</a>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>