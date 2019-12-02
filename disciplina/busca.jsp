<!DOCTYPE html>
<html>
<head>
<title>Busca de Disciplinas</title>
<script type="text/javascript">
    function disableNameField() {
        if(document.getElementById('todos').checked) {
             document.getElementById('nomeBusca').disabled = true;

         }else if(document.getElementById('especifico').checked) {
             document.getElementById('nomeBusca').disabled = false;
         }
    }
</script>
</head>
<body>
<jsp:include page="../cabecalho.jsp"/>
    <div style="margin: 20px">
	<h2>Busca de Disciplinas</h2>
	<form action="busca" method="post">
            <div class="form-check" style="margin: 10px">
                <input type="radio" name="opcaoBusca" id="todos" value="todos" 
                       checked="checked" class="form-check-input" onclick="disableNameField()">
                <label class="form-check-label" for="opcaoBusca">
                    Todas
                </label>
            </div>
            <div class="form-check" style="margin: 10px">
		<input type="radio" name="opcaoBusca" id="especifico" value="nome" 
                       class="form-check-input" onclick="disableNameField()">
                <label class="form-check-label" for="opcaoBusca">
                    Nome da disciplina:
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