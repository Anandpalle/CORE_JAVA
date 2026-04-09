<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Mechanic Dashboard | Mechanic Buddy</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<style>
body {
    background: #f8f9fa;
    font-family: Arial, Helvetica, sans-serif;
}

.card-hover {
    transition: 0.3s;
    border-radius: 10px;
}

.card-hover:hover {
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
    margin-top: 50px;
}
</style>
</head>
<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <a class="navbar-brand font-weight-bold"
       href="<%=request.getContextPath()%>/index.jsp"> 🚗 Mechanic Buddy </a>

    <button class="navbar-toggler" type="button" data-toggle="collapse"
        data-target="#menu">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="menu">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
            <li class="nav-item"><a class="nav-link active" href="#">Dashboard</a></li>
            <li class="nav-item"><a class="nav-link" href="mechanic_login.jsp">Logout</a></li>
        </ul>
    </div>
</nav>

<!-- DASHBOARD -->
<div class="container mt-5">
    <h2 class="text-center mb-4">Mechanic Dashboard</h2>

    <div class="row">

        <!-- SERVICE REQUESTS -->
        <div class="col-md-4 mb-4">
            <div class="card card-hover shadow text-center p-4">
                <h4>📋 Service Requests</h4>
                <p>View and manage customer service requests.</p>
              <a href="serviceRequest?action=viewRequests" class="btn btn-main btn-block">View Requests</a>
            </div>
        </div>

        <!-- AVAILABILITY -->
        <div class="col-md-4 mb-4">
            <div class="card card-hover shadow text-center p-4">
                <h4>🟢 Availability</h4>
                <p>Set your service availability.</p>
                <a href="update_status.jsp" class="btn btn-main btn-block">Update Status</a>
            </div>
        </div>

        <!-- PROFILE -->
        <div class="col-md-4 mb-4">
            <div class="card card-hover shadow text-center p-4">
                <h4>👤 Profile</h4>
                <p>Update your mechanic profile.</p>
                <a href="mechanic_update_profile.jsp" class="btn btn-main btn-block">Update Profile</a>
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