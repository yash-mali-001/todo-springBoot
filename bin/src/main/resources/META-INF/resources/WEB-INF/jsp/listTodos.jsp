<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List Todos Page</title>
</head>
<body>
     <div>Welcome to ToDo App</div>
     <div>Your ToDos are ${todos}</div>
     <c:forEach items="${todos}" var="todo"></c:forEach>
</body>
</html>