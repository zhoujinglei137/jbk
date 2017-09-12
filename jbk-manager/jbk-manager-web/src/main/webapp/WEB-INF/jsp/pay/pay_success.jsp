<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: administrator
  Date: 2017/9/8 0008
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>支付结果</title>
</head>
<body>
<div><h1><font color="red">${msg}</font></h1><br>
<c:choose>
  <c:when test="${msg == '支付失败！'}" >
    <a href="index">支付失败，请验证后重新购买</a>
  </c:when>
  <c:when test="${msg == '支付失败！'}">
    <a href="user">支付成功！请来支付中心</a>
  </c:when>
</c:choose>
</div>
</body>
</html>
