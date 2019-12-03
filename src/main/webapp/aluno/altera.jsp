<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar</title>
</head>
<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
	<h2>Alteração de Alunos</h2>
            <form action="altera" method="post">
                <div class="form-group">
                    <label for="ID">ID</label>
                    <input type="number" name="ID" class="form-control" placeholder="ID"/>
                </div>
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
                <input type="submit" value="Alterar" class="btn btn-outline-success" style="margin-top: 10px"/>
            </form>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>
</html>