/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanji
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Hello");
        try {

            UserBean user = new UserBean();
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            System.out.println(user.getEmail());
            user = UserDAO.login(user);

            if (user.isValid()) {

                //   HttpSession session = request.getSession(true);
                // session.setAttribute("currentSessionUser", user);
                
                System.out.println(user.getEmail());
                 String email = request.getParameter("email");
                  request.getSession().setAttribute("currentUserEmail", email);
                   System.out.println("Loginservlet CurrentUser"+request.getSession().getAttribute("currentUserEmail") );
               // request.setAttribute("email", user.getEmail());
                if (user.getRole().equals("admin")) {
                   
                    request.getRequestDispatcher("/WEB-INF/views/adminhome.jsp").forward(request, response);

                } else {
                    request.getRequestDispatcher("/WEB-INF/views/teacherhome.jsp").forward(request, response);

                }

                // response.sendRedirect("userLogged.jsp"); //logged-in page      		
            } else {
                System.out.println("invalid user");
                request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
                // response.sendRedirect("invalidLogin.jsp"); //error page 
            }

        } catch (Throwable theException) {
            System.out.println(theException);
        }

    }

}
