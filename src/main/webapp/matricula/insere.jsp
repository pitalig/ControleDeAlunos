<title>Insercao de Matriculas</title>

<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
        <h2>Inserir Matriculas</h2>
        <form action="insere" method="post">
            <div class="form-group">
                <label for="alunoId">ID Aluno:</label>
                <input type="number" name="alunoId" class="form-control" placeholder="alunoId" />
            </div>
            <div class="form-group">
                <label for="discID">ID Disciplina</label>
                <input type="number" name="discId" class="form-control" placeholder="discID" />
            </div>
            <input type="submit" value="Gravar" class="btn btn-outline-success" style="margin-top: 10px" />
        </form>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>