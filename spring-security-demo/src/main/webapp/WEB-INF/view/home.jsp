<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title>kulkarni Company Home Page</title>
</head>

<body>
	<h2>kulkarni Company Home Page</h2>
	<hr>
	
	<p>
		kulkarni to the luv2code company home page!
	</p>



	<hr>
		<p>
			User: <security:authentication property="principal.username"/>
			<br><br>
			Role(s) : <security:authentication property="principal.authorities"/>
		</p>
	<hr>
	
	<hr> 
		<!--  Add a link to point to leaders...  this is for managers-->
		<security:authorize access="hasRole('MANAGER')">
				<a href="${pageContext.request.contextPath}/leaders ">Leadership Meeting</a>
				(Only For Manager peeps)
		</security:authorize>
	<hr>
	
	<hr> 
		<!--  Add a link to point to leaders...  this is for managers-->
		<security:authorize access="hasRole('ADMIN')">
				<a href="${pageContext.request.contextPath}/systems ">Admin</a>
				(Direct To the admin pages)
		</security:authorize>
	<hr>
	
	
	<form:form action="${pageContext.request.contextPath}/logout"
			   method="POST">
			   <input type="submit" value="Logout" />
   </form:form>
</body>

</html>