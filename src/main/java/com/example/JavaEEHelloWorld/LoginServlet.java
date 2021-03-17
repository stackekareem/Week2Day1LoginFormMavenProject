package com.example.JavaEEHelloWorld;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/status")
public class LoginServlet extends HttpServlet {
    private String message = "Login failed";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("username") && password.equals("password"))
            message = "Successfully logged in";

        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+message+"</h1>");
        out.println("<a href=\"/login/\">Login</a>");
        out.println("</body></html>");
        message = "Login failed";
    }
}
