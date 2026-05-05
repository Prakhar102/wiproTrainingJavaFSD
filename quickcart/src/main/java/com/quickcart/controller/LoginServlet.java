package com.quickcart.controller;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if ("raviparth@gmail.com".equals(email) && "12345".equals(password)) {

            // go to ProductServlet
            response.sendRedirect("products");

        } else {

            // go to error.jsp
            response.sendRedirect("error.jsp");
        }
    }
}