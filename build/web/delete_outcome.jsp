<%-- 
    Document   : delete_outcome
    Created on : 08 Jun 2024, 12:02:20 PM
    Author     : mandy
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Student Page</title>
    </head>
    <body>
        <h1>Remove Student</h1>
        
        <%
            Student student = (Student) request.getAttribute("student");
            Long id = student.getId();
            String name = student.getName();
            String surname = student.getSurname();
            
        %>

        <p>
            <strong><%=name%> <%=surname%></strong> with student number <strong>[<%=id%>]</strong> has been successfully
            removed from the database.
        </p>
        
        <p>
            Please click <a href="menu.html">here</a> to go back to the menu page OR
            <a href="index.html">here</a> to go back to the index page
        </p>
    </body>
</html>
