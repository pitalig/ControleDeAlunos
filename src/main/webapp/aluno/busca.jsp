<!DOCTYPE html>
<html>
<head>
<title>Busca</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
    function disableNameField() {
        if(document.getElementById('todos').checked) {
             document.getElementById('nomeBusca').disabled = true;

         }else if(document.getElementById('especifico').checked) {
             document.getElementById('nomeBusca').disabled = false;
         }
    }
    $(function () {
        $("#nomeBusca").autocomplete({
            source: "/aluno/AutoNome",
            minLength: 1
        });
    });
</script>
</head>
<body>
<jsp:include page="../cabecalho.jsp"/>
    <div style="margin: 20px">
	<h2>Busca de Alunos</h2>
	<form action="busca" method="post">
            <div class="form-check" style="margin: 10px">
                <input type="radio" name="opcaoBusca" id="todos" value="todos" 
                       checked="checked" class="form-check-input" onclick="disableNameField()">
                <label class="form-check-label" for="opcaoBusca">
                    Todos
                </label>
            </div>
            <div class="form-check" style="margin: 10px">
		<input type="radio" name="opcaoBusca" id="especifico" value="nome" 
                       class="form-check-input" onclick="disableNameField()">
                <label class="form-check-label" for="opcaoBusca">
                    Nome do aluno:
                </label>
                <input type="text" class="form-control" id="nomeBusca" name="nomeBusca" 
                       disabled style="width: 50%; margin: 10px" placeholder="Nome"/>
            </div>
            <input type="submit" value="Buscar" class="btn btn-outline-success" 
                   style="margin-top: 10px" />
	</form>
    </div>
    <jsp:include page="../rodape.jsp"/>
</body>
</html>