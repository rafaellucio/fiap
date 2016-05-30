<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<h1>Entrar</h1>
	<form action="auth" method="post">
		<fieldset>
			<legend>Informe o usuário e senha</legend>
			<div>
				<label for="user">Usuário:</label>
				<input type="email" id="user" name="user">
			</div>
			<br>
			<div>
				<label for="pass">Usuário:</label>
				<input type="password" id="pass" name="pass">
			</div>
			<br>
			<button type="submit">Entrar</button>
		</fieldset>
	</form>
</body>
</html>