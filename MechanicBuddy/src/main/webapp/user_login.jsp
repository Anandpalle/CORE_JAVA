<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<title>User Login</title>

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
					href="<%=request.getContextPath()%>/index.jsp"> Home </a></li>

				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/admin_login.jsp"> Admin </a></li>

				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/user_login.jsp"> User </a></li>

				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/mechanic_login.jsp">
						Mechanic </a></li>

				<li class="nav-item"><a class="nav-link" href="#">Services</a>
				</li>

				<li class="nav-item"><a class="nav-link" href="#">About</a></li>

				<li class="nav-item"><a class="nav-link" href="#">Contact</a></li>

			</ul>

		</div>

	</nav>


	<!-- LOGIN FORM -->

	<div class="container mt-5">

		<div class="row justify-content-center">

			<div class="col-md-4">

				<div class="card shadow p-4">

					<h3 class="text-center mb-3">User Login</h3>

					<form action="user" method="post">

						<input type="hidden" name="action" value="login">

						<div class="form-group">

							<label>Email</label> <input type="email" name="email"
								class="form-control" placeholder="Enter Email" required>

						</div>

						<div class="form-group">

							<label>Password</label> <input type="password" name="password"
								class="form-control" placeholder="Enter Password" required>

						</div>

						<button class="btn btn-main btn-block">Login</button>

					</form>

					<p class="text-center mt-3">

						New User? <a
							href="<%=request.getContextPath()%>/user_register.jsp">

							Register Here </a>

					</p>

				</div>

			</div>

		</div>

	</div>


	<!-- FOOTER -->

	<div class="footer">

		<p>© 2026 Mechanic Buddy | All Rights Reserved</p>

		<p>Your Trusted Roadside Partner</p>

	</div>

</body>
</html>