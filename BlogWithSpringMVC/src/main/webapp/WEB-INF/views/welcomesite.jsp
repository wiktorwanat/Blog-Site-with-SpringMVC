
<!DOCTYPE html>
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
      <a class="nav-link" href="/posts/{userId}">My Posts</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/login/accountsettings">Account Settings</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/logout">Logout</a>
    </li>
  </ul>
</nav>
 	<div class="container">
		<a type="button" class="btn btn-success" href="/posts/addpost">Add post</a>
	</div>	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>