<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Cadastro de Novos Membros</title>
		<link rel="stylesheet" href="css/modelo.css" />
		<script src="js/javascript.js" defer></script>
	</head>
	<body>
	<h1>Empresa Core de Tecnologia</h1>
	<h2>Formulário de Cadastro Web</h2>
	
	<form id="form"></form>
		<label for="name">Nome  :</label>
		<input type="text" id="name">
		<br>
		<br>
		
		<label for="email">E-mail:</label>
		<input type="email" id="email">
		<br>
		<br>
		
		<label for="cargo">Cargo :</label>
		<input type="cargo" id="cargo">
		<br>
		<br>
		
		<label for="password">Senha :</label>
		<input type="password" id="password">
		<br>
		<br>

		
		<label for="job">Situação de Trabalho:</label>
		<br>
		
		<select name="job" id="job"></select>
			<option value="">Atribuir Servidor ao Projeto?</option>
			<br>
			<option value="yes">Sim</option>
			<option value="no">Não</option>
			<br>
		<select>
		<label for="message">Mensagem:</label>
		<br>
		<textarea name="message" id="message"></textarea>
		<br>
		<br>
		<br>
		
		<button type="submit">Enviar</button>
		<br>
		<br>
		<br>
		</form>
		
</body>
</html>




