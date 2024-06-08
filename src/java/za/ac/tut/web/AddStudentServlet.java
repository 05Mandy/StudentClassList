/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author mandy
 */
@MultipartConfig
public class AddStudentServlet extends HttpServlet {

    @EJB
    StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String genderStr = request.getParameter("gender");
        Character gender = genderStr.charAt(0);
        
        //image
        Part myPart = request.getPart("image");
        
        //subjects
        List<String> mySubjects = new ArrayList<>();
        String[] subjects = request.getParameterValues("subjects");
        
        if (subjects != null) {
            for (String subject : subjects) {
                mySubjects.add(subject);
            }
        }
        
        Date time = new Date();
        
        //create Student and then persist to the database
        Student student = new Student(id, name, surname, age, gender, getByteImage(myPart), mySubjects, time);
        sfl.create(student);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
    }

    private byte[] getByteImage(Part myPart) throws IOException {
       
        InputStream input = myPart.getInputStream();
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        Integer byteRead = 0;
        
        while ((byteRead = input.read(buffer)) != -1) {            
            bao.write(buffer, 0, byteRead);
        }
        bao.close();
        return bao.toByteArray();
    }
}
