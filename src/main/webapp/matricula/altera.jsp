<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Alterar</title>
</head>

<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
        <h2>Alteração de Matriculas</h2>
        <form action="altera" method="post">
            <div class="form-group">
                <label for="id">ID</label>
                <input type="number" name="ID" class="form-control" placeholder="id" />
            </div>
            <div class="form-group">
                <label for="alunoId">ID Aluno:</label>
                <input type="number" name="alunoId" class="form-control" placeholder="alunoId" />
            </div>
            <div class="form-group">
                <label for="discID">ID Disciplina</label>
                <input type="number" name="discId" class="form-control" placeholder="discId" />
            </div>
            <input type="submit" value="Alterar" class="btn btn-outline-success" style="margin-top: 10px" />
        </form>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>

</html>