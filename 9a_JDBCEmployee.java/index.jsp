<%-- 9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively --%>

<!DOCTYPE html>
<html>
<head>
    <title>Delete Coffee Product</title>
</head>
<body>
    <h2>Delete Coffee Product by ID</h2>
    <form action="deleteCoffee.jsp" method="post">
        <label>Enter Coffee ID to Delete:</label>
        <input type="number" name="id" required>
        <input type="submit" value="Delete Coffee">
    </form>

    <hr>
    <h2>All Coffee Records</h2>
    <jsp:include page="displayCoffee.jsp" />
</body>
</html>