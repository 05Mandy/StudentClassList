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
import za.ac.tut.entities.Student;

/**
 *
 * @author mandy
 */
public class UpdateStudentServlet extends HttpServlet {

    @EJB
    StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        Student student = sfl.find(id);
        String url = "";

        if (student != null) {
            //set the name and the surname
            student.setName(name);
            student.setSurname(surname);

            sfl.edit(student);
            
            request.setAttribute("name", name);
            request.setAttribute("surname", surname);
            request.setAttribute("student", student);

            url = "update_outcome.jsp";
        } else {
            url = "update_error_page.jsp";
        }

        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

}
