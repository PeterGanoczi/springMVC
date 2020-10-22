<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE>
<html>
<head>
    <title>Student confirmation</title>
</head>

<body>

<p> The student is confirmed: ${student.firstName} ${student.lastName}</p>

<br>

<p>Country: ${student.country}</p>

<br>

<p> Favorite language: ${student.favoriteLanguage}</p>

<br>

<p> Operating systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}" >
            <li>${temp}</li>
        </c:forEach>

    </ul>
</p>

</body>

</html>