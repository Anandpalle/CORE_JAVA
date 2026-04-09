<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List,com.mechanicbuddy.model.ServiceRequest"%>
<%@ page import="java.time.format.DateTimeFormatter"%>

<!DOCTYPE html>

<html>
<head>
<title>Service Requests | Mechanic Buddy</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>
body {
    background-color: #f4f6f9;
}

/* Status Colors */
.status-pending { color: orange; font-weight: bold; }
.status-accepted { color: #007bff; font-weight: bold; }
.status-completed { color: green; font-weight: bold; }
.status-rejected { color: red; font-weight: bold; }

/* Table Styling */
.table td, .table th {
    vertical-align: middle;
    text-align: center;
}

/* Card Styling */
.card {
    border-radius: 12px;
}

/* Action Buttons */
.action-buttons form {
    display: flex;
    justify-content: center;
    gap: 6px;
}

.btn-sm {
    min-width: 85px;
    border-radius: 20px;
}

/* Hover Effect */
.table-hover tbody tr:hover {
    background-color: #f1f1f1;
}
</style>

</head>

<body>

<div class="container mt-5">

```
<h3 class="text-center mb-4 font-weight-bold text-primary">
    🔧 Customer Service Requests
</h3>

<%
    List<ServiceRequest> list = (List<ServiceRequest>) request.getAttribute("requests");
%>

<div class="card shadow">
    <div class="card-body">

    <% if (list != null && !list.isEmpty()) { %>

    <table class="table table-bordered table-hover bg-white">
        <thead class="thead-dark">
            <tr>
                <th>ID</th>
                <th>User ID</th>
                <th>Mechanic ID</th>
                <th>Service ID</th>
                <th>Description</th>
                <th>Location</th>
                <th>Date</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
        </thead>

        <tbody>
        <%
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

            for (ServiceRequest r : list) {
                String formattedDate = (r.getRequestDate() != null)
                    ? dtf.format(r.getRequestDate())
                    : "N/A";
        %>

            <tr>
                <td><%= r.getRequestId() %></td>
                <td><%= r.getUserId() %></td>
                <td><%= r.getMechanicId() %></td>
                <td><%= r.getServiceId() %></td>
                <td><%= r.getProblemDescription() %></td>
                <td><%= r.getServiceLocation() %></td>
                <td><%= formattedDate %></td>

                <!-- STATUS -->
                <td>
                    <span class="<%= 
                        "Pending".equals(r.getStatus()) ? "status-pending" :
                        "Accepted".equals(r.getStatus()) ? "status-accepted" :
                        "Completed".equals(r.getStatus()) ? "status-completed" :
                        "status-rejected" %>">
                        <%= r.getStatus() %>
                    </span>
                </td>

                <!-- ACTION BUTTONS -->
                <td class="action-buttons">
                    <form action="serviceRequest" method="post">

                        <input type="hidden" name="action" value="updateStatus">
                        <input type="hidden" name="requestId" value="<%= r.getRequestId() %>">

                        <% if ("Pending".equals(r.getStatus())) { %>

                            <button type="submit" name="status" value="Accepted"
                                class="btn btn-outline-success btn-sm">
                                ✔ Accept
                            </button>

                            <button type="submit" name="status" value="Rejected"
                                class="btn btn-outline-danger btn-sm">
                                ✖ Reject
                            </button>

                        <% } else if ("Accepted".equals(r.getStatus())) { %>

                            <button type="submit" name="status" value="Completed"
                                class="btn btn-outline-primary btn-sm">
                                ✓ Complete
                            </button>

                        <% } else { %>

                            <span class="text-muted">No Action</span>

                        <% } %>

                    </form>
                </td>
            </tr>

        <% } %>
        </tbody>
    </table>

    <% } else { %>

        <div class="alert alert-warning text-center">
            No service requests available.
        </div>

    <% } %>

    </div>
</div>
```

</div>

</body>
</html>
