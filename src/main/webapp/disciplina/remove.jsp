<title>Remocao de Disciplina</title>
<body>
	<jsp:include page="../cabecalho.jsp" />
	<h1>Remover Disciplina</h1>
	<form action="remove" method="post">
		ID: <input type="number" name="id" /><br>
		<input type="submit" value="Remover" />
	</form>
	<jsp:include page="../rodape.jsp" />
</body>
