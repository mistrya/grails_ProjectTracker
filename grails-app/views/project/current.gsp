<html>
<head>
<title>Current Projects</title>
</head>
<body>
	<!-- to insert a groovy variable directly from controller user ${variableName} -->
	<!-- 	<form>
		Project: <input type="text" size=40 name="project" value="${project}" />
		<p>
			Due Date: <input type="text" name="date" value=${date} />
		</p>
	</form>
	 -->
<!-- ${allProjects.name}, ${allProjects.description}, ${allProjects.dueDate} -->
<table border="1">
	<g:each in="${allProjects}" status="i" var="thisProject">
	<tr>
		<td>${thisProject.name }</td>
		<td>${thisProject.description }</td>
		<td>${thisProject.dueDate }</td>
	</tr>
	</g:each>
</table> 
</body>
</html>