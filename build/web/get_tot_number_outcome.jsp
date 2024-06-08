<%-- 
    Document   : get_tot_number_outcome
    Created on : 08 Jun 2024, 1:25:55 PM
    Author     : mandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get total number of students Page</title>
    </head>
    <body>
        <h1>Total number of students stored on the database</h1>
        
        <%
            Integer num_stud = (Integer)request.getAttribute("num_stud");
        %>
        
        <p>
            <strong>Total number of student:</strong> <%=num_stud%>
        </p>
        
        <p>
            Please click <a href="menu.html">here</a> to go back to the menu page OR
            <a href="index.html">here</a> to go back to the index page
        </p>
    </body>
</html>
