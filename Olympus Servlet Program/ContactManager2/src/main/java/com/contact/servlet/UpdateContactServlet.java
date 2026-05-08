package com.contact.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.contact.model.Contact;

@WebServlet("/update")
public class UpdateContactServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int index =
        Integer.parseInt(request.getParameter("index"));

        String phone =
        request.getParameter("phone");

        String email =
        request.getParameter("email");

        Contact c =
        AddContactServlet.list.get(index);

        c.setPhone(phone);

        c.setEmail(email);

        response.sendRedirect("view");
    }
}