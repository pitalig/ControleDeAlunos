<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<jsp:useBean id="Data" type="java.util.List<com.mycompany.controledealunos.modelo.Aluno>" scope="session" />
<title>Lista de Alunos</title>

<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
        <h2>Alunos Encontrados:</h2>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Email</th>
                    <th scope="col">Endereço</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${Data}">
                    <tr>
                        <th scope="row">${item.getId()}</th>
                        <td>${item.getNome()}</td>
                        <td>${item.getEmail()}</td>
                        <td>${item.getEndereco()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>