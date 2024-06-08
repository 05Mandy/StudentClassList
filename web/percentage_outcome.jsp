<%-- 
    Document   : percentage_outcome
    Created on : 08 Jun 2024, 3:15:43 PM
    Author     : mandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Percentage Page</title>
    </head>
    <body>
        <h1>Total number of male and female in percentage</h1>

        <%
            Double female_perc = (Double) request.getAttribute("female_perc");
            Double male_perc = (Double) request.getAttribute("male_perc");
            Double perc = (Double) request.getAttribute("perc");
        %>

        <p>
            <strong>Female percentage:</strong> <%=female_perc%>
            <strong>Male percentage:</strong> <%=male_perc%>
            <strong>Total percentage:</strong> <%=perc%>
    </p>

    <p>
        Please click <a href="menu.html">here</a> to go back to the menu page OR
        <a href="index.html">here</a> to go back to the index page
    </p>
</body>
</html>
