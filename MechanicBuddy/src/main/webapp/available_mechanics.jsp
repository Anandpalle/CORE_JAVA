<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*,com.mechanicbuddy.model.Mechanic"%>

<!DOCTYPE html>
<html>
<head>

<title>Available Mechanics | Mechanic Buddy</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
	background: #f8f9fa;
}

.footer {
	background: #343a40;
	color: white;
	padding: 20px;
	text-align: center;
	margin-top: 50px;
}

.badge-available {
	background: #28a745;
}

.badge-unavailable {
	background: #dc3545;
}
</style>

</head>

<body>

	<!-- NAVBAR -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">

		<a class="navbar-brand font-weight-bold" href="index.jsp"> 🚗
			Mechanic Buddy </a>

		<div class="ml-auto">
			<a href="user_dashboard.jsp" class="btn btn-light mr-2">Dashboard</a>
			<a href="user_login.jsp" class="btn btn-warning">Logout</a>
		</div>

	</nav>


	<!-- MECHANICS TABLE -->

	<div class="container mt-5">

		<h3 class="text-center mb-4">Available Mechanics</h3>

		<div class="table-responsive">

			<table class="table table-bordered table-hover shadow bg-white">

				<thead class="bg-dark text-white">

					<tr>
						<th>Name</th>
						<th>Phone</th>
						<th>Specialization</th>
						<th>Experience</th>
						<th>City</th>
						<th>Rating ⭐</th>
						<th>Status</th>
						<th>Book</th>
					</tr>

				</thead>

				<tbody>

					<%
					List<Mechanic> mechanics = (List<Mechanic>) request.getAttribute("mechanicList");

					if (mechanics != null && !mechanics.isEmpty()) {

						for (Mechanic m : mechanics) {
					%>

					<tr>

						<td><%=m.getName()%></td>

						<td><a href="tel:<%=m.getPhone()%>"> <%=m.getPhone()%>
						</a></td>

						<td><%=m.getSpecialization()%></td>

						<td><%=m.getExperienceYears()%> Years</td>

						<td><%=m.getCity()%></td>

						<td>
							<%
							if (m.getRating() != 0) {
							%> ⭐ <%=m.getRating()%>/5 <%
							} else {
							%> Not Rated <%
							}
							%>
						</td>

						<td>
							<%
							if (m.isAvailableStatus()) {
							%> <span class="badge badge-available"> Available </span> <%
 } else {
 %> <span class="badge badge-unavailable"> Unavailable </span> <%
 }
 %>

						</td>


						<td>
							<%
							if (m.isAvailableStatus()) {
							%> <a href="service?action=loadServices&mechanicId=<%=m.getMechanicId()%>"
   class="btn btn-success btn-sm">
   Book
</a> <%
 } else {
 %>

							<button class="btn btn-secondary btn-sm" disabled>Not
								Available</button> <%
 }
 %>

						</td>

					</tr>

					<%
					}
					} else {
					%>

					<tr>
						<td colspan="8" class="text-center text-danger">No mechanics
							available in this city</td>
					</tr>

					<%
					}
					%>

				</tbody>

			</table>

		</div>

	</div>


	<!-- FOOTER -->

	<div class="footer">

		<p>© 2026 Mechanic Buddy | All Rights Reserved</p>
		<p>Your Trusted Roadside Assistance Partner</p>

	</div>

</body>
</html>