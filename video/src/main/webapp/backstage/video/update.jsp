<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0055)http://localhost:8080/Voids/Course/Courseupdate.do?id=6 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--<base href="http://localhost:8080/Voids/">-->
<base href=".">
<title>智游教育</title>

<link href="${pageContext.request.contextPath}/js/bootstrap.css" rel="stylesheet">

<style type="text/css">
.col-md-1 {
	padding-top: 20px;
}

.a1 {
	color: gray;
}

b {
	float: right;
}
</style>
</head>
<body>
	<nav class="navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand">视频管理系统</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-9">
			<ul class="nav navbar-nav">
				<li class="active"><a>视频管理</a></li>
				<li><a href="speakerShow">主讲人管理</a></li>
				<li><a href="showCourse">课程管理</a></li>
			</ul>
			<p class="navbar-text navbar-right">
				<span>admin</span> <i class="glyphicon glyphicon-log-in"
					aria-hidden="true"></i>&nbsp;&nbsp;<a class="navbar-link">退出</a>
			</p>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>
	<div class="jumbotron" style="padding-top: 15px; padding-bottom: 15px;">
		<div class="container">
			<h2>修改视频</h2>
		</div>
	</div>
	<div class="container" style="margin-top: 20px;">
		<form id="infoForm" class="form-horizontal" method="post" action="updateVideo.do">
		<input type="hidden" name="video_id" value="${video.video_id}">
		<div class="form-group">
				<label for="title" class="col-sm-2 control-label">视频标题</label>
				<div class="col-sm-10">
					<input class="form-control" name="title" id="title" placeholder="${video.title }" type="text">
				</div>
			</div>
			<div class="form-group">
				<label for="speaker_id" class="col-sm-2 control-label">主讲人</label>
				<div class="col-sm-10">
					<select name="speaker_id" id="speaker_id" class="form-control">
						<c:forEach items="${speakerList }" var="i">
						  <option value="${i.id }" <c:if test="${i.id== video.speaker_id}">selected</c:if>>${i.speaker_name }</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="course_id" class="col-sm-2 control-label">所属课程</label>
				<div class="col-sm-10">
					<select name="course_id" id="course_id" class="form-control">
						<c:forEach items="${courseList }" var="i">
						  <option value="${i.id }" <c:if test="${i.id== video.course_id}">selected</c:if>>${i.course_title }</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="time" class="col-sm-2 control-label">视频时长(秒)</label>
				<div class="col-sm-10">
					<input class="form-control" name="time" id="time" placeholder="${video.time }" type="text">
				</div>
			</div>
			<div class="form-group">
				<label for="image_url" class="col-sm-2 control-label">封面图片地址</label>
				<div class="col-sm-10">
					<input class="form-control" name="image_url" id="image_url" placeholder="${video.image_url }" type="text">
				</div>
			</div>
			<div class="form-group">
				<label for="video_url" class="col-sm-2 control-label">视频播放地址</label>
				<div class="col-sm-10">
					<input class="form-control" name="video_url" id="video_url" placeholder="${video.video_url }" type="text">
				</div>
			</div>
			<div class="form-group">
				<label for="detail" class="col-sm-2 control-label">备注</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="detail" name="detail" rows="3">${video.detail }</textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">保存</button>
				</div>
			</div>
		</form>
	</div>
	<!--[if lt IE 9]>
<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
	<script src="${pageContext.request.contextPath}/js/jquery-1.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
	<script src="${pageContext.request.contextPath}/js/confirm.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/message_cn.js"></script>
	<div id="modal-background" class=""></div>
	<div id="confirm-modal" class="modal fade role=" dialog"=""
		tabindex="-1">
		<div class="modal-dialog modal-undefined">
			<div class="modal-content">
				<div class="modal-header">
					<button id="modal-upper-close" class="close modal-close"
						aria-label="Close" type="button">
						<span aria-hidden="true">×</span>
					</button>
					<h4 id="modal-title" class="modal-title">Modal Title</h4>
				</div>
				<div id="modal-body" class="modal-body">Modal Message</div>
				<div id="modal-footer" class="modal-footer"></div>
			</div>
		</div>
	</div>
	<div id="modal-background" class=""></div>
</body>
</html>