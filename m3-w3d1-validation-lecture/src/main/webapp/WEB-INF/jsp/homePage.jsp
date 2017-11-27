<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Server Side Validation Examples</h1>
		<ul>
			<c:url var="squirrelPartyHref" value="/squirrelParty/cigarPartyInput" />
			<li><a href="${squirrelPartyHref}">Squirrel Cigar Party</a></li>
			<%--<c:url var="" value="" /> --%>
			<li><a href="">Sign Up</a></li>
		</ul>
		
	</body>
</html>