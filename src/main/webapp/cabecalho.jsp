
<body>
      
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link href="../assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <script src="../assets/js/bootstrap.js" type="text/javascript"></script>
    
    <style type="text/css">
        body {background-color: #f5fff5 !important}
    </style>
    
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="background-color: #004000 !important">
    <a href="/index.jsp" style="display:inline; margin-right: 10px"> 
        <img src="../assets/ufabc_icon.png" 
             alt="logo_ufabc" height="40" width="40"/>
    </a>
  <a class="navbar-brand" href="/index.jsp">Matrículas UFABC</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" style="color: lightgray !important">
    <span class="navbar-toggler-icon" style="color: lightgray !important"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Controle de Alunos
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: #f5fff5 !important">
          <a class="dropdown-item" href="/aluno/busca.jsp">Busca</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/aluno/insere.jsp">Inserir</a>
          <a class="dropdown-item" href="/aluno/altera.jsp">Alterar</a>
          <a class="dropdown-item" href="/aluno/remove.jsp">Remover</a>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Controle de Disciplinas
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: #f5fff5 !important">
          <a class="dropdown-item" href="/disciplina/busca.jsp">Busca</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/disciplina/insere.jsp">Inserir</a>
          <a class="dropdown-item" href="/disciplina/altera.jsp">Alterar</a>
          <a class="dropdown-item" href="/disciplina/remove.jsp">Remover</a>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Controle de Matriculas
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: #f5fff5 !important">
          <a class="dropdown-item" href="/matricula/busca.jsp">Busca</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/matricula/insere.jsp">Inserir</a>
          <a class="dropdown-item" href="/matricula/altera.jsp">Alterar</a>
          <a class="dropdown-item" href="/matricula/remove.jsp">Remover</a>
        </div>
      </li>
    </ul>
  </div>
    
</nav>
</body>