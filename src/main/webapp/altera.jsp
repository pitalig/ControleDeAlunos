<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar</title>
</head>
<body>
	<jsp:include page="cabecalho.jsp" />
	<h1>Altera��o de Alunos</h1>
	<form action="altera" method="post">
		ID: <input type="number" name="ID" /><br> Nome: <input
			type="text" name="nome" /><br> Email: <input type="text"
			name="email" /><br> Endere�o: <input type="text"
			name="endereco" /><br> <br> <input type="submit"
			value="Alterar" />
	</form>
	<jsp:include page="rodape.jsp" />
</body>
</html>