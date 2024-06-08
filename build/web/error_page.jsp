<%-- 
    Document   : error_page
    Created on : 07 Jun 2024, 12:48:08 AM
    Author     : mandy
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Error!</h1>
        
        <p style="color: red">
            Student not found!!!! Please enter correct student number.
        </p>
        
         <form action="SearchStudentServlet.do" method="POST">
            <table>
                <tr>
                    <td>Student number: </td>
                    <td><input type="text" name="id" required=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
  