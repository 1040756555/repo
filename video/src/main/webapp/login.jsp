
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
<script type="text/javascript">
		$().ready(function(){
			$("#form").validate({
				rules:{
					accounts:{
						required:true,
						minlength:2
					},
					password:{
						required:true,
						minlength:6
					}
				},
				messages:{
					accounts:{
						required:"请输入角色名",
						minlength:"角色名长度不能小于2"
					},
					password:{
						required:"请输入密码",
						minlength:"密码长度不能小于6"
					}
				}
			})
		})
	</script>
</head>
<style>
    *{
        box-sizing: border-box;
        font-family: 微软雅黑;
    }
    html,body{
        height: 100%;
    }
    body {
        margin: 0 auto;
        background-color: #ddd;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .login{
        background-color: #fff;
        width: 340px;
        padding-top: 30px;
        border-radius: 5px;
    }
    .login img {
        display: block;
        width: 150px;
        margin: 0 auto;
    }
    p {
        text-align: center;
        margin: 10px 0;
        color: darkgray;
        padding-bottom: 5px;
    }
    form {
        padding: 0 30px 20px 30px;
    }
    input {
        height: 40px;
        width: 100%;
        margin: 10px 0;
        outline: none;
        border: 1px solid #aaa;
        padding-left: 10px;
        font-size: 16px;
    }
    input:focus {
         border: 1px solid #d70f18;
    }
    input[type=submit] {
        width: 100%;
        height: 40px;
        line-height: 40px;
        font-size: 14px;
        background-color: #d70f18;
        border: none;
        color: #fff;
        padding: 0;
        margin: 5px 0;
        cursor: pointer;
    }
    .error-message {
        color: #d70f18;
        margin: 3px 0;
    }

</style>
<body>
<div class="login">
        <!-- <img src="image/login.png" alt="智游"> -->
        <img alt="智游" src="ftp://192.168.124.60/1575372755258login.png">
        <p>智游客户视频管理系统</p>
        <form action="login" name="for2" id="form" method="post" onsubmit="return check()">
            <div>
                <input type="text" id="accounts" name="accounts" placeholder="请输入账号"><br>
            </div>
            <div>
                <input type="password" id="password" name="password" placeholder="请输入密码"><br>
            </div>
            <div>
                <p class="error-message">
					<c:if test="${!empty msg}">
						${msg}
					</c:if>
				</p>
                <input type="submit" value="登录">
            </div>
        </form>
    </div>
    <script type="text/javascript">
    	function check() {
			if (document.for2.username.value.length<1) {
				alert("账号不能为空，请输入账号");
				return false;
			}
			if (document.for2.password.value.length<1) {
				alert("密码不能为空，请输入密码");
				return false;
			}
			return true;
		}
        if(window.top !== window){
            window.top.location.reload();
        }
    </script>
</body>
</html>