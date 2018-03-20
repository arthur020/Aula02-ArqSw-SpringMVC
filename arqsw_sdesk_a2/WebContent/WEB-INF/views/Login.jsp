<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sistema de Chamados - Login</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Barra superior com os menus de navegação -->
	<!-- Container Principal -->
	<div id="main" class="container">
		<br>
		<h3 class="page-header">Fazer Login</h3>
		<form action="verifica_usuario" method="post">
			<div class="row">
				<div class="form-group col-md-4">
					<label for="usuario">Usuário:</label> 
					<input type="text" name="username" ">
				</div>
				<div class="form-group col-md-4">
					<label for="usuario">Senha:</label> 
					<input type="password"	name="password">
				</div>
			</div>
			<div id="actions" class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary">Entrar</button>
				</div>
			</div>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>