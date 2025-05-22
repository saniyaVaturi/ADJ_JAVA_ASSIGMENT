<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
  <title>Employee Entry</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 20px;
    }
    h2 {
      color: #333;
    }
    .form-group {
      margin-bottom: 10px;
    }
    label {
      display: inline-block;
      width: 120px;
    }
    input[type="text"] {
      width: 200px;
      padding: 4px;
    }
    input[type="submit"] {
      padding: 5px 10px;
      margin-top: 10px;
    }
    .success {
      color: green;
    }
    .error {
      color: red;
    }
    pre {
      background-color: #f4f4f4;
      padding: 10px;
      border: 1px solid #ccc;
    }
  </style>
</head>
<body>
  <h2>Enter Employee Details</h2>
  <form method="post">
    <div class="form-group">
      <label for="empno">Emp No:</label>
      <input type="text" id="empno" name="empno"/>
    </div>
    <div class="form-group">
      <label for="empname">Name:</label>
      <input type="text" id="empname" name="empname"/>
    </div>
    <div class="form-group">
      <label for="salary">Basic Salary:</label>
      <input type="text" id="salary" name="salary"/>
    </div>
    <input type="submit" value="Insert"/>
  </form>

  <%
    Connection con = null;
    PreparedStatement ps = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

        String empnoStr = request.getParameter("empno");
        if(empnoStr != null && !empnoStr.trim().isEmpty()) {
            int empno = Integer.parseInt(empnoStr);
            String empname = request.getParameter("empname");
            int salary = Integer.parseInt(request.getParameter("salary"));

            ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setInt(3, salary);

            int i = ps.executeUpdate();
            if(i > 0) {
                out.println("<p class='success'>Employee inserted successfully.</p>");
            }
        }

        // Generate Salary Report
        out.println("<hr/>");
        out.println("<h3>Salary Report</h3>");
        out.println("<pre>");
        out.println("---------------------------------------------");

        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        int total = 0;
        while(rs.next()) {
            int eno = rs.getInt("Emp_NO");
            String ename = rs.getString("Emp_Name");
            int basic = rs.getInt("Basicsalary");
            total += basic;

            out.println("Emp_No   : " + eno);
            out.println("Emp_Name : " + ename);
            out.println("Basic    : " + basic);
            out.println("---------------------------------------------");
        }

        out.println("Grand Salary : " + total);
        out.println("---------------------------------------------");
        out.println("</pre>");

    } catch(Exception e) {
        out.println("<p class='error'>Error: " + e.getMessage() + "</p>");
    } finally {
        if(rs != null) try { rs.close(); } catch(Exception e) {}
        if(stmt != null) try { stmt.close(); } catch(Exception e) {}
        if(ps != null) try { ps.close(); } catch(Exception e) {}
        if(con != null) try { con.close(); } catch(Exception e) {}
    }
  %>
</body>
</html>