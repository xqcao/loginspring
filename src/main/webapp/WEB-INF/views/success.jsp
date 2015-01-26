<%@ page session="false"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>Spring Sample - Successful Login</title>
</head>
<body>
	<center>
		<h1>
			Welcome
			<core:out value="${name}" />
		</h1>
		<br> <a href="login.jsp">Back</a>
	</center>
</body>
</html>

