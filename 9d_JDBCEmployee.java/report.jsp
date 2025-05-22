<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/Employee";
    String user = "root";
    String pass = "";

    int grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "SELECT * FROM Emp";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        out.println("<h2>Salary Report</h2>");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

        while (rs.next()) {
            int empno = rs.getInt("Emp_NO");
            String empname = rs.getString("Emp_Name");
            int basic = rs.getInt("Basicsalary");

            out.println("Emp_No : " + empno + "<br>");
            out.println("Emp_Name: " + empname + "<br>");
            out.println("Basic : " + basic + "<br>");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

            grandTotal += basic;
        }

        out.println("Grand Salary : " + grandTotal + "<br>");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        con.close();
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    }
%>
<br><br>
<a href="index.jsp">Go Back</a>