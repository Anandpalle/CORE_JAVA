<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.mechanicbuddy.model.Service"%>
<%@ page import="com.mechanicbuddy.model.User"%>

<!DOCTYPE html>

<html>
<head>
<title>Book Service</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
	background-color: #f4f6f9;
}

.card {
	border-radius: 12px;
}

select, textarea, input {
	border-radius: 8px !important;
}

.btn-warning {
	font-weight: bold;
}
</style>

</head>

<body>

<div class="container mt-5">

```
<div class="card shadow mx-auto" style="max-width: 600px;">
	<div class="card-body">

		<h4 class="text-center mb-4 text-primary">🔧 Request Service</h4>

		<form action="serviceRequest" method="post">

			<input type="hidden" name="action" value="create">

			<!-- ✅ Mechanic ID -->
			<input type="hidden" name="mechanicId"
				value="<%= request.getParameter("mechanicId") %>">

			<!-- ✅ USER SESSION -->
			<%
			User user = (User) session.getAttribute("user");
			if (user == null) {
			    response.sendRedirect("user_login.jsp");
			    return;
			}
			%>

			<input type="hidden" name="userId"
				value="<%= user.getUserId() %>">

			<!-- 🔥 SERVICES DROPDOWN -->
			<div class="form-group">
				<label><b>Select Service</b></label>

				<select name="serviceId" class="form-control" required>
					<option value="">-- Select Service --</option>

					<%
					List<Service> services =
					    (List<Service>) request.getAttribute("services");

					if (services != null && !services.isEmpty()) {
					    for (Service s : services) {
					%>

						<option value="<%= s.getServiceId() %>">
							<%= s.getServiceName() %> (₹<%= s.getPrice() %>)
						</option>

					<%
					    }
					} else {
					%>

						<option value="">No services available</option>

					<%
					}
					%>
				</select>
			</div>

			<!-- DESCRIPTION -->
			<div class="form-group">
				<label><b>Problem Description</b></label>
				<textarea name="problemDescription"
					class="form-control"
					rows="3"
					placeholder="Describe your issue..."
					required></textarea>
			</div>

			<!-- LOCATION -->
			<div class="form-group">
				<label><b>Service Location</b></label>
				<input type="text"
					name="serviceLocation"
					class="form-control"
					placeholder="Enter your address"
					required>
			</div>

			<button class="btn btn-warning btn-block">
				🚀 Submit Request
			</button>

		</form>

		<!-- 🔍 DEBUG (REMOVE AFTER TESTING) -->
		<%
		if (services == null) {
		    out.println("<p style='color:red;text-align:center;'>❌ Services NOT loaded</p>");
		} else if (services.isEmpty()) {
		    out.println("<p style='color:orange;text-align:center;'>⚠️ No services for this mechanic</p>");
		} else {
		    out.println("<p style='color:green;text-align:center;'>✅ Services Loaded: " + services.size() + "</p>");
		}
		%>

	</div>
</div>
```

</div>

</body>
</html>
