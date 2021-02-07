/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kha333n.cs506;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author kha33
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session;
        session = getSession(request);

        if(session == null){
            response.sendRedirect("index.html");
        }
        else if (session.getAttribute("ID") == null){
            //TODO: LOGIN to app with credentials
            String employeeID = request.getParameter("employee_id");
            int employeePassword = 0;
            try {
                 employeePassword = Integer.parseInt(request.getParameter("employee_password"));


            DatabaseHelper databaseHelper = EmployeeAccountManager.initDatabaseHelper(getServletContext());

            try {
                Employee employee = databaseHelper.getEmployeeDetails(employeeID);
                if (employee == null){
                    try (PrintWriter out = response.getWriter()) {
                        String page = HtmlBuilder.buildLoginFailedPage("User dose not exists!");
                        out.print(page);
                    }
                }
                else if (employeePassword ==employee.getEmployeePassword()){
                    session.setAttribute("ID",employee.getId());
                    response.sendRedirect("employeeservicesservlet");
                }else {
                    try (PrintWriter out = response.getWriter()) {
                        String page = HtmlBuilder.buildLoginFailedPage("Incorrect Password!");
                        out.print(page);
                    }
                }

            } catch (SQLException throwables) {
                try (PrintWriter out = response.getWriter()) {
                    String page = HtmlBuilder.buildLoginFailedPage("Database Connectivity Failed!");
                    out.print(page);
                }
            }

            }catch (NumberFormatException e){
                try (PrintWriter out = response.getWriter()) {
                    String page = HtmlBuilder.buildLoginFailedPage("Employee ID or Password wrong!");
                    out.print(page);
                }
            }
        }
        else {
            //TODO: Login to app with session
            response.sendRedirect("employeeservicesservlet");
        }
    }


    protected HttpSession getSession(HttpServletRequest request){
        try{
            HttpSession session = request.getSession(false);
            return session;
        }catch (Exception e){
            return null;
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
