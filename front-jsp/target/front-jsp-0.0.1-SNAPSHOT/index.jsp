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
	<h1>Formulário de Cadastro Web</h1>
	
	<form id="form"></form>
		<label for="name">Nome:</label>
		<input type="text" id="name">
		
		<label for="email">E-MAIL:</label>
		<input type="email" id="email">
		
		<label for="cargo">Cargo:</label>
		<input type="cargo" id="cargo">
		
		<label for="password">Senha:</label>
		<input type="password" id="password">
		
		<label for="job">Situação de Trabalho:</label>
		<select name="job" id="job"></select>
			<option value="">Atribuir Servidor ao Projeto?</option>
			<option value="yes">Sim</option>
			<option value="no">Não</option>
		<select>
		
		<label for="message">Mensagem:</label>
		<textarea name="message" id="message"></textarea>
		
		<button type="submit">Enviar</button>
		</form>
		
</body>

</html>




