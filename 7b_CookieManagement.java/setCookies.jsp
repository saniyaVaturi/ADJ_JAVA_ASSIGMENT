<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <title>Setting Cookie</title>
    <style>
        .info-box {
            margin: 20px;
            padding: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        .success {
            color: green;
        }
        .error {
            color: red;
        }
    </style>
</head>
<body>
<div class="info-box">
<%
    // Get parameters
    String name = request.getParameter("cookieName");
    String domain = request.getParameter("domain");
    String maxAge = request.getParameter("maxAge");

    if (name != null && domain != null && maxAge != null) {
        try {
            int age = Integer.parseInt(maxAge);

            // Get or create cookie list from session
            @SuppressWarnings("unchecked")
            List<Map<String, String>> cookieList = (List<Map<String, String>>) session.getAttribute("cookieList");
            if (cookieList == null) {
                cookieList = new ArrayList<>();
            }

            // Get current time and format
            long currentTimeSeconds = System.currentTimeMillis() / 1000;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = sdf.format(new Date());

            // Create cookie and set properties
            Cookie cookie = new Cookie(name, "value");
            cookie.setMaxAge(age);

            // Domain should only be set if necessary; it may throw IllegalArgumentException
            if (!"localhost".equals(domain)) {
                try {
                    cookie.setDomain(domain);
                } catch (IllegalArgumentException e) {
                    out.println("<p class='error'>Invalid domain. Skipping domain setting.</p>");
                }
            }

            response.addCookie(cookie);

            // Store metadata in session
            Map<String, String> cookieEntry = new HashMap<>();
            cookieEntry.put("name", name);
            cookieEntry.put("domain", domain);
            cookieEntry.put("maxAge", maxAge);
            cookieEntry.put("setTime", String.valueOf(currentTimeSeconds));
            cookieList.add(cookieEntry);
            session.setAttribute("cookieList", cookieList);

            // Success message
%>
    <h3 class="success">Cookie Set Successfully</h3>
    <p><strong>Cookie Name:</strong> <%= name %></p>
    <p><strong>Domain:</strong> <%= domain %></p>
    <p><strong>Max Age:</strong> <%= maxAge %> seconds</p>
    <p><strong>Set Time:</strong> <%= timestamp %></p>
<%
        } catch (NumberFormatException e) {
%>
    <h3 class="error">Error: Invalid number format for Max Age</h3>
<%
        }
    } else {
%>
    <h3 class="error">Error: Missing one or more required parameters</h3>
<%
    }
%>
    <p><a href="index.jsp">Return to Cookie List</a></p>
</div>
</body>
</html>
