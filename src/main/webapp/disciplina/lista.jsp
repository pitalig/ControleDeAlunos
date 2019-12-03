<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<jsp:useBean id="Data" type="java.util.List<com.mycompany.controledealunos.modelo.Disciplina>" scope="session" />
<title>Lista de Disciplinas</title>

<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
        <h2>Disciplinas Encontradas:</h2>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Créditos</th>
                    <th scope="col">Vagas</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${Data}">
                    <tr>
                        <th scope="row">${item.getId()}</th>
                        <td>${item.getNome()}</td>
                        <td>${item.getCreditos()}</td>
                        <td>${item.getVagas()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>