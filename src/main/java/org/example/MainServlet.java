package org.example;

import org.example.models.User;
import org.example.repos.UserRepository;
import org.example.repos.UserRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/****************************
 * @author a.yertuyak
 * @since 26.04.2020
 ***************************/
@WebServlet("/users")
public class MainServlet extends HttpServlet {

    UserRepository userRepository;

    @Override
    public void init() throws ServletException {
        userRepository = new UserRepositoryImpl();
    }

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userRepository.findAll();
        req.setAttribute("user", users);
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/users.jsp");
        dispatcher.forward(req, resp);
    }
}
