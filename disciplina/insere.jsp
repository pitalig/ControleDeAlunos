<title>Insercao de Disciplina</title>
<body>
<jsp:include page="../cabecalho.jsp"/>
    <div style="margin: 20px">
	<h2>Inserir Disciplina</h2>
	<form action="insere" method="post">
		<div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" class="form-control" placeholder="Nome"/>
                </div>
		<div class="form-group">
                    <label for="creditos">Créditos</label>
                    <input type="number" name="creditos" class="form-control" placeholder="Créditos"/>
                </div>
		<div class="form-group">
                    <label for="vagas">Vagas</label>
                    <input type="number" name="vagas" class="form-control" placeholder="Vagas"/> 
                </div>
		<input type="submit" value="Gravar" class="btn btn-outline-success" style="margin-top: 10px"/>
	</form>
    </div>
    <jsp:include page="../rodape.jsp"/>
</body>
