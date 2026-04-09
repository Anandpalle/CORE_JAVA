<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="serviceRequest" method="post">
		<input type="hidden" name="action" value="updateStatus"> <input
			type="hidden" name="requestId" value="<%=r.getRequestId()%>">

		<button name="status" value="Accepted" class="btn btn-success btn-sm">Accept</button>

		<button name="status" value="Completed" class="btn btn-primary btn-sm">Complete</button>
	</form>

</body>
</html>