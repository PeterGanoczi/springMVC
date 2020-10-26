<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE>
<html>
<head>
    <title>Customer confirmation</title>

</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br>

Free passes: ${customer.freePasses}

<br>

Postal Code: ${customer.postalCode}

</body>

</html>