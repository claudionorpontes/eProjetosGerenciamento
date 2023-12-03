<html lang="pt-br">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
	<h1>Core Tecnologia</h1>
  <h2>Cadastro de Funcionalidade - WEB/Service</h2>
  <form action="/action_page.php">
    <div class="mb-3 mt-3">
      <label for="Nome">Nome:</label>
      <input type="Nome" class="form-control" id="Nome" placeholder="Enter nome" name="nome">
    </div>
     <div class="mb-3 mt-3">
      <label for="Atribuição">Atribuição:</label>
      <input type="Atribuição" class="form-control" id="Atribuição" placeholder="Enter Atribuição" name="Atribuição">
    </div>
     <div class="mb-3 mt-3">
      <label for="Função">Função:</label>
      <input type="Função" class="form-control" id="Função" placeholder="Enter Função" name="Função">
    </div>
    <div class="mb-3">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    <div class="form-check mb-3">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="marque aqui"> marque aqui
      </label>
    </div>
    <button type="enviar" class="btn btn-primary">Enviar</button>
  </form>
</div>

</body>
</html>
