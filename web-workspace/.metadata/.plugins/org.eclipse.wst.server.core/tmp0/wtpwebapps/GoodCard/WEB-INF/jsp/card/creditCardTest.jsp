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

body{
	font-family: 'Nanum Gothic', serif;
}

h4{
	font-family: 'Nanum Gothic', serif;
}

.custom-button-design {
    display: inline-block;
    padding: 0;
    font-size: 14px;
    font-weight: 300;
    width: 30%;
    height: auto;
    line-height: 52px;
    word-break: keep-all;
    border: 1px solid #0085a1;
    cursor: pointer;
    text-align: center;
    color: #0085a1;
}

.custom-sort-design{
	color: gray;
	list-style: none;
}

/* link -> visit -> hover -> active */

span.custom-button-design:hover {
	color: white;
	background: #0085a1;
}

.first{
	margin-right : 3%;
	float:left;
}

.last{
	margin : 0;
	float:left;
}

i{
	margin-right: 5px;
}

.card-image-area{
	float:left; 
	width:250px; 
	height: 190px; 
	display: inline-block; 
	margin-right: 8%; 
	
}

span.card-detail-button{
	border: 1px solid #0085a1;
    padding: 15px;
    color: #0085a1;
    cursor: pointer;
    margin-bottom: 10%;
    display: inherit;
}


span.card-detail-button:hover{
	background: #0085a1;
	color: white;
}

span.card-homepage-button{
	border: 1px solid #008a1;
	background: #0085a1;
    padding: 15px;
    color: white;
    cursor: pointer;
    margin-bottom: 10%;
    display: inherit;
}

span.card-homepage-button:hover{
	border: 1px solid #0085a1;
	background: white;
	color: #0085a1;
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
			style="padding-top: 100px; padding-bottom: 100px; width:100%;">
		<div class="container" style="width: 100%;">
			<div id="poll_title" class="row"
				style="margin: 0px; text-align: center;">
				<b>신용카드</b>
			</div>
			<div style="color: gray;">
				회원님께 딱 맞는 신용카드 정보를 제공해드립니다.<br>
			</div>
			<div style="height: 50px; clear: both;"></div>
			<div style="width: 100%; display: block; text-align: center;">
				<span class="custom-button-design first" onclick=""># 대학생에게 딱 맞는 카드 Pick</span>
				<span class="custom-button-design first" onclick=""># 20대 직장인 카드 추천 </span>
				<span class="custom-button-design last" onclick=""># 대중교통 # 버스 # 지하철 </span>
			</div>
			<div style="height: 20px; clear: both;"></div>
			<div style="width: 100%; display: block; text-align: center;">			
				<span class="custom-button-design first" onclick=""># 카페 # 스타벅스 # 투썸플레이스 </span>
				<span class="custom-button-design first" onclick=""># 통신요금 # SKT # KT # LGT </span>
				<span class="custom-button-design last" onclick=""># 영화관 # CGV # 롯데시네마 </span>
			</div>
			
			<div style="height: 50px; clear: both;"></div>
			
			<hr>
			<div style="width: 100%;">
			<ul style="padding:0">
				<li class="custom-sort-design first"><i class="fa fa-check" aria-hidden="true"></i>굿카드 랭킹순 </li>
				<li class="custom-sort-design first"><i class="fa fa-check" aria-hidden="true"></i>등록일 순</li>
				<li class="custom-sort-design last"><i class="fa fa-check" aria-hidden="true"></i>리뷰 많은순</li>
			</ul>
			</div>
			<div style="clear:both;"></div>
			<hr>
			
			<div style="height: 30px; clear: both;"></div>
			
			
			<c:forEach items="${creditCardList}" var="list" varStatus="status"
				begin="1" end="1">
			<div style="width:100%">
				
				<div style="height: 190px; float: left; padding: 5%;">
					<h4>1</h4>
				</div>
				
				<div class="card-image-area" style="background: url('${context}/resources/cardImage/${list.imagePath}'); background-size: contain;	background-repeat: no-repeat;">
					<%-- img src="${context}/resources/cardImage/${list.imagePath}" style="width: 300px; height: 190px;">
				 --%>
				</div>
				
				<div style="display: inline-block; height:190px; padding-top:3%; float: left;">
					${list.brand}
					<h4 style="color: black; padding: 10px 0px">${list.cardName}</h4>
					<span style="color:#0085a1">" ${list.annotation} "</span>
				</div>
				
				<div style="display: inline-block;  padding-top: 3%; float:right; margin-right: 8%">
					<span class="card-detail-button">상세 보기</span>		
					<span class="card-homepage-button">카드 신청</span>
				</div>
				</div>
			<div style="clear:both;"></div>
			<hr>
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