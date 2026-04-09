<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.mechanicbuddy.model.Mechanic"%>

<%
Mechanic mechanic = (Mechanic) session.getAttribute("mechanic");
%>

<!DOCTYPE html>
<html>
<head>

<title>Update Profile | Mechanic Buddy</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
	background: #f8f9fa;
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

		<div class="card shadow mx-auto" style="max-width: 600px">

			<div class="card-body">

				<h4 class="text-center mb-4">Update Mechanic Profile</h4>

				<%
				String msg = request.getParameter("msg");

				if ("success".equals(msg)) {
				%>

				<div class="alert alert-success text-center">Profile Updated
					Successfully!</div>

				<%
				}
				%>

				<form action="mechanic" method="post">

					<input type="hidden" name="action" value="updateProfile"> <input
						type="hidden" name="mechanicId"
						value="<%=mechanic.getMechanicId()%>">


					<div class="form-group">

						<label>Name</label> <input type="text" name="name"
							class="form-control" value="<%=mechanic.getName()%>" required>

					</div>


					<div class="form-group">

						<label>Email</label> <input type="email" name="email"
							class="form-control" value="<%=mechanic.getEmail()%>" readonly>

					</div>


					<div class="form-group">

						<label>Phone</label> <input type="text" name="phone"
							class="form-control" value="<%=mechanic.getPhone()%>">

					</div>


					<div class="form-group">

						<label>Specialization</label> <input type="text"
							name="specialization" class="form-control"
							value="<%=mechanic.getSpecialization()%>">

					</div>


					<div class="form-group">

						<label>City</label> <input type="text" name="city"
							class="form-control" value="<%=mechanic.getCity()%>">

					</div>


					<button class="btn btn-main btn-block">Update Profile</button>

				</form>

			</div>

		</div>

	</div>

</body>
</html>