<title>Insercao de Alunos</title>
<body>
<jsp:include page="../cabecalho.jsp"/>
    <div style="margin: 20px">
	<h2>Inserir Aluno</h2>
	<form action="insere" method="post">
		<div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" class="form-control" placeholder="Nome"/>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" name="email" class="form-control" placeholder="Email"/>
                </div>
                <div class="form-group">
                    <label for="endereco">Endereço</label>
                    <input type="text" name="endereco" class="form-control" placeholder="Endereço"/> 
                </div>
                <input type="submit" value="Gravar" class="btn btn-outline-success" style="margin-top: 10px"/>
            </form>
    </div>
	<jsp:include page="../rodape.jsp"/>
</body>
