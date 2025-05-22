<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Employee Report</title>
</head>
<body>
    <h2>Employee Report</h2>

<%
    // JDBC connection parameters
    String url = "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "password"; // Replace with your MySQL root password

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String basicSalaryStr = request.getParameter("basicsalary");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        if (empNoStr != null && empName != null && basicSalaryStr != null) {
            int empNo = Integer.parseInt(empNoStr);
            double basicSalary = Double.parseDouble(basicSalaryStr);

            // Insert the new employee
            String insertSQL = "INSERT INTO Emp (Emp_NO, EmpName, BasicSalary) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, empNo);
            pstmt.setString(2, empName);
            pstmt.setDouble(3, basicSalary);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
%>
                <p style="color:green;">Employee added successfully.</p>
<%
            } else {
%>
                <p style="color:red;">Failed to add employee.</p>
<%
            }
            pstmt.close();
        }

        // Display all employees
        String selectSQL = "SELECT * FROM Emp";
        pstmt = conn.prepareStatement(selectSQL);
        rs = pstmt.executeQuery();

%>
    <table border="1" cellpadding="10">
        <tr>
            <th>Emp No</th>
            <th>Emp Name</th>
            <th>Basic Salary</th>
        </tr>
<%
        while (rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("Emp_NO") %></td>
            <td><%= rs.getString("EmpName") %></td>
            <td><%= rs.getDouble("BasicSalary") %></td>
        </tr>
<%
        }
    } catch (Exception e) {
%>
    <p style="color:red;">Error: <%= e.getMessage() %></p>
<%
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception ignored) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception ignored) {}
        try { if (conn != null) conn.close(); } catch (Exception ignored) {}
    }
%>
    </table>
    <br>
    <a href="addEmployee.html">Add Another Employee</a>
</body>
</html>
>