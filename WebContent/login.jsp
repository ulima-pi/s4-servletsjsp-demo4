<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Login Vetguide</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" >
</head>
<body class="container">
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<h1>Login Vetguide</h1>
			<form action="login" method="post">
				<div class="form-group">
					<label for="username">Usuario</label> 
					<input
						type="text" class="form-control" id="username" name="username"
						placeholder="Usuario"/>
				</div>
				<div class="form-group">
					<label for="password">Password</label> 
					<input
						type="password" class="form-control" id="password" name="password"
						placeholder="Password"/>
				</div>
				<button type="submit" class="btn btn-success">Enviar</button>
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>
</body>
</html>