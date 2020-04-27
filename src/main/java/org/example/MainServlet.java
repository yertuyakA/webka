package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Hello World!");
    }
}
