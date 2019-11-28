<!DOCTYPE html>
<html>
<head>
<title>Busca de Disciplinas</title>
</head>
<body>
<jsp:include page="../cabecalho.jsp"/>
	<h1>Busca de Disciplinas</h1>
	<form action="busca" method="post">
		<input type="radio" name="opcaoBusca" value="todos" checked="checked">Todos
		<br> <input type="radio" name="opcaoBusca" value="nome">
		Nome da disciplina: <input type="text" name="nomeBusca" /> <br> <br>
		<input type="submit" value="Buscar" />
	</form>
	<jsp:include page="../rodape.jsp"/>
</body>
</html>