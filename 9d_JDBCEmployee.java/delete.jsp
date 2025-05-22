<%@ page import="java.sql.*" %>
<%
    String prefix = request.getParameter("prefix");

    String url = "jdbc:mysql://localhost:3306/Employee";
    String user = "root";
    String pass = ""; // Set your MySQL password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, prefix + "%");

        int count = ps.executeUpdate();

        out.println("<h3 style='color:blue;'>Deleted " + count + " record(s) where name starts with '" + prefix + "'</h3>");

        con.close();
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    }
%>
<br>
<a href="index.jsp">Go Back</a> |
<a href="report.jsp">View Salary Report</a>