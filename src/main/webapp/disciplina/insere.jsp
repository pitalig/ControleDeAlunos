<title>Insercao de Disciplina</title>
<body>
<jsp:include page="../cabecalho.jsp"/>
	<h1>Inserir Disciplina</h1>
	<form action="insere" method="post">
		Nome: <input type="text" name="nome" /><br>
		Creditos: <input type="number" name="creditos" /><br>
		Vagas: <input type="number" name="vagas" /><br> <br>
		<input type="submit" value="Gravar" />
	</form>
	<jsp:include page="../rodape.jsp"/>
</body>
