<%-- 
    Document   : update_error_page
    Created on : 08 Jun 2024, 12:57:27 PM
    Author     : mandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Update Page</title>
    </head>
    <body>
        <h1>Error</h1>
        
        <p style="color: red">
            Incorrect student number!!!!Enter student number to update details of the student.
        </p>
        
        <form action="UpdateStudentServlet.do" method="POST">
            <table>
                <tr>
                    <td>Student number: </td>
                    <td><input type="text" name="id" required=""></td>
                </tr>
                
                <tr>
                    <td>New Name: </td>
                    <td><input type="text" name="name" required=""></td>
                </tr>
                
                <tr>
                    <td>New Surname: </td>
                    <td><input type="text" name="surname" required=""></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="UPDATE"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
