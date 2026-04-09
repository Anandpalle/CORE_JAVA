<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>User Dashboard | Mechanic Buddy</title>

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

.dashboard-title {
	font-weight: bold;
	margin-bottom: 30px;
}

.service-card {
	transition: 0.3s;
	border-radius: 10px;
}

.service-card:hover {
	transform: scale(1.05);
	box-shadow: 0 6px 20px rgba(0, 0, 0, 0.2);
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
	margin-top: 60px;
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
					href="<%=request.getContextPath()%>/index.jsp">Home</a></li>

				<li class="nav-item"><a class="nav-link active"
					href="<%=request.getContextPath()%>/user_dashboard.jsp">Dashboard</a>
				</li>

				<li class="nav-item"><a class="nav-link" href="user_login.jsp">Logout</a>
				</li>

			</ul>

		</div>

	</nav>


	<!-- DASHBOARD -->

	<div class="container mt-5">

		<h2 class="text-center dashboard-title">User Dashboard</h2>

		<div class="row">

			<!-- SEARCH MECHANIC -->

			<div class="col-md-4 mb-4">

				<div class="card service-card shadow p-4 text-center">

					<h4 class="mb-3">🔍 Search Mechanic</h4>

					<p>Find nearby mechanics instantly.</p>

					<form action="mechanic" method="get">

						<input type="hidden" name="action" value="searchByCity">

						<input type="text" name="city" class="form-control mb-3"
							placeholder="Enter Your City" required>

						<button class="btn btn-main btn-block">Search</button>

					</form>

				</div>

			</div>


			<!-- MY BOOKINGS -->

			<div class="col-md-4 mb-4">

				<div class="card service-card shadow p-4 text-center">

					<h4 class="mb-3">📋 My Bookings</h4>

					<p>View all your service bookings.</p>

					<a href="view_bookings.jsp"
						class="btn btn-main btn-block"> View Bookings </a>

				</div>

			</div>


			<!-- PROFILE -->

			<div class="col-md-4 mb-4">

				<div class="card service-card shadow p-4 text-center">

					<h4 class="mb-3">👤 Profile</h4>

					<p>Manage your account information.</p>

					<a href="update_profile.jsp" class="btn btn-main btn-block">
						Update Profile </a>

				</div>

			</div>

		</div>

	</div>


	<!-- FOOTER -->

	<div class="footer">

		<p>© 2026 Mechanic Buddy | All Rights Reserved</p>
		<p>Your Trusted Roadside Assistance Partner</p>

	</div>

</body>
</html>
