/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kha333n.cs506;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kha33
 */
public class WithdrawAuthenticate extends HttpServlet {

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


            try {
                HttpSession session = request.getSession(false);
                int input = Integer.parseInt(request.getParameter("input"));

                if ((input % 1000) == 0) {
                    int id = Integer.parseInt(String.valueOf(session.getAttribute("ID")));
                    DatabaseHelper databaseHelper = EmployeeAccountManager.initDatabaseHelper(getServletContext());
                    Employee employee = databaseHelper.getEmployeeDetails(id);

                    if (input < employee.getCurrentBalance()) {

                        employee.setCurrentBalance(employee.getCurrentBalance() - input);

                        databaseHelper.updateSalaryBalance(id, employee.getCurrentBalance());

                        try (PrintWriter out = response.getWriter()) {
                            String page = HtmlBuilder.buildWithdrawSalarySuccessfulPage();
                            out.print(page);
                        }
                    }
                    else {
                        try (PrintWriter out = response.getWriter()) {
                            String page = HtmlBuilder.buildWithdrawSalaryNotAllowed();
                            out.print(page);
                        }
                    }
                }else {
                    try (PrintWriter out = response.getWriter()) {
                        String page = HtmlBuilder.buildWithdrawSalaryFailedPage();
                        out.print(page);
                    }
                }
            } catch (Exception e) {
                response.sendRedirect("index.html");
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
