package uz.pdp.g33weblesson5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uz.pdp.g33weblesson5.domain.User;
import uz.pdp.g33weblesson5.repo.UserRepository;

import java.io.IOException;

@WebServlet("/auth/signup")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/auth/signup.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User user = UserRepository.save(new User(email, password));

        Cookie cookie = new Cookie("user", email);
        cookie.setHttpOnly(true);
        cookie.setMaxAge(60*60*24);
        cookie.setSecure(true);
        resp.addCookie(cookie);
        resp.sendRedirect("/home");
    }
}
