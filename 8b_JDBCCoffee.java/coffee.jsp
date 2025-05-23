<%--  8b. Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively --%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Update Coffee and Display Records</title>
</head>
<body>
    <h2>Update Coffee Product</h2>

<%
    // Database connection details
    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root";  // change as per your MySQL username
    String password = "password";  // change as per your MySQL password

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    // Read form data
    String idStr = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL 8+ driver

        conn = DriverManager.getConnection(url, username, password);

        if (idStr != null && coffeeName != null && priceStr != null) {
            int id = Integer.parseInt(idStr);
            double price = Double.parseDouble(priceStr);

            // Update query
            String updateSQL = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, coffeeName);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, id);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
%>
                <p style="color:green;">Coffee product updated successfully.</p>
<%
            } else {
%>
                <p style="color:red;">No coffee found with ID <%= id %>.</p>
<%
            }
            pstmt.close();
        }

        // Display all coffee records
        String selectSQL = "SELECT * FROM coffee";
        pstmt = conn.prepareStatement(selectSQL);
        rs = pstmt.executeQuery();

%>
    <h2>All Coffee Records</h2>
    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
<%
        while (rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getDouble("price") %></td>
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
    <a href="updateCoffee.html">Back to Update Form</a>
</body>
</html>
