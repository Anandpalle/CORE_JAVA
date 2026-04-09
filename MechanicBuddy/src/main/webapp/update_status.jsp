<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Update Availability | Mechanic Buddy</title>

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
</style>

</head>

<body>

	<div class="container mt-5">

		<div class="card shadow mx-auto" style="max-width: 500px">

			<div class="card-body">

				<h4 class="text-center mb-4">Update Availability</h4>


				<%
				String msg = request.getParameter("msg");

				if ("success".equals(msg)) {
				%>

				<div class="alert alert-success text-center">Updated
					Successfully</div>

				<%
				}
				%>


				<form action="mechanic" method="post">

					<input type="hidden" name="action" value="updateAvailability">

					<div class="form-group">

						<label>Select Status</label> <select name="availability"
							class="form-control">

							<option value="Available">Available</option>
							<option value="Busy">Busy</option>
							<option value="Offline">Offline</option>

						</select>

					</div>


					<button class="btn btn-main btn-block">Update Status</button>

				</form>

			</div>

		</div>

	</div>

</body>
</html>