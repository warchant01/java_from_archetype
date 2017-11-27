<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Cigar Party Result</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${party.success}">
				<c:set var="headingText" value="Great Party!!!" />
				<c:url var="imgSrc" value="/img/happy-squirrel.png" />			
			</c:when>
			<c:otherwise>
				<c:set var="headingText" value="Ugh!!!" />
				<c:url var="imgSrc" value="/img/sad-squirrel.png" />
			</c:otherwise>
		</c:choose>
		<h1>${headingText}</h1>
		<img src="${imgSrc}" />
	</body>
</html>