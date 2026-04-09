<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<title>Mechanic Login | Mechanic Buddy</title>

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

.login-bg {
	background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)),
		url("<%=request.getContextPath()%>/images/mechanic2.jpg");
	background-size: cover;
	background-position: center;
	height: 350px;
	display: flex;
	align-items: center;
	justify-content: center;
	color: white;
	text-align: center;
}

.login-card {
	margin-top: -80px;
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


	<!-- HERO -->

	<div class="login-bg">

		<div>

			<h1>Mechanic Login</h1>

			<p>Login to manage your services</p>

		</div>

	</div>


	<!-- LOGIN FORM -->

	<div class="container">

		<div class="card shadow-lg mx-auto login-card"
			style="max-width: 500px;">

			<div class="card-body p-4">

				<h4 class="text-center mb-4">Mechanic Login</h4>

				<form action="mechanic" method="post">

					<input type="hidden" name="action" value="login">

					<div class="form-group">

						<label>Email</label> <input type="email" name="email"
							class="form-control" placeholder="Enter Email" required>

					</div>

					<div class="form-group">

						<label>Password</label> <input type="password" name="password"
							class="form-control" placeholder="Enter Password" required>

					</div>

					<button type="submit" class="btn btn-main btn-block">

						Login</button>

					<div class="text-center mt-3">

						<small> New mechanic? <a
							href="<%=request.getContextPath()%>/mechanic_register.jsp">

								Register Here </a>

						</small>

					</div>

				</form>

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