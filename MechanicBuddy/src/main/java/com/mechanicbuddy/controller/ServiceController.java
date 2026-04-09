package com.mechanicbuddy.controller;

import java.io.IOException;
import java.util.List;

import com.mechanicbuddy.dao.ServiceDAO;
import com.mechanicbuddy.dao.ServiceDAOImpl;
import com.mechanicbuddy.model.Service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/service")
public class ServiceController extends HttpServlet {

    private ServiceDAO dao = new ServiceDAOImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("loadServices".equals(action)) {

            System.out.println("Controller HIT");

            String mechIdStr = request.getParameter("mechanicId");

            if (mechIdStr == null) {
                response.getWriter().println("❌ mechanicId missing in URL");
                return;
            }

            int mechanicId = Integer.parseInt(mechIdStr);

            List<Service> services = dao.getServicesByMechanic(mechanicId);

            System.out.println("Services found: " + services.size());

            request.setAttribute("services", services);

            request.getRequestDispatcher("book_service.jsp")
                   .forward(request, response);
        }
    }
}