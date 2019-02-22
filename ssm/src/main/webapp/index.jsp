<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/account/findAll">测试springmvc</a>
    <br/>
<h3>保存</h3>
<form action="/account/save" method="post">
    姓名:<input type="text" name="name">
    金额:<input type="text" name="money">
    <input type="submit" value="保存">
    <br/>
</form>

    <br/>
    <a href="/account/find">测试xml配置</a>
    <br/>
    测试动态sql
    <form action="/account/findByName" method="post">
        <input type="text" name="name">
        <input type="submit" value="select">
    </form>
    <br/>
</body>
</html>
