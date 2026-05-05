package com.contact.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ViewContactServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("viewContacts.jsp");
        rd.forward(request, response);
    }
}