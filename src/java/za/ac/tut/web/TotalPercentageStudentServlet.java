/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author mandy
 */
public class TotalPercentageStudentServlet extends HttpServlet {

    @EJB
    StudentFacadeLocal sfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long countFemale = sfl.countTotalNumOfFemales();
        Long countMale = sfl.countTotalNumOfMales();
        Long total = sfl.countTotalNumOfStudents();
        
        //total number of students in percentage
        double female_perc = (double)countFemale/total * 100;
        double male_perc = (double)countMale/total * 100;
        
        double perc = female_perc + male_perc;

        request.setAttribute("female_perc", female_perc);
        request.setAttribute("male_perc", male_perc);
        request.setAttribute("perc", perc);

        RequestDispatcher disp = request.getRequestDispatcher("percentage_outcome.jsp");
        disp.forward(request, response);
    }

}
