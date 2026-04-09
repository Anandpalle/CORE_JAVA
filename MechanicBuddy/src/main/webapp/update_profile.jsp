<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.mechanicbuddy.model.User"%>

<!DOCTYPE html>
<html>

<head>

<title>Update Profile | Mechanic Buddy</title>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
	background: #f8f9fa;
}

.card {
	border-radius: 10px;
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

		<a class="navbar-brand font-weight-bold" href="index.jsp">🚗
			Mechanic Buddy</a>

		<div class="ml-auto">

			<a href="user_dashboard.jsp" class="btn btn-light mr-2">Dashboard</a>

			<a href="user_login.jsp" class="btn btn-warning">Logout</a>

		</div>

	</nav>


	<!-- PROFILE FORM -->

	<div class="container mt-5">

		<div class="card shadow mx-auto" style="max-width: 600px;">

			<div class="card-body">

				<h4 class="text-center mb-4">Update Profile</h4>

				<%
				User user = (User) session.getAttribute("user");
				%>

				<form action="user" method="post">

					<input type="hidden" name="action" value="updateProfile">

					<div class="form-group">

						<label>Name</label> <input type="text" name="name"
							class="form-control" value="<%=user.getName()%>" required>

					</div>


					<div class="form-group">

						<label>Email</label> <input type="email" name="email"
							class="form-control" value="<%=user.getEmail()%>" readonly>

					</div>


					<div class="form-group">

						<label>Phone</label> <input type="text" name="phone"
							class="form-control" value="<%=user.getPhone()%>" required>

					</div>


					<div class="form-group">

						<label>Address</label> <input type="text" name="address"
							class="form-control" value="<%=user.getAddress()%>">

					</div>


					<div class="form-group">

						<label>City</label> <input type="text" name="city"
							class="form-control" value="<%=user.getCity()%>">

					</div>


					<div class="form-group">

						<label>State</label> <input type="text" name="state"
							class="form-control" value="<%=user.getState()%>">

					</div>


					<div class="form-group">

						<label>Pincode</label> <input type="text" name="pincode"
							class="form-control" value="<%=user.getPincode()%>">

					</div>



					<button class="btn btn-main btn-block">Update Profile</button>
					<%
					String msg = request.getParameter("msg");

					if ("success".equals(msg)) {
					%>

					<div class="alert alert-success text-center">Profile Updated
						Successfully!</div>

					<%
					} else if ("failed".equals(msg)) {
					%>

					<div class="alert alert-danger text-center">Profile Update
						Failed!</div>

					<%
					}
					%>

				</form>

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