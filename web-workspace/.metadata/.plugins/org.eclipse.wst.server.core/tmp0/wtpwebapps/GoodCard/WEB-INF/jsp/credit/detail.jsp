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
<link href="https://fonts.googleapis.com/css?family=Source+Code+Pro"
	rel="stylesheet">
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
<link href="${context}/resources/custom/css/creditList.css?ver=2"
	rel="stylesheet">


<!-- Script File -->
<script src="${context}/resources/custom/js/jquery-3.2.1.js"></script>
<script src="${context}/resources/custom/js/jquery-3.2.1.min.js"></script>

<style type="text/css">

.card-image-area{
	width: 20%;
	height: 100%;
	float: left;
	display: inline-block;
}

.card-summarized-info{
	padding-top:2%;
	height: 100%;
	float: left;
	display: inline-block;
}

.info-padding{
	margin-bottom: 0.5%;
}

</style>

</head>
<body>
	<jsp:include page="/WEB-INF/jsp/include/topMenu.jsp" />
	<hr style="margin-top: 0px; margin-bottom: 5px; clear: both;">
	<div id="subMenu" class="container">
		<a href="${context}" style="margin: 0"><i class="fa fa-home"
			aria-hidden="true"></i></a> <a href="${context}">홈</a>&nbsp;>&nbsp;<a
			href="${context}/credit.do?pageNo=1">신용카드</a>
	</div>
	<hr style="margin-bottom: 0px; margin-top: 5px; clear: both;">

	<div class="poll-main">

		<section class="section-wrapper" style="width:100%; padding:70px 0px;">
		
		<div class="container" style="width: 100%; height: 131.1px;">
			<div style="clear: both;"></div>
			<div class="card-image-area" style="background: url('${context}/resources/cardImage/${card.imagePath}'); background-repeat: no-repeat; background-size: contain;"></div>
			<div class="card-summarized-info">
				<div class="info-padding">${card.brand }</div>
				<div class="info-padding" style="font-size: 15pt;"><b>${card.cardName}</b></div>
				<div style="color:#0085a1; margin-top : 1%;">" ${ card.annotation } "</div>
			</div>
			
		</div>
		
		</section>
	
	</div>

	<div style="height: 30px; clear: both;"></div>


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