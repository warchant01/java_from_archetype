<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
		<script src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
		<script>
		var myVar = ${myEl};
		
		$(document).ready(function () {

		    $("#getHelloBtn").on("click", function (e) {
		    
		        $.ajax({
		            url: "api/getHello",
		            type: "GET",
		            data: {
		                name: "Jim"
		            }
		        }).done(function (data) {
		            $("#message").text(data);
		        }).fail(function(xhr, status, error) {
		        	    alert("failed: " + error);
		        });
		    });
		});
				
		</script>
	</head>
	<body>
		<h1><span id="message"></span></h1>
		<input type="button" id="getHelloBtn" value="Update Hello" />
	</body>
</html>