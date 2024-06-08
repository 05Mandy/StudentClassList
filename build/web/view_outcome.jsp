<%-- 
    Document   : view_outcome
    Created on : 08 Jun 2024, 11:01:13 AM
    Author     : mandy
--%>

<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Student Outcome Page</title>
    </head>
    <body>
        <h1>Overall Class list of students</h1>

        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            for (Student student : students) {

                Long id = student.getId();
                String name = student.getName();
                String surname = student.getSurname();
                Integer age = student.getAge();
                Character gender = student.getGender();
                byte[] image = student.getImage();
                String photo = "data:image/png;base64," + Base64.getEncoder().encodeToString(image);
        %>
        <table>
            <tr>
                <td><strong>Student number: </strong>  <%=id%></td>
            </tr>

            <tr>
                <td><strong>Name: </strong>  <%=name%></td>
            </tr>

            <tr>
                <td><strong>Surname: </strong>  <%=surname%></td>
            </tr>

            <tr>
                <td><strong>Age: </strong>  <%=age%></td>
            </tr>

            <tr>
                <td><strong>Gender: </strong>  <%=gender%></td>
            </tr>

            <tr>
                <td><strong>Photo: </strong></td>
                <td><<img src="<%=photo%>" alt="student_image" width="200px" height="180px"/></td>
            </tr>

            <%
                List<String> subjects = student.getSubjects();
                for (String subject : subjects) {
            %>
            <tr>
                <td><strong>Subjects: </strong>  <%=subject%></td>
            </tr>
        </table>
        <%
            }
        %>   
        <%
            }

        %>

        <p>
            Please click <a href="menu.html">here</a> to go back to the menu page OR
            <a href="index.html">here</a> to go back to the index page
        </p>
    </body>
</html>
