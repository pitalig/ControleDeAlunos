<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<jsp:useBean id="Data" type="java.util.List<com.mycompany.controledealunos.modelo.Matricula>" scope="session" />
<title>Lista de Matrículas</title>

<body>
    <jsp:include page="../cabecalho.jsp" />
    <div style="margin: 20px">
        <h2>Matrículas Encontradas:</h2>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Aluno</th>
                    <th scope="col">Disciplina</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${Data}">
                    <tr>
                        <th scope="row">${item.getId()}</th>
                        <td>${item.getAluno().getNome()}</td>
                        <td>${item.getDisc().getNome()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <jsp:include page="../rodape.jsp" />
</body>