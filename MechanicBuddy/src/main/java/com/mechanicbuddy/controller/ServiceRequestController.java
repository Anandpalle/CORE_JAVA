package com.mechanicbuddy.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import com.mechanicbuddy.dao.ServiceRequestDAO;
import com.mechanicbuddy.dao.ServiceRequestDAOImpl;
import com.mechanicbuddy.model.Mechanic;
import com.mechanicbuddy.model.ServiceRequest;
import com.mechanicbuddy.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/serviceRequest")
public class ServiceRequestController extends HttpServlet {

    private ServiceRequestDAO dao = new ServiceRequestDAOImpl();

    // ===================== POST METHODS =====================
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        // ================= CREATE REQUEST =================
        if ("create".equals(action)) {
            try {

                HttpSession session = request.getSession();
                User user = (User) session.getAttribute("user");

                // 🔥 FIX: Always get user from session
                if (user == null) {
                    response.sendRedirect("user_login.jsp");
                    return;
                }

                ServiceRequest sr = new ServiceRequest();

                sr.setUserId(user.getUserId()); // ✅ FIXED
                sr.setMechanicId(Integer.parseInt(request.getParameter("mechanicId")));
                sr.setServiceId(Integer.parseInt(request.getParameter("serviceId")));
                sr.setProblemDescription(request.getParameter("problemDescription"));
                sr.setServiceLocation(request.getParameter("serviceLocation"));
                sr.setRequestDate(LocalDateTime.now());
                sr.setStatus("Pending");

                boolean status = dao.createRequest(sr);

                if (status) {
                    System.out.println("✅ Request Created for user: " + user.getUserId());
                    response.sendRedirect("serviceRequest?action=viewBookings");
                } else {
                    response.sendRedirect("user_dashboard.jsp?msg=failed");
                }

            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("user_dashboard.jsp?msg=error");
            }
        }

        // ================= UPDATE STATUS =================
        else if ("updateStatus".equals(action)) {
            try {
                int requestId = Integer.parseInt(request.getParameter("requestId"));
                String status = request.getParameter("status");

                dao.updateStatus(requestId, status);

                response.sendRedirect("serviceRequest?action=viewRequests");

            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("mechanic_dashboard.jsp?msg=error");
            }
        }

        // ================= RATE SERVICE =================
        else if ("rate".equals(action)) {
            try {
                int requestId = Integer.parseInt(request.getParameter("requestId"));
                int rating = Integer.parseInt(request.getParameter("rating"));

                dao.addRating(requestId, rating);

                response.sendRedirect("serviceRequest?action=viewBookings");

            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("view_bookings.jsp?msg=error");
            }
        }
    }

    // ===================== GET METHODS =====================
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        // ================= USER BOOKINGS =================
        if ("viewBookings".equals(action)) {

            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");

            if (user == null) {
                response.sendRedirect("user_login.jsp");
                return;
            }

            List<ServiceRequest> list = dao.getRequestsByUser(user.getUserId());

            System.out.println("Bookings for user " + user.getUserId() + ": " + list.size());

            request.setAttribute("requests", list);

            request.getRequestDispatcher("view_bookings.jsp").forward(request, response);
        }

        // ================= MECHANIC REQUESTS =================
        else if ("viewRequests".equals(action)) {

            HttpSession session = request.getSession();
            Mechanic mechanic = (Mechanic) session.getAttribute("mechanic");

            if (mechanic == null) {
                response.sendRedirect("mechanic_login.jsp");
                return;
            }

            List<ServiceRequest> list =
                    dao.getRequestsByMechanic(mechanic.getMechanicId());

            request.setAttribute("requests", list);

            request.getRequestDispatcher("service_requests.jsp").forward(request, response);
        }

        // ================= DEFAULT =================
        else {
            response.sendRedirect("index.jsp");
        }
    }
}