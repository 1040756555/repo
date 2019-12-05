<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0044)http://localhost:8080/Voids/user/userShow.do -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
    
    <meta name="renderer" content="webkit">
    <meta name="keywords" content="Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程">
    <meta name="description" content="智游教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,智游教育,学习成就梦想！">
    <meta name="author" content="尚忠祥">
    
<!--<base href="http://localhost:8080/Voids/">--><base href=".">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/A/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/A/profile.css">
    <link rel="icon" href="${pageContext.request.contextPath}/z/logo.jpg" type="image/png">
    <title>个人中心</title>
</head>

<body>

<header>
	<div class="container top_bar clearfix">
		<img src="${pageContext.request.contextPath}/z/logo.png" alt="智游">
		<div id="tele">
			<span>4006-371-555</span>
			<span>0371-88888598</span>
		</div>
	</div>
	<menu>
	  <div class="container clearfix">
			<ul class="clearfix f_left">
				<li><a>首页</a></li>
				
				<li class="menu_active"><a>个人中心</a></li>
			</ul>
			
			<div id="user_bar">
				<a >
						<img id="avatar" src="${pageContext.request.contextPath}/z/avatar_lg.png" alt="" width="30px;">
				</a>
				<a id="lay_out" href="${pageContext.request.contextPath}/index.jsp">退出</a>
			</div>
			
	  </div>
	</menu>
</header>

    <main>
        <div class="container">
            <h2>我的资料</h2>
            <div id="profile_tab">
                <ul class="profile_tab_header f_left clearfix">
                    <li><a href="${pageContext.request.contextPath}/frontstage/alterData.jsp">更改资料</a></li>
                    <li class="profile_tab_line">|</li>
                    <li><a href="${pageContext.request.contextPath}/frontstage/alterPicture.jsp">更改头像</a></li>
                    <li class="profile_tab_line">|</li>
                    <li><a href="${pageContext.request.contextPath}/frontstage/alterPassword.jsp">密码安全</a></li>
                </ul>
                <div class="proflle_tab_body">
                    
                    <div class="proflle_tab_workplace clearfix">
                          <div class="profile_avatar_area">                         
		                         <img id="avatar" width="200px;" src="${pageContext.request.contextPath}/videoimg/29.jpg" alt="">
                            <p> 欢迎回来！</p>
                          </div>
                     <ul class="profile_ifo_area">
                            <li><span class="dd">昵　称：</span><input type="text" id="nickname" name="nickname" value="" placeholder="请输入用户名"></li>   
                            <li><span class="dd">性　别：</span><input type="text" id="sex" name="sex" value="" placeholder="请输入性别"></li>
                            <li><span class="dd">生　日：</span><input type="text" id="birthday" name=""birthday"" value="" placeholder="请输入生日"></li>
                            <li><span class="dd">邮　箱：</span><input type="text" id="email" name="email" value="" placeholder="请输入邮箱"></li>
                            <li><span class="dd">所在地：</span><input type="text" id="address" name="address" value="" placeholder="请输入所在地"></li> 
                            <li><input type="submit" value="保      存"></li>                         
                     </ul>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <footer>
        <div class="container">
            <ul>
                <li><img src="${pageContext.request.contextPath}/z/footer_logo.png" alt="" id="foot_logo"></li>
                <li>版权所有：智游3G教育　　　©&nbsp;www.zhiyou100.com</li>
                <li><img src="${pageContext.request.contextPath}/z/a.png" alt="" id="wxgzh"></li>
            </ul>
        </div>
    </footer>

</body></html>