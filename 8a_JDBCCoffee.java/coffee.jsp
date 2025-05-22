<%@ page import="java.sql.*" %>
<%
    String idStr = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee", "root","");
        stmt = con.createStatement();

        // Insert new record if form was submitted
        if (idStr != null && name != null && priceStr != null) {
            int id = Integer.parseInt(idStr);
            double price = Double.parseDouble(priceStr);

            String insertQuery = "INSERT INTO coffee (id, coffee_name, price) VALUES (" + id + ", '" + name + "', " + price + ")";
            stmt.executeUpdate(insertQuery);
        }

        // Display all coffee records
        out.println("<h2>Coffee Products:</h2>");
        rs = stmt.executeQuery("SELECT * FROM coffee");
        out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");

        while (rs.next()) {
            out.println("<tr><td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getDouble("price") + "</td></tr>");
        }

        out.println("</table>");
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>