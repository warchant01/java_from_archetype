<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
    <c:param name="pageTitle" value="The Solar System Geek Forum" />
</c:import>

<ul>
	<c:url var="forumPost1Href" value="/forum/forumDetail.jsp">
		<c:param name="forumId">1</c:param>
	</c:url>
	<li><a href="${forumPost1Href}">Should Pluto be a planet???</li>
	<li><a href="forumDetail.jsp">Are Vulcans real?</li>
	<li><a href="forumDetail.jsp">The Moon Landing was a hoax!!!</li>
	
</ul>

<c:import url="/WEB-INF/jsp/footer.jsp" />