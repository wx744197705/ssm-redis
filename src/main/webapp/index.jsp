<html>
<body>
<h2>
    <form action="${pageContext.request.contextPath}/userCtrl/getUser">
        <input type="submit" value="getUser">
    </form>
    <hr>
    <form action="${pageContext.request.contextPath}/userCtrl/addUser" method="post">
        username:<input type="text" name="username">
        password:<input type="password" name="password">
        age:<input type="text" name="age">
        <input type="submit" value="addUser">
    </form>
</h2>
</body>
</html>
