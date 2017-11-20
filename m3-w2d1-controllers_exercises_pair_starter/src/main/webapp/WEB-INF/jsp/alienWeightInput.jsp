<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<h2>Alien Weight Calculator</h2>
<c:url var="formAction" value="/alienWeightResult" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="yourWeight">Your Weight:</label> 
		<input type="text" name="yourWeight" id="yourWeight" />
	</div>
	<div class="formInputGroup">
		<label for="planet">Planet:</label> 
		<select name="planet"	id="planet">
			<option value="0">Mercury</option>
			<option value="1">Venus</option>
			<option value="2">Earth</option>
			<option value="3">Mars</option>
			<option value="4">Jupiter</option>
			<option value="5">Saturn</option>
			<option value="6">Uranus</option>
			<option value="7">Neptune</option>
		</select>
	</div>
	<input class="formSubmitButton" type="submit" value="Get Weight" />
</form>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />