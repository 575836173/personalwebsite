<%--
  Created by IntelliJ IDEA.
  User: lengzq
  Date: 2017/12/29
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript">
    $(function () {
        login();
    });
    function login() {
        $.ajax({
            url:'/login',
            type:'post',
            data:{
                username:'zhangsan',
                password:'123456'
            },
            success:function (data) {
                if(data!=null&&data.opResult=='0'){
                    console.log("登录成功");
                    location.href = "/index";
                }else {
                    console.log("登录失败");
                }
            }
        });
    }
</script>
<body>

</body>
</html>
