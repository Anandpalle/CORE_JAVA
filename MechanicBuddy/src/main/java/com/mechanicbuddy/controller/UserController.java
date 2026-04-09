package com.mechanicbuddy.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.mechanicbuddy.dao.UserDAO;
import com.mechanicbuddy.dao.UserDAOImpl;
import com.mechanicbuddy.dao.MechanicDAO;
import com.mechanicbuddy.dao.MechanicDAOImpl;
import com.mechanicbuddy.model.User;
import com.mechanicbuddy.model.Mechanic;

@WebServlet("/user")
public class UserController extends HttpServlet {

    private UserDAO userDAO = new UserDAOImpl();
    private MechanicDAO mechanicDAO = new MechanicDAOImpl();

    // =========================
    // POST → Register / Login
    // =========================
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        // =========================
        // USER REGISTER
        // =========================
        if ("register".equals(action)) {

            User user = new User();

            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("email"));
            user.setPhone(request.getParameter("phone"));
            user.setPassword(request.getParameter("password"));
            user.setAddress(request.getParameter("address"));
            user.setCity(request.getParameter("city"));
            user.setState(request.getParameter("state"));
            user.setPincode(request.getParameter("pincode"));

            boolean status = userDAO.registerUser(user);

            if (status) {
                response.sendRedirect("user_login.jsp?msg=success");
            } else {
                response.sendRedirect("user_register.jsp?msg=failed");
            }
        }

        // =========================
        // USER LOGIN
        // =========================
        else if ("login".equals(action)) {

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            User user = userDAO.loginUser(email, password);  

            if (user != null) {

                HttpSession session = request.getSession();
                session.setAttribute("user", user);  

                response.sendRedirect("user_dashboard.jsp");

            } else {

                response.sendRedirect("user_login.jsp?error=invalid");
            }
        }
        else if ("updateProfile".equals(action)) {

            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");

            user.setName(request.getParameter("name"));
            user.setPhone(request.getParameter("phone"));
            user.setAddress(request.getParameter("address"));
            user.setCity(request.getParameter("city"));
            user.setState(request.getParameter("state"));
            user.setPincode(request.getParameter("pincode"));

            boolean status = userDAO.updateUser(user);

            if (status) {

                session.setAttribute("user", user); 

                response.sendRedirect("update_profile.jsp?msg=success");

            } else {

                response.sendRedirect("update_profile.jsp?msg=failed");
            }
        }
    }
    

    // =========================
    // GET → Search Mechanics
    // =========================
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("searchMechanic".equals(action)) {

            String city = request.getParameter("city");

            List<Mechanic> mechanics = mechanicDAO.searchMechanics(city);

            request.setAttribute("mechanicList", mechanics);

            RequestDispatcher rd =
                    request.getRequestDispatcher("available_mechanics.jsp");

            rd.forward(request, response);
        }
    }
}