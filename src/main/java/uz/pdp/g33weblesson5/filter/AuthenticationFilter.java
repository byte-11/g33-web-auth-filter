package uz.pdp.g33weblesson5.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        if (req.getRequestURI().startsWith("/auth/")) {
            chain.doFilter(request, response);
            return;
        }
        if (req.getCookies() == null) {
            resp.sendRedirect("/auth/login");
            return;
        }
        for (Cookie cookie : req.getCookies()) {
            System.out.println(cookie.getMaxAge());
            if (cookie.getName().equals("user")) {
                if (cookie.getMaxAge() <= 0) {
                    resp.sendRedirect("/auth/login");
                } else {
                    chain.doFilter(request, response);
                    return;
                }
            }
        }
        resp.sendRedirect("/auth/login");
    }
}
