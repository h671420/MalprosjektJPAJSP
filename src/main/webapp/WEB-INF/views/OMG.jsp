<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Test Page</title>
</head>
<body>
<h1>This is a Test Page</h1>
<p>Putter strenger i en databas!</p>

<form action="${pageContext.request.contextPath}/test" method="post">
    <label for="NavnPåForm">Skriv noe:</label>
    <input type="text" id = "NavnPåForm" name="NavnRequestParam">
    <input type="submit" value="Lagre streng i databasen">
</form>
<p>Her er alle strengen i databasen:</p>
<c:forEach var="testString" items = "${testStrings}">
    <p>${testString.string}</p>
</c:forEach>
</body>
</html>
