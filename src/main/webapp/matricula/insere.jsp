<title>Insercao de Matricula</title>

<body>
	<jsp:include page="../cabecalho.jsp" />
	<h1>Inserir Matricula</h1>
	<form action="insere" method="post">
		ID Aluno: <input type="number" name="alunoId" /><br>
		ID Disciplina: <input type="number" name="discId" /><br> <br>
		<input type="submit" value="Gravar" />
	</form>
	<jsp:include page="../rodape.jsp" />
</body>