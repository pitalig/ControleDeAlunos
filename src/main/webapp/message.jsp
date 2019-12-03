<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<jsp:useBean id="Data" type="String" scope="session" />
<title>Projeto Controle de Alunos</title>
<link rel="stylesheet" href="assets/index.css" />
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />

<body>
    <jsp:include page="cabecalho.jsp" />
    <div align="center" style="margin-top:10%">
        <img src="/assets/Ufabc_logo.png" alt="Logo_UFABC" width="400px" height="400px" />
        <h1>${Data}</h1>
    </div>
    <jsp:include page="rodape.jsp" />
</body>