package com.mechanicbuddy.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.mechanicbuddy.dao.AdminDAO;
import com.mechanicbuddy.dao.AdminDAOImpl;
import com.mechanicbuddy.dao.UserDAO;
import com.mechanicbuddy.dao.UserDAOImpl;
import com.mechanicbuddy.dao.MechanicDAO;
import com.mechanicbuddy.dao.MechanicDAOImpl;

import com.mechanicbuddy.model.User;
import com.mechanicbuddy.model.Mechanic;

@WebServlet("/admin")
public class AdminController extends HttpServlet {

	private AdminDAO adminDAO = new AdminDAOImpl();
	private UserDAO userDAO = new UserDAOImpl();
	private MechanicDAO mechanicDAO = new MechanicDAOImpl();

	// =========================
	// HANDLE ADMIN LOGIN
	// =========================

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String action = request.getParameter("action");

		if ("login".equals(action)) {

			String email = request.getParameter("email");
			String password = request.getParameter("password");

			boolean status = adminDAO.loginAdmin(email, password);

			if (status) {

				HttpSession session = request.getSession();
				session.setAttribute("admin", email);

				response.sendRedirect("admin_dashboard.jsp");

			} else {

				response.sendRedirect("admin_login.jsp?error=invalid");
			}
		}
	}

	// =========================
	// HANDLE VIEW USERS & MECHANICS
	// =========================

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if ("viewUsers".equals(action)) {

			List<User> users = userDAO.getAllUsers();

			request.setAttribute("userList", users);

			request.getRequestDispatcher("view_users.jsp").forward(request, response);
		}

		else if ("viewMechanics".equals(action)) {

			List<Mechanic> mechanics = mechanicDAO.getAllMechanics();

			request.setAttribute("mechanicList", mechanics);

			request.getRequestDispatcher("view_mechanics.jsp").forward(request, response);
		}

		else {

			response.sendRedirect("admin_dashboard.jsp");
		}
	}
}