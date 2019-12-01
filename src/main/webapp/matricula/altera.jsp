<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Matricula</title>
</head>
<body>
	<jsp:include page="../cabecalho.jsp" />
	<h1>Alteracao de Matricula</h1>
	<form action="altera" method="post">
		ID: <input type="number" name="ID" /><br>
		ID Aluno: <input type="number" name="alunoId" /><br>
		ID Disciplina: <input type="number" name="discId" /><br> <br>
		<input type="submit" value="Alterar" />
	</form>
	<jsp:include page="../rodape.jsp" />
</body>
</html>