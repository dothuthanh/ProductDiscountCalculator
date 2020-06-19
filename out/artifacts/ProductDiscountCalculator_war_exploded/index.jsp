<%--
  Created by IntelliJ IDEA.
  User: BipVuong
  Date: 6/18/2020
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head></head>
    <link rel="stylesheet" href="style.css">
    <title>Product Discount Calculator</title>
</head>
  <body>
    <h2>Product Discount Calculator</h2>
    <form action="/caculotor" method="post">
      <lable>Mo Ta</lable>
      <input type="text" id="mota" name="sp" placeholder="Nhap mo ta san pham"></br>
      <lable>Gia San Pham </lable>
      <input type="text" name="price" placeholder="Gia niem yet cua san pham"></br>
      <lable>Chiet Khau</lable>
    <input type="text" name="chietkhau" placeholder="ti le chiet khau cua san pham"></br>
      <input type = "submit" id = "submit" value ="Caculotor">
    </form>
  </body>
</html>
