<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.mechanicbuddy.model.ServiceRequest"%>
<%@ page import="java.time.format.DateTimeFormatter"%>

<!DOCTYPE html>

<html>

<head>
<title>My Bookings</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
	background-color: #f4f6f9;
}

.status-pending { color: orange; font-weight: bold; }
.status-accepted { color: #007bff; font-weight: bold; }
.status-completed { color: green; font-weight: bold; }
.status-rejected { color: red; font-weight: bold; }

.table td, .table th {
	text-align: center;
	vertical-align: middle;
}

.card {
	border-radius: 12px;
}
</style>

</head>

<body>

<div class="container mt-5">

```
<h3 class="text-center mb-4 text-primary font-weight-bold">
	📋 My Service Bookings
</h3>

<%
List<ServiceRequest> list =
    (List<ServiceRequest>) request.getAttribute("requests");
%>

<div class="card shadow">
	<div class="card-body">

	<% if (list != null && !list.isEmpty()) { %>

		<table class="table table-bordered table-hover bg-white">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Mechanic ID</th>
					<th>Service ID</th>
					<th>Description</th>
					<th>Location</th>
					<th>Date</th>
					<th>Status</th>
					<th>Rating</th>
				</tr>
			</thead>

			<tbody>
			<%
			DateTimeFormatter dtf =
			    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

			for (ServiceRequest r : list) {
			    String date = (r.getRequestDate() != null)
			        ? dtf.format(r.getRequestDate())
			        : "N/A";
			%>

			<tr>
				<td><%= r.getRequestId() %></td>
				<td><%= r.getMechanicId() %></td>
				<td><%= r.getServiceId() %></td>
				<td><%= r.getProblemDescription() %></td>
				<td><%= r.getServiceLocation() %></td>
				<td><%= date %></td>

				<!-- STATUS -->
				<td>
					<span class="<%= 
						"Pending".equals(r.getStatus()) ? "status-pending" :
						"Accepted".equals(r.getStatus()) ? "status-accepted" :
						"Completed".equals(r.getStatus()) ? "status-completed" :
						"status-rejected" %>">
						<%= r.getStatus() %>
					</span>
				</td>

				<!-- RATING -->
				<td>
				<% if ("Completed".equals(r.getStatus())) { %>

					<form action="serviceRequest" method="post">
						<input type="hidden" name="action" value="rate">
						<input type="hidden" name="requestId"
							value="<%= r.getRequestId() %>">

						<select name="rating" class="form-control mb-1" required>
							<option value="">Rate</option>
							<option value="1">⭐ 1</option>
							<option value="2">⭐⭐ 2</option>
							<option value="3">⭐⭐⭐ 3</option>
							<option value="4">⭐⭐⭐⭐ 4</option>
							<option value="5">⭐⭐⭐⭐⭐ 5</option>
						</select>

						<button class="btn btn-sm btn-success btn-block">
							Submit
						</button>
					</form>

				<% } else { %>

					<span class="text-muted">Not Available</span>

				<% } %>
				</td>

			</tr>

			<% } %>
			</tbody>
		</table>

	<% } else { %>

		<div class="alert alert-warning text-center">
			⚠️ No bookings found.
		</div>

	<% } %>

	</div>
</div>
```

</div>

</body>
</html>
