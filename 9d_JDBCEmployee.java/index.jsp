<%-- 9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  --%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Delete Employee</title></head>
<body>
    <h2>Delete Employees with Name Starting With</h2>
    <form action="delete.jsp" method="post">
        Name Prefix: <input type="text" name="prefix" required><br><br>
        <input type="submit" value="Delete Records">
    </form>

    <br>
    <form action="report.jsp">
        <input type="submit" value="View Salary Report">
    </form>
</body>
</html>