<title>Remocao de Disciplina</title>
<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
	<h1>Remover Disciplina</h1>
	<form action="remove" method="post">
		<div class="form-group">
                    <label for="ID">ID</label>
                    <input type="number" name="ID" class="form-control" placeholder="ID"/>
                </div>
		<input type="submit" value="Remover" 
                   class="btn btn-outline-success" style="margin-top: 10px"/>
	</form>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>
