package kz.nurgissa.learnjakartaee;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        System.out.println("Initalizing Hello Servlet");
        message = "Hello ITStep!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println(Thread.currentThread().getName());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Do Post Worked");
    }

    public void destroy() {
        System.out.println("Destroying Hello Servlet");
    }
}