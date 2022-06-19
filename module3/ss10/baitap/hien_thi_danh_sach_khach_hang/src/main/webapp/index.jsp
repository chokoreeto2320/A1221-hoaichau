<%--
  Created by IntelliJ IDEA.
  User: chaunguyen
  Date: 18/06/2022
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Danh sach khach hang</title>

  </head>
  <body>
  <table>
    <tr>
      <th>Tên Khách Hàng</th>
      <th>Ngày Sinh</th>
      <th>Địa Chỉ</th>
      <th>Ảnh Khách Hàng</th>
    </tr>
    <c:forEach var="customer" items="${customerListServlet}">
      <tr>
        <td><c:out value="${customer.name}"></c:out></td>
        <td><c:out value="${customer.date}"></c:out></td>
        <td><c:out value="${customer.address}"></c:out></td>
        <td><img src="${customer.img}"></td>
      </tr>

    </c:forEach>

  </table>
  </body>
</html>
