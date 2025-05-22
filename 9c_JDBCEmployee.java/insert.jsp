<%@ page import="java.sql.*" %>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    int salary = Integer.parseInt(request.getParameter("salary"));

    String url = "jdbc:mysql://localhost:3306/Employee";
    String user = "root";
    String pass = ""; // Set your MySQL password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setInt(3, salary);

        int result = ps.executeUpdate();

        if (result > 0) {
            out.println("<h3 style='color:green;'>Employee inserted successfully.</h3>");
        } else {
            out.println("<h3 style='color:red;'>Failed to insert employee.</h3>");
        }

        con.close();
    } catch (SQLIntegrityConstraintViolationException e) {
        out.println("<h3 style='color:red;'>Employee with same Emp No already exists.</h3>");
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    }
%>
<br>
<a href="index.jsp">Go Back</a>