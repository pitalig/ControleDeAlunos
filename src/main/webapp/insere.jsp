<title>Inser��o de Alunos</title>
<body>
<jsp:include page="cabecalho.jsp"/>
	<h1>Inserir Aluno</h1>
	<form action="insere" method="post">
		Nome: <input type="text" name="nome" /><br> Email: <input
			type="text" name="email" /><br> Endere�o: <input type="text"
			name="endereco" /><br> <br> <input type="submit"
			value="Gravar" />
	</form>
	<jsp:include page="rodape.jsp"/>
</body>
