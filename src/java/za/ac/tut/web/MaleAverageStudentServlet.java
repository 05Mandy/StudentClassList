/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;

/**
 *
 * @author mandy
 */
public class MaleAverageStudentServlet extends HttpServlet {

    @EJB
    StudentFacadeLocal sfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Double males = sfl.averageAgeMales();
        
        request.setAttribute("males", males);
           
        RequestDispatcher disp = request.getRequestDispatcher("male_avg_outcome.jsp");
        disp.forward(request, response);
    }
}
