<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<c:set var="context" value="${pageContext.request.contextPath }" />

<link
	href="${context}/resources/bootstrap/vendor/bootstrap/css/bootstrap.min.css?ver=1"
	rel="stylesheet">
<link href="${context}/resources/custom/css/main.css?ver=1"
	rel="stylesheet">
<link href="${context}/resources/custom/css/topMenu.css?ver=1"
	rel="stylesheet">
<link href="${context}/resources/custom/css/cleardiv.css?ver=1"
	rel="stylesheet">
<!-- Custom fonts for this template -->
<link
	href="${context}/resources/bootstrap/vendor/font-awesome/css/font-awesome.min.css?ver=1"
	rel="stylesheet" type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="${context}/resources/bootstrap/css/clean-blog.min.css?ver=1"
	rel="stylesheet">
<link href="${context}/resources/bootstrap/css/main.css?ver=1"
	rel="stylesheet">
<link href="${context}/resources/custom/css/joinForm.css?ver=1">

<!-- Script File -->
<script src="${context}/resources/custom/js/jquery-3.2.1.js"></script>
<script src="${context}/resources/custom/js/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
	function go_join_form() {
		alert('실행');
		location.replace("${context}/member/join.do");
	}
</script>

<style type="text/css">
html, body {
	width: 100%;
	height: 100%;
}

.custom-main {
	float: center; /* 
	background: #E8E8E4; */
	display: main;
	width: 100%;
	height: 100%;
	background: url("${context}/resources/bootstrap/img/home-bg.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}

#bg img {
	-webkit-filter: blur(5px);
	filter: blur(5px);
	transform: scale(1.1);
}

body {
	font-size: 12pt;
	font-family: 'Noto Sans KR';
}

div#form {
	padding: 20px;
}

.custom-input-group {
	position: relative;
	display: table;
	border-collapse: separate;
	width: 100%
}

.custom-input-category {
	background-color: #fff;
}

.custom-border-radius {
	border: 1px solid;
	border-radius: 0 !important;
	border-color: #e8e8e4;
	height: 45px;
	border-radius: 0 !important;
}

.custom-input-group-addon {
	padding: 6px 12px;
	font-size: 14px;
	font-weight: 400;
	line-height: 1;
	color: #555;
	text-align: center;
	border-right: 0;
	width: 110px;
	white-space: nowrap;
	vertical-align: middle;
	display: table-cell;
}

.custom-input-value {
	position: relative;
	z-index: 2;
	float: left;
	width: 100%;
	margin-bottom: 0;
	display: table-cell;
}

.login_button {
	border: 1px solid black;
	color: #FFF;
	background: black;
	padding: 10px;
	font-family: 'Noto Sans KR', serif;
	text-align: center;
}

.go_joinForm {
	border: 1px solid #333;
	color: black;
	background: white;
	padding: 10px;
	font-family: 'Noto Sans KR', serif;
	text-align: center;
}

</style>

</head>

<body>
	<jsp:include page="/WEB-INF/jsp/include/topMenu.jsp" />

	<div class="custom-main">

		<section class="section-wrapper"
			style="padding-top: 100px; padding-bottom: 100px;">
			<div id="join_form_background" class="row" style="margin: 0px;">
				<div class="col-sm-4 col-xs-4"></div>
				<div class="col-sm-4 col-xs-4"
					style="width: 100%; height: auto; margin: 100px 0px; background-color: (255, 255, 255, 0.4);">
					<%-- <img
						src="${context}/resources/bootstrap/img/join/join_main_page.png"
						style="float: left;"> --%>

					<!-- display form -->
					<div style="background-color: #fff; padding: 20px 20px;">

						<b style="font-size: 20pt; font-family: 'Noto Sans KR'; font-weight: bold;">&nbsp;Member Login</b>

						<div style="height: 10px; clear: both;"></div>
						<div>
							<span style="color: gray;">&nbsp;최적의 카드를 추천해드립니다. GoodCard.
								<hr/>
							</span>
						</div>
						<div style="height: 50px; clear: both;"></div>

						<!-- joinForm -->
						<form id="loginForm" method="post"
							action="${context}/member/login.do" style="padding: 50px; 0px;">

							<div class="custom-input-group">
								<input type="text" id="inputId"
									class="custom-input-value custom-border-radius" name="id"
									placeholder="아이디" />
							</div>
							<div style="height: 10px; clear: both;"></div>
							<div class="custom-input-group">
								<input type="password" id="inputPassword"
									class="custom-input-value custom-border-radius" name="password"
									placeholder="비밀번호" />
							</div>							
							<div style="height: 30px; clear: both;"></div>
							<div style="width: 100%; text-align: center;">
								<input type="submit" class="login_button" value="로그인">
								<input type="button" class="go_joinForm" onclick="go_join_form()" value="회원가입">
							</div>
							<div style="height: 30px; clear: both;"></div>

						</form>
					</div>
				</div>

				<div class="col-sm-4 col-xs-4"></div>


			</div>
		</section>
	</div>

	<jsp:include page="/WEB-INF/jsp/include/bottom.jsp" />

	<!-- Bootstrap core JavaScript -->
	<script
		src="${context}/resources/bootstrap/vendor/jquery/jquery.min.js"></script>
	<script
		src="${context}/resources/bootstrap/vendor/popper/popper.min.js"></script>
	<script
		src="${context}/resources/bootstrap/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Custom scripts for this template -->
	<script src="${context}/resources/bootstrap/js/clean-blog.min.js"></script>


</body>
</html>