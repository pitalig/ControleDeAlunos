
<body>
    <!--
    <div style="margin: 15px; margin-top: 20px">
        <h1 style="display:inline; margin-left: 10px" >Projeto Controle de Alunos</h1>
        <a href="/ControleDeAlunos/" style="display:inline; position: absolute; right: 30px; top:10px"> 
            <img src="/ControleDeAlunos/assets/ufabc_icon.png" 
                 alt="logo_ufabc" height="50" width="50"/>
        </a>
        <hr>
    </div>
    -->
    <script src="/ControleDeAlunos/assets/jquery-3.4.1.js" type="text/javascript"></script>
    <link href="/ControleDeAlunos/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <script src="/ControleDeAlunos/assets/js/bootstrap.js" type="text/javascript"></script>
    
    <style type="text/css">
        body {background-color: #f5fff5 !important}
    </style>
    
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="background-color: #004000 !important">
    <a href="/ControleDeAlunos/" style="display:inline; margin-right: 10px"> 
        <img src="/ControleDeAlunos/assets/ufabc_icon.png" 
             alt="logo_ufabc" height="40" width="40"/>
    </a>
  <a class="navbar-brand" href="/ControleDeAlunos/">Matrículas UFABC</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" style="color: lightgray !important">
    <span class="navbar-toggler-icon" style="color: lightgray !important"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/ControleDeAlunos/">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Controle de Alunos
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: #f5fff5 !important">
          <a class="dropdown-item" href="/ControleDeAlunos/aluno/busca.jsp">Busca</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/ControleDeAlunos/aluno/insere.jsp">Inserir</a>
          <a class="dropdown-item" href="/ControleDeAlunos/aluno/altera.jsp">Alterar</a>
          <a class="dropdown-item" href="/ControleDeAlunos/aluno/remove.jsp">Remover</a>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Controle de Disciplinas
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: #f5fff5 !important">
          <a class="dropdown-item" href="/ControleDeAlunos/disciplina/busca.jsp">Busca</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/ControleDeAlunos/disciplina/insere.jsp">Inserir</a>
          <a class="dropdown-item" href="/ControleDeAlunos/disciplina/altera.jsp">Alterar</a>
          <a class="dropdown-item" href="/ControleDeAlunos/disciplina/remove.jsp">Remover</a>
        </div>
      </li>
      <!--
      <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
      </li>
      -->
    </ul>
  </div>
    
</nav>
</body>