<html>
<head>
  <title>Update Employee</title>
  <style>
    table {
      border-spacing: 10px; /* Adds gap between rows */
    }
    td {
      padding: 5px;
    }
    input[type="text"] {
      width: 200px;
      padding: 5px;
    }
    input[type="submit"] {
      padding: 6px 12px;
      margin-top: 10px;
    }
  </style>
</head>
<body>
  <h2>Update Employee Details</h2>
  <form action="updateEmployee.jsp" method="post">
    <table>
      <tr>
        <td><label for="empno">Employee No:</label></td>
        <td><input type="text" name="empno" id="empno" required></td>
      </tr>
      <tr>
        <td><label for="empname">Employee Name:</label></td>
        <td><input type="text" name="empname" id="empname" required></td>
      </tr>
      <tr>
        <td><label for="basicsalary">Basic Salary:</label></td>
        <td><input type="text" name="basicsalary" id="basicsalary" required></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="Update">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>