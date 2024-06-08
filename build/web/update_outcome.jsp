<%-- 
    Document   : update_outcome
    Created on : 08 Jun 2024, 12:57:02 PM
    Author     : mandy
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student Details Outcome Page</title>
    </head>
    <body>
        <h1>Update Student Details Outcome</h1>

        <%
            Student student = (Student) request.getAttribute("student");
            String name = (String)request.getAttribute("name");
            String surname = (String)request.getAttribute("surname");
            name = student.getName();
            surname = student.getSurname();
            //String name = student.getName();
            //String surname = student.getSurname();
        %>

        <p><u>Updated details</u></p>
        <table>
            <tr>
                <td><strong>New Name: </strong>  <%=name%></td>
            </tr>

            <tr>
                <td><strong>New Surname: </strong>  <%=surname%></td>
            </tr>
        </table>

        <p>
            Please click <a href="menu.html">here</a> to go back to the menu page OR
            <a href="index.html">here</a> to go back to the index page
        </p>
    </body>
</html>
