package com.mechanicbuddy.controller;

import java.io.IOException;
import java.util.List;

import com.mechanicbuddy.dao.MechanicDAO;
import com.mechanicbuddy.dao.MechanicDAOImpl;
import com.mechanicbuddy.model.Mechanic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/mechanic")
public class MechanicController extends HttpServlet {

	private MechanicDAO dao = new MechanicDAOImpl();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action == null) {
			response.sendRedirect("mechanic_login.jsp");
			return;
		}

		// =========================
		// REGISTER MECHANIC
		// =========================
		if ("register".equals(action)) {

			Mechanic m = new Mechanic();

			m.setName(request.getParameter("name"));
			m.setEmail(request.getParameter("email"));
			m.setPhone(request.getParameter("phone"));
			m.setSpecialization(request.getParameter("specialization"));
			m.setCity(request.getParameter("city"));
			m.setPassword(request.getParameter("password"));

			boolean status = dao.registerMechanic(m);

			if (status) {
				response.sendRedirect("mechanic_login.jsp?msg=success");
			} else {
				response.sendRedirect("mechanic_register.jsp?msg=error");
			}
		}

		// =========================
		// LOGIN MECHANIC
		// =========================
		else if ("login".equals(action)) {

			String email = request.getParameter("email");
			String password = request.getParameter("password");

			Mechanic m = dao.loginMechanic(email, password);

			if (m != null) {

				HttpSession session = request.getSession();
				session.setAttribute("mechanic", m);

				response.sendRedirect("mechanic_dashboard.jsp");

			} else {

				response.sendRedirect("mechanic_login.jsp?error=invalid");
			}
		} else if ("updateProfile".equals(action)) {

			HttpSession session = request.getSession();
			Mechanic mechanic = (Mechanic) session.getAttribute("mechanic");

			if (mechanic == null) {
				response.sendRedirect("mechanic_login.jsp");
				return;
			}

			mechanic.setName(request.getParameter("name"));
			mechanic.setPhone(request.getParameter("phone"));
			mechanic.setSpecialization(request.getParameter("specialization"));
			mechanic.setCity(request.getParameter("city"));

			boolean status = dao.updateMechanic(mechanic);

			if (status) {

				// update session with latest values
				session.setAttribute("mechanic", mechanic);

				response.sendRedirect("mechanic_update_profile.jsp?msg=success");

			} else {

				response.sendRedirect("mechanic_update_profile.jsp?msg=failed");
			}
		}

		// =========================
		// UPDATE AVAILABILITY
		// =========================
		else if ("updateAvailability".equals(action)) {

			HttpSession session = request.getSession();
			Mechanic mechanic = (Mechanic) session.getAttribute("mechanic");

			if (mechanic == null) {
				response.sendRedirect("mechanic_login.jsp");
				return;
			}

			String availability = request.getParameter("availability");

			boolean available = Boolean.parseBoolean(availability);

			boolean status = dao.updateAvailability(mechanic.getMechanicId(), available);

			if (status) {

				mechanic.setAvailableStatus(available);
				session.setAttribute("mechanic", mechanic);

				response.sendRedirect("update_status.jsp?msg=success");

			} else {

				response.sendRedirect("update_status.jsp?msg=failed");
			}
		}
	}

	// =========================
	// LOGOUT
	// =========================
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if ("logout".equals(action)) {

			HttpSession session = request.getSession();
			session.invalidate();

			response.sendRedirect("mechanic_login.jsp");
		} else if ("searchByCity".equals(action)) {

			String city = request.getParameter("city");

			List<Mechanic> mechanics = dao.searchMechanics(city);

			request.setAttribute("mechanicList", mechanics);

			request.getRequestDispatcher("available_mechanics.jsp").forward(request, response);
		} else if ("updateAvailability".equals(action)) {
			int id = Integer.parseInt(request.getParameter("id")); // mechanic_id
			boolean status = Boolean.parseBoolean(request.getParameter("availability"));
			dao.updateAvailability(id, status);
			response.sendRedirect("update_status.jsp?msg=updated");
		}

	}
}