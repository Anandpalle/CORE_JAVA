<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*,com.mechanicbuddy.model.Mechanic"%>

<!DOCTYPE html>
<html>

<head>

<title>Registered Mechanics | Mechanic Buddy</title>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<style>
body {
	background: #f8f9fa;
	font-family: Arial, Helvetica, sans-serif;
}

.btn-main {
	background: #ffc107;
	border: none;
	font-weight: bold;
}

.btn-main:hover {
	background: #e0a800;
}

.footer {
	background: #343a40;
	color: white;
	padding: 20px;
	text-align: center;
	margin-top: 40px;
}
</style>

</head>

<body>

	<!-- NAVBAR -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">

		<a class="navbar-brand font-weight-bold"
			href="<%=request.getContextPath()%>/index.jsp"> 🚗 Mechanic Buddy

		</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#menu">

			<span class="navbar-toggler-icon"></span>

		</button>

		<div class="collapse navbar-collapse" id="menu">

			<ul class="navbar-nav ml-auto">

				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/admin_dashboard.jsp">

						Dashboard </a></li>

				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/admin_login.jsp"> Logout </a></li>

			</ul>

		</div>

	</nav>


	<!-- PAGE CONTENT -->

	<div class="container mt-5">

		<h3 class="text-center mb-4">Registered Mechanics</h3>

		<a href="<%=request.getContextPath()%>/admin_dashboard.jsp"
			class="btn btn-main mb-3"> Back to Dashboard </a>

		<div class="table-responsive">

			<table class="table table-bordered table-striped shadow">

				<thead class="bg-dark text-white">

					<tr>

						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Specialization</th>
						<th>Experience</th>
						<th>City</th>

					</tr>

				</thead>

				<tbody>

					<%
					List<Mechanic> mechanics = (List<Mechanic>) request.getAttribute("mechanicList");

					if (mechanics != null && !mechanics.isEmpty()) {

						for (Mechanic m : mechanics) {
					%>

					<tr>

						<td><%=m.getMechanicId()%></td>
						<td><%=m.getName()%></td>
						<td><%=m.getEmail()%></td>
						<td><%=m.getPhone()%></td>
						<td><%=m.getSpecialization()%></td>
						<td><%=m.getExperienceYears()%> Years</td>
						<td><%=m.getCity()%></td>

					</tr>

					<%
					}

					} else {
					%>

					<tr>

						<td colspan="7" class="text-center text-danger">No Mechanics
							Found</td>

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

		<p>Your Trusted Roadside Partner</p>

	</div>

</body>
</html>