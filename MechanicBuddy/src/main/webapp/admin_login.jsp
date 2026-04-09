<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>

<html>
<head>

<title>Admin Login | Mechanic Buddy</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
	background: linear-gradient(135deg, #2c3e50, #4ca1af);
	height: 100vh;
	display: flex;
	flex-direction: column;
}

/* Center Login Card */
.login-container {
	flex: 1;
	display: flex;
	justify-content: center;
	align-items: center;
}

/* Card Styling */
.login-card {
	width: 100%;
	max-width: 420px;
	border-radius: 12px;
}

/* Header */
.card-header {
	font-size: 22px;
	font-weight: bold;
}

/* Footer */
.footer {
	background: #343a40;
	color: white;
	text-align: center;
	padding: 10px;
}
</style>

</head>

<body>

	<!-- NAVBAR -->

	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="index.jsp">🚗 Mechanic Buddy</a>
	</nav>

	<!-- LOGIN CARD -->

	<div class="login-container">

		<div class="card shadow-lg login-card">

			<div class="card-header bg-dark text-white text-center">Admin
				Login</div>

			<div class="card-body">

				<%
				if (request.getParameter("error") != null) {
				%>

				<div class="alert alert-danger text-center">Invalid Email or
					Password</div>

				<%
				}
				%>

				<form action="admin" method="post">

					<input type="hidden" name="action" value="login">

					<div class="form-group">
						<label>Email Address</label> <input type="email" name="email"
							class="form-control" placeholder="Enter admin email" required>
					</div>

					<div class="form-group">
						<label>Password</label> <input type="password" name="password"
							class="form-control" placeholder="Enter password" required>
					</div>

					<button type="submit" class="btn btn-dark btn-block">
						Login</button>

				</form>

			</div>

		</div>

	</div>

	<!-- FOOTER -->

	<div class="footer">© 2026 Mechanic Buddy | Admin Panel</div>

</body>
</html>
