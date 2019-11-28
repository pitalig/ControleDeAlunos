<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Disciplina</title>
</head>
<body>
	<jsp:include page="../cabecalho.jsp" />
	<h1>Alteracao de Disciplina</h1>
	<form action="altera" method="post">
		ID: <input type="number" name="ID" /><br>
		Nome: <input type="text" name="nome" /><br>
		Creditos: <input type="number" name="creditos" /><br>
		Vagas: <input type="number" name="vagas" /><br> <br>
		<input type="submit" value="Alterar" />
	</form>
	<jsp:include page="../rodape.jsp" />
</body>
</html>