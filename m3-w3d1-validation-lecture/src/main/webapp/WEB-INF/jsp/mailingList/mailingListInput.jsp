<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Mailing List Signup</title>
	</head>
	<body>
		<h1>Mailing List Signup</h1>
		    
		<c:url value="/mailingList/mailingListInput" var="mailingListSignUpUrl" />
		<form action="${mailingListSignUpUrl}" method="POST">
	        <div>
	        		<label for="name">Name</label>
	        		<input type="text" name="name"/>
	        </div>
	        <div>
	            <label for="email">Email</label>
				<input type="text" name="email" />            
	        </div>
	        <div>
	            <label for="verifyEmail">Verify Email</label>
	            <input type="text" name="verifyEmail" />
	        </div>
	        <div>
	            <label for="phone">Phone Number (XXX)XXX-XXXX</label>
	            <input type="text" name="phone" />
	        </div>
	        <div>
	            <label for="occupation">Occupation</label>
	           <input type="text" name="occupation" />
	        </div>
	        <div>
	            <label for="age">Age</label>
	            <input type="text" name="age" />
	        </div>
	        <div>
	            <input type="submit" value="Sign Me Up!"/>
	        </div>
		</form>
	</body>
</html>