<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<c:set var="context" value="${pageContext.request.contextPath }" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href="${context}/resources/bootstrap/vendor/bootstrap/css/bootstrap.min.css?ver=2"
	rel="stylesheet">
<link href="${context}/resources/custom/css/main.css?ver=2"
	rel="stylesheet">
<link href="${context}/resources/custom/css/topMenu.css?ver=2"
	rel="stylesheet">
<link href="${context}/resources/custom/css/cleardiv.css?ver=2"
	rel="stylesheet">
<!-- Custom fonts for this template -->
<link
	href="${context}/resources/bootstrap/vendor/font-awesome/css/font-awesome.min.css?ver=2"
	rel="stylesheet" type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="${context}/resources/bootstrap/css/clean-blog.min.css?ver=2"
	rel="stylesheet">
<link href="${context}/resources/bootstrap/css/main.css?ver=2"
	rel="stylesheet">
<link href="${context}/resources/custom/css/pollForm.css?ver=2"
	rel="stylesheet">
	
<style type="text/css">
.custom-button-design{
	background: #FFF;
	border: 1px solid #E5E5E5;
	padding: 10px;
	margin: 5px;
}

.custom-button-design:hover{
	text-color: #0085a1;
}

.custom-button-design:visited{
	color:white;
}

</style>

<!-- Script File -->
<script src="${context}/resources/custom/js/jquery-3.2.1.js"></script>
<script src="${context}/resources/custom/js/jquery-3.2.1.min.js"></script>
<%-- 
<script src="${context}/resources/custom/js/poll.js"></script> --%>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/include/topMenu.jsp" />

	<hr style="margin-top: 0px; margin-bottom: 5px; clear: both;">
	<div id="subMenu" class="container">
		<a href="${context}" style="margin: 0"><i class="fa fa-home"
			aria-hidden="true"></i></a> <a href="${context}">홈</a>><a>카드</a>><a
			href="${context}/card/credit.do">신용카드</a>
	</div>
	<hr style="margin-bottom: 0px; margin-top: 5px; clear: both;">

	<div class="poll-main">

		<section class="section-wrapper"
			style="padding-top: 100px; padding-bottom: 100px;">
		<div class="container">
			<div id="poll_title" class="row"
				style="margin: 0px; text-align: center;">
				<b>신용카드</b>
			</div>
			<div style="color: gray;">
				회원님께 딱 맞는 신용카드 정보를 제공해드립니다.<br>
			</div>
			<div style="height: 30px; clear: both;"></div>
			<div style="height: 30px; clear: both;"></div>
			<a class="custom-button-design" onclick=""># 대학생에게 딱 맞는 카드 Pick</a>
			<c:forEach items="${creditCardList}" var="list" varStatus="status"
				begin="1" end="5">
				<img src="">
				<h2>${list.cardName}</h2>
				<h6>${list.annotation}</h6>
			</c:forEach>
		
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