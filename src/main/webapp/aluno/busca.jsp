<!DOCTYPE html>
<html>
    <head>
        <title>Busca</title>

        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#nomeBusca").autocomplete({
                    source: "/aluno/AutoNome",
                    minLength: 1
                });
            });
        </script>
    </head>
    <body>
        <jsp:include page="../cabecalho.jsp" />
        <h1>Busca de Alunos</h1>
        <form action="/aluno/busca" method="post">
            <input type="radio" name="opcaoBusca" value="todos" checked="checked">Todos
            <br> <input type="radio" name="opcaoBusca" value="nome">
            Nome do aluno: <input type="text" name="nomeBusca" id="nomeBusca" />
            <br> <br> <input type="submit" value="Buscar" />
        </form>
        <jsp:include page="../rodape.jsp" />
    </body>
</html>