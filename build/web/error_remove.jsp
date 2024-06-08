<%-- 
    Document   : error_remove
    Created on : 08 Jun 2024, 12:04:21 PM
    Author     : mandy
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Error Page</title>
    </head>
    <body>
        <h1>Error Page</h1>
        
        <p style="color: red">
            Student number not found!!!!Enter correct student to remove a student.
        </p>
        
        <form action="DeleteStudentServlet.do" method="POST">
            <table>
                <tr>
                    <td>Student number: </td>
                    <td><input type="text" name="id" required=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="DELETE"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
