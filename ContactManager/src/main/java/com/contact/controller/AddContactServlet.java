package com.contact.controller;

import com.contact.model.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddContactServlet extends HttpServlet {

    // Shared list (acts like DB)
    private static List<Contact> contactList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Contact contact = new Contact(name, email, phone);
        contactList.add(contact);

        request.setAttribute("contacts", contactList);

        RequestDispatcher rd = request.getRequestDispatcher("viewContacts.jsp");
        rd.forward(request, response);
    }
}