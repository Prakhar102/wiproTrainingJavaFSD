package com.quickcart.controller;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // go to dashboard.jsp
        response.sendRedirect("dashboard.jsp");
    }
}