package com.contact.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.contact.model.Contact;

@WebServlet("/add")
public class AddContactServlet extends HttpServlet {

    public static ArrayList<Contact> list = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        if(name.isEmpty() || phone.isEmpty() || email.isEmpty()) {

            response.sendRedirect("error.jsp");

        } else {

            list.add(new Contact(name, phone, email));

            response.sendRedirect("success.jsp");
        }
    }
}