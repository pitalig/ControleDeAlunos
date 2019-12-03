<!DOCTYPE html>
<html>

<head>
    <title>Busca</title>
</head>

<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
        <h2>Busca de Matriculas</h2>
        <form action="busca" method="post">
            <input type="submit" value="Buscar" class="btn btn-outline-success" style="margin-top: 10px" />
        </form>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>

</html>