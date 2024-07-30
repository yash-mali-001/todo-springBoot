<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h2>Your ToDo List is</h2>
    <table class="table">

        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done?</th>
            <th></th>
            <th></th>
        </tr>

        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">DELETE</a></td>
                <td><a href="update-todo?id=${todo.id}" class="btn btn-info">UPDATE</a></td>
            </tr>
        </c:forEach>
    </table>

    <a href="add-todo" class="btn btn-success">ADD TODO</a>

</div>
<%@ include file="common/footerr.jspf" %>
