<%@ page import="com.example.phamducduy.entity.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: os_gpcp_gpdn46
  Date: 10/08/2022
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Product> listProduct = (List<Product>)request.getAttribute("listProduct");
%>
<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>HTML Table</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>
    <ta>
    <%
        for (Product st : listProduct) {
    %>
    <tr>
        <td><%=st.getName()%></td>
        <td><%=st.getPrice()%></td>
        <td><%=st.getQuantity()%></td>
    </tr>
    <%}%>
</table>

</body>
</html>


