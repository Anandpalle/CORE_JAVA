<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>

<html>
<head>

<title>Mechanic Buddy</title>

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

.hero {
	background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)),
		url("<%=request.getContextPath()%>/images/mechanic1.jpg");
	background-size: cover;
	background-position: center;
	height: 450px;
	display: flex;
	align-items: center;
	justify-content: center;
	color: white;
	text-align: center;
}

.service-card {
	transition: 0.3s;
	border-radius: 8px;
}

.service-card:hover {
	transform: scale(1.05);
	box-shadow: 0 6px 20px rgba(0, 0, 0, 0.2);
}

.footer {
	background: #343a40;
	color: white;
	padding: 20px;
	text-align: center;
	margin-top: 40px;
}

.carousel img {
	border-radius: 5px;
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
			data-target="#menu" aria-controls="menu" aria-expanded="false"
			aria-label="Toggle navigation">

			<span class="navbar-toggler-icon"></span>

		</button>

		<div class="collapse navbar-collapse" id="menu">

			<ul class="navbar-nav ml-auto">

				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/index.jsp">Home</a></li>

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

	<!-- HERO SECTION -->

	<div class="hero">

		<div>

			<h1 class="display-4 font-weight-bold">Mechanic Buddy</h1>

			<p class="lead">Your Trusted Roadside Assistance Partner</p>

			<a href="<%=request.getContextPath()%>/user_login.jsp"
				class="btn btn-warning btn-lg mt-3"> Get Help Now </a>

		</div>

	</div>

	<!-- SERVICES -->

	<div class="container mt-5">

		<h2 class="text-center mb-4">Our Services</h2>

		<div class="row">

			<div class="col-md-4 mb-3">

				<div class="card service-card text-center p-3">

					<h4>🚗 Car Repair</h4>

					<p>Quick roadside car repair by verified mechanics.</p>

				</div>

			</div>

			<div class="col-md-4 mb-3">

				<div class="card service-card text-center p-3">

					<h4>🛵 Bike Repair</h4>

					<p>Emergency bike repair anytime anywhere.</p>

				</div>

			</div>

			<div class="col-md-4 mb-3">

				<div class="card service-card text-center p-3">

					<h4>🔧 Mechanic Booking</h4>

					<p>Book nearby mechanics instantly from your phone.</p>

				</div>

			</div>

		</div>

	</div>

	<!-- CAROUSEL -->

	<div class="container mt-5">

		<h2 class="text-center mb-4">Our Work</h2>

		<div id="slider" class="carousel slide shadow" data-ride="carousel">

			<ul class="carousel-indicators">

				<li data-target="#slider" data-slide-to="0" class="active"></li>

				<li data-target="#slider" data-slide-to="1"></li>

				<li data-target="#slider" data-slide-to="2"></li>

			</ul>

			<div class="carousel-inner">

				<div class="carousel-item active">

					<img src="<%=request.getContextPath()%>/images/mechanic1.jpg"
						class="d-block w-100" alt="Mechanic repairing car"
						style="height: 400px; object-fit: cover;">

				</div>

				<div class="carousel-item">

					<img src="<%=request.getContextPath()%>/images/mechanic2.jpg"
						class="d-block w-100" alt="Bike repair"
						style="height: 400px; object-fit: cover;">

				</div>

				<div class="carousel-item">

					<img src="<%=request.getContextPath()%>/images/mechanic3.jpg"
						class="d-block w-100" alt="Mechanic workshop"
						style="height: 400px; object-fit: cover;">

				</div>

			</div>

			<a class="carousel-control-prev" href="#slider" data-slide="prev">

				<span class="carousel-control-prev-icon"></span>

			</a> <a class="carousel-control-next" href="#slider" data-slide="next">

				<span class="carousel-control-next-icon"></span>

			</a>

		</div>

	</div>

	<!-- FOOTER -->

	<div class="footer">

		<p>© 2026 Mechanic Buddy | All Rights Reserved</p>

		<p>Your Trusted Roadside Partner</p>

	</div>

</body>
</html>
