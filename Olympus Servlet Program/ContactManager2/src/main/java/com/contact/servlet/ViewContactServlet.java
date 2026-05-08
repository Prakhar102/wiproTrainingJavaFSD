package com.contact.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/view")
public class ViewContactServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("contacts", AddContactServlet.list);

        request.getRequestDispatcher("view.jsp").forward(request, response);
    }
}