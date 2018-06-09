<%--
  Created by IntelliJ IDEA.
  User: Tim-Lee
  Date: 2018/3/29
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <p>
        <a href="${pageContext.request.contextPath}/downLoadFile?filePath=dspt-web.zip" download="我的文件">下载文件</a>
    </p>
</body>
</html>
