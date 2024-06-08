/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
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
public class DeleteStudentServlet extends HttpServlet {

    @EJB
    StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        
        Student student = sfl.find(id);
        String url = "";
        
        if (student != null) {
            sfl.remove(student);
            request.setAttribute("student", student);
            url = "delete_outcome.jsp";
        }else{
            url = "error_remove.jsp";
        }
                
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

}
