<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Squirrel Cigar Party</h1>
		<c:url var="squirrelImgSrc" value="/img/smoking-squirrel.png" />
		<img src="${squirrelImgSrc}" />
		
		<c:url var="formAction" value="/cigarPartyResult" />
		<form method="GET" action="${formAction}">
			<div>
				<label>Number of Squirrels:</label>
				<input type="text" name="numberOfSquirrels" />
			</div>
			<div>
				<input type="checkbox" name="weekend" value="true" />
				<label>Is this the weekend?</label>
			</div>
			<div>
				<input type="submit" value="Submit" />
			</div>			
		</form>
	</body>
</html>