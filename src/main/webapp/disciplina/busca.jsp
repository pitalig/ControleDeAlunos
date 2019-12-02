<!DOCTYPE html>
<html>
    <head>
        <title>Busca de Disciplinas</title>
        
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#disciplinaBusca").autocomplete({
                    source: "/disciplina/AutoDisciplina",
                    minLength: 1
                });
            });
        </script>
    </head>
    <body>
        <jsp:include page="../cabecalho.jsp"/>
        <h1>Busca de Disciplinas</h1>
        <form action="/disciplina/busca" method="post">
            <input type="radio" name="opcaoBusca" value="todos" checked="checked">Todos
            <br> <input type="radio" name="opcaoBusca" value="nome">
            Nome da disciplina: <input type="text" name="disciplinaBusca" id="disciplinaBusca"/>
            <br> <br> <input type="submit" value="Buscar" />
        </form>
        <jsp:include page="../rodape.jsp"/>
    </body>
</html>