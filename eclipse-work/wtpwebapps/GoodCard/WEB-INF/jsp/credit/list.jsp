<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
<script type="text/javascript">
	function goCardHomepage(url) {
		location.replace(url);
	};

	function goPage(obj) {
		location.replace('${context}/credit.do?pageNo='
				+ obj.getAttribute('id'));
	};
	
	function goDetailPage(obj) {
		console.log(obj);
	};
	
	$(function() {
		
		$('.card-info-area').show();
		$('.benefit-info-area').hide();
		
		$('.click-card-info-area').click(
			function() {
			$('.card-info-area').show();
			$('.benefit-info-area').hide();
			$('.click-benefit-info-area').css("color", "#7b7b7b");
			$('.click-card-info-area').css("color", "#0085a1");
		});
		
		$('.click-benefit-info-area').click(
			function() {
				$('.benefit-info-area').show();
				$('.card-info-area').hide();
				$('.click-card-info-area').css("color", "#7b7b7b");
				$('.click-benefit-info-area').css("color", "#0085a1");
			}
		);
		
		$('.card-detail-button').click(
			function() {
				$('.card-info-area').show();
				$('.benefit-info-area').hide();
				$('.click-benefit-info-area').css("color", "#7b7b7b");
				$('.click-card-info-area').css("color", "#0085a1");
			}
		);	
	});
</script>
<style type="text/css">
.click-benefit-info-area:hover {
	font-weight: bold;
}
.click-card-info-area:hover {
	font-weight: bold;
}

#show_modal {
	cursor: pointer;
}

#show_modal:hover {
	color: #0085a1;
}

.white_content {
	position: fixed;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	background: rgba(0, 0, 0, 0.8);
	opacity: 0;
	-webkit-transition: opacity 400ms ease-in;
	-moz-transition: opacity 400ms ease-in;
	transition: opacity 400ms ease-in;
	pointer-events: none;
}

.white_content:target {
	opacity: 1;
	pointer-events: auto;
}

.white_content>div {
	position: absolute;
	top: 25%;
	left: 25%;
	width: 50%;
	height: 60%;
	padding: 16px;
	background-color: white;
	overflow: auto;
}

.card-image-area {
	width: 30%;
	height: 30%;
	float: left;
	display: inline-block;
}

.card-summarized-info {
	padding-top: 2%;
	float: left;
	display: inline-block;
}

.info-padding {
	margin-bottom: 0.5%;
	text-align: left;
}

.card-detail-subtitle {
	font-size: 13pt;
}

.card-detail-subcontent {
	font-size: 12pt;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/include/topMenu.jsp" />

	<hr style="margin-top: 0px; margin-bottom: 5px; clear: both;">
	<div id="subMenu" class="container">
		<a href="${context}" style="margin: 0"><i class="fa fa-home"
			aria-hidden="true"></i></a> <a href="${context}">홈</a>><a>카드</a>><a
			href="${context}/credit.do?pageNo=1">신용카드</a>
	</div>
	<hr style="margin-bottom: 0px; margin-top: 5px; clear: both;">

	<div class="poll-main">

		<section class="section-wrapper" style="width:100%; padding:70px 0px;">
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
				<span class="custom-button-design first" onclick=""># 대학생에게 딱
					맞는 카드 Pick</span> <span class="custom-button-design first" onclick="">#
					20대 직장인 카드 추천 </span> <span class="custom-button-design last" onclick="">#
					대중교통 # 버스 # 지하철 </span>
			</div>
			<div style="height: 20px; clear: both;"></div>
			<div style="width: 100%; display: block; text-align: center;">
				<span class="custom-button-design first" onclick=""># 카페 #
					스타벅스 # 투썸플레이스 </span> <span class="custom-button-design first" onclick="">#
					통신요금 # SKT # KT # LGT </span> <span class="custom-button-design last"
					onclick=""># 영화관 # CGV # 롯데시네마 </span>
			</div>

			<div style="height: 50px; clear: both;"></div>

			<hr>
			<div style="width: 100%;">
				<ul style="padding: 0">
					<li class="custom-sort-design first"><i class="fa fa-check"
						aria-hidden="true"></i>굿카드 랭킹순</li>
					<li class="custom-sort-design first"><i class="fa fa-check"
						aria-hidden="true"></i>등록일 순</li>
					<li class="custom-sort-design last"><i class="fa fa-check"
						aria-hidden="true"></i>리뷰 많은순</li>
				</ul>
			</div>
			<div style="clear: both;"></div>
			<hr>

			<c:set var="pageNo" value="${param.pageNo}" />
			<c:choose>
				<c:when test="${ pageNo eq 1 }">
					<c:set var="cardNo" value="0" scope="page" />
				</c:when>
				<c:otherwise>

					<c:set var="cardNo" value="${param.pageNo * 10 - 10 }" scope="page" />
				</c:otherwise>
			</c:choose>

			<c:forEach items="${creditCardList}" var="list" varStatus="status">

				<div style="height: 30px; clear: both;"></div>

				<div style="width: 100%;">

					<c:set var="cardNo" value="${ cardNo + 1 }" scope="page"></c:set>

					<div style="height: 100%; float: left; padding: 5%;">
						<b
							style="font-size: 20pt; color: #0085a1; font-family: 'Nanum Gothic', serif;">${cardNo}</b>
					</div>

					<div class="card-image-area"
						style="height: 126.6px; background: url('${context}/resources/cardImage/${list.imagePath}'); background-size: contain;	background-repeat: no-repeat;">
						<%-- img src="${context}/resources/cardImage/${list.imagePath}" style="width: 300px; height: 126.6px;"> --%>
					</div>

					<div
						style="display: inline-block; height: 100%; padding-top: 1%; float: left;">
						${list.brand}
						<div
							style="color: black; padding: 10px 0px; font-size: 15pt; display: inherit;">
							<b>${list.cardName}</b>
						</div>
						<div style="color: #0085a1; display: inherit;">"
							${list.annotation} "</div>
					</div>

					<div style="display: inline-block; float: right; height: 100%;">
						<span class="card-detail-button" onclick="goDetailPage('${list}')"
							style="text-align: center;"><a href="#open${ cardNo }"
							class="card-detail-button" style="color: #0085a1;">상세 보기</a></span> <span
							class="card-homepage-button" onclick="goCardHomepage('${list.homepageURL}')"
							style="text-align: center;">카드 신청</span> <span
							class="card-detail-button"
							style="color: #0085a1; text-align: center;"><a
							href="#open" class="card-detail-button"><i id="show_modal"
								class="fa fa-plus" aria-hidden="true" style="color: #0085a1;">&nbsp;My
									Card</i></a></span>
					</div>

				</div>
				<div style="height: 30px; clear: both;"></div>
				<hr>

				<div class="white_content" id="open${ cardNo }">
					<div
						style="padding-left: 3%; padding-right: 3%; font-family: 'Nanum Gothic', serif;">
						<div>
							<a href="#close"
								style="color: gray; float: right; font-size: 20pt;">x</a>
						</div>
						<div style="clear: both;"></div>
						<div class="card-image-area"
							style="background: url('${context}/resources/cardImage/${list.imagePath}'); background-repeat: no-repeat; background-size: contain;"></div>
						<div class="card-summarized-info">
							<div class="info-padding">${list.brand}</div>
							<div class="info-padding"
								style="font-size: 15pt; font-weight: bold;">
								${list.cardName}</div>
							<div style="color: #0085a1; margin-top: 1%; text-align: left;">
								" ${list.annotation} "</div>
						</div>
						<div class="card-summarized-buton"
							style="float: right; text-align: center; padding-top: 3.5%">
							<div style="float: left;">
								<i class="fa fa-home fa-2x" aria-hidden="true"
									style="background: #0085a1; padding: 1px; color: white; cursor: pointer;" onclick="goCardHomepage('${list.homepageURL}')"></i>
							</div>
							<div style="height: 20px; clear: both;"></div>
							<div style="float: left;">
								<i class="fa fa-plus fa-2x" aria-hidden="true"
									style="background: white; padding: 1px; color: #0085a1;"></i>
							</div>
						</div>
						<div style="height: 15px; clear: both;"></div>
						<div class="card-detail-menu-area">
							<div class="click-card-info-area"
								style="color: #0085a1; font-size: 12pt; font-style: bold; display: inline-block; margin-right: 60px; cursor: pointer;">
								<b>카드 정보</b>
							</div>
							<div class="click-benefit-info-area"
								style="color: #7b7b7b; font-size: 12pt; font-style: bold; display: inline-block; cursor: pointer;">
								<b>혜택 정보</b>
							</div>
						</div>
						<div style="height: 10px; clear: both;"></div>
						<div style="height: 10px; clear: both;"></div>

						<div class="card-info-area">
							<div class="card-detail-subtitle">
								<b>연회비</b>
							</div>
							<div style="height: 15px; clear: both;"></div>
							<div class="card-detail-subcontent">
								<c:choose>
									<c:when test="${ not empty list.annualFee }">
										<c:forEach items="${ list.annualFee }" var="annualFee"
											varStatus="status">
											<div style="display: inline-block; margin-right: 3%;">${ annualFee.brand  }</div>
											<div style="display: inline-block;">
												<b><fmt:formatNumber value="${ annualFee.fee }"
														groupingUsed="true" /></b> &nbsp;원
											</div>
										</c:forEach>
									</c:when>
									<c:otherwise>
										<div>이 상품은 연회비가 없습니다.</div>
									</c:otherwise>
								</c:choose>
							</div>
							<div style="height: 10px; clear: both;"></div>
							<hr>
							<div style="height: 10px; clear: both;"></div>
							<div class="card-detail-subtitle">
								<b>통합할인한도</b>
							</div>
							<div style="height: 15px; clear: both;"></div>
							<div class="card-detail-subcontent" style="width: 80%;">
								<c:choose>
									<c:when test="${ not empty list.limitBenefit }">
										<c:forEach items="${ list.limitBenefit }" var="limitBenefit"
											varStatus="status">
											<div
												style="display: inline-block; margin-right: 3%; width: 50%;">
												지난 달 카드&nbsp; <strong><fmt:formatNumber
														value="${ limitBenefit.prevPerformance }"
														groupingUsed="true" /></strong>&nbsp;원 사용 시
											</div>
											<div style="display: inline-block;">
												<strong><fmt:formatNumber
														value="${ limitBenefit.maxBenefit }" groupingUsed="true" /></strong>&nbsp;원
											</div>
											<div style="height: 0px; clear: both;"></div>
										</c:forEach>
									</c:when>
									<c:otherwise>
										<div>이 상품은 통합할인한도가 없습니다.</div>
									</c:otherwise>
								</c:choose>
							</div>
							<div style="height: 10px; clear: both;"></div>
							<hr>
							<div style="height: 10px; clear: both;"></div>
							<div class="card-detail-subtitle">
								<b>특별서비스</b>
							</div>
							<div style="height: 15px; clear: both;"></div>
							<div class="card-detail-subcontent">
								<c:choose>
									<c:when test="${ not empty list.specialServices }">
										<c:forEach items="${ list.specialServices }"
											var="specialServices" varStatus="status">
											<div style="margin-right: 3%;">${ specialServices.category }</div>
											<c:forEach items="${specialServices.detail}" var="detail"
												varStatus="status">
												<div
													style="display: inline-block; margin-right: 3%; width: 50%">${ detail.detailCategory }</div>
												<c:forEach items="${ detail.serviceList }" var="serviceList"
													varStatus="status">
													<div style="display: inline-block; margin-right: 3%;">${serviceList.service }</div>
													<div style="display: inline-block; margin-right: 3%;">${serviceList.content }</div>
												</c:forEach>
											</c:forEach>
										</c:forEach>
									</c:when>
									<c:otherwise>
										<div>이 상품은 특별서비스가 제공되지 않습니다.</div>
									</c:otherwise>
								</c:choose>
							</div>
						</div>

						<div class="benefit-info-area">
							<c:forEach items="${ list.benefits }" var="benefits"
								varStatus="status">
								<div class="card-detail-subtitle">
									<b>${benefits.category }</b>
								</div>
								<div style="height: 10px; clear: both;"></div>
								<c:forEach items="${ benefits.brandList }" var="brandList"
									varStatus="status">
									<div class="card-detail-subcontent">
										<div style="color: black; font-weight: bold;">${brandList.brand}&nbsp;에서&nbsp;${ brandList.benefit }</div>
										<div
											style="color: #7b7b7b; font-size: 10pt; font-weight: bold;">
											지난 달 카드&nbsp;
											<fmt:formatNumber value="${ brandList.prevPerformance  }"
												groupingUsed="true" />
											원 이상 사용 시
										</div>
										<div style="color: #7b7b7b; font-size: 10pt;">${brandList.constraint }</div>
									</div>
									<div style="height: 10px; clear: both;"></div>
								</c:forEach>
								<div style="height: 10px; clear: both;"></div>
								<hr>
								<div style="height: 10px; clear: both;"></div>
							</c:forEach>
						</div>

						<div style="height: 30px; clear: both;"></div>
					</div>
				</div>

			</c:forEach>
			<div style="height: 30px; clear: both;"></div>
			<div id="paging-area-5" style="float: center; text-align: center;">



				<c:choose>
					<c:when test="${ pageNo mod 5 ne 0 }">
						<c:set var="pageStartNo" value="${ pageNo - pageNo mod 5}" />
						<c:set var="pageStartNo" value="${ pageStartNo + 1 }"></c:set>

						<c:choose>
							<c:when test="${ totalPageCnt < pageStartNo + 4 }">
								<c:set var="pageEndNo" value="${ totalPageCnt }" />
							</c:when>
							<c:otherwise>
								<c:set var="pageEndNo" value="${ pageStartNo + 4 }" />
							</c:otherwise>
						</c:choose>

					</c:when>
					<c:otherwise>
						<c:set var="pageStartNo" value="${ pageNo - 4 }"></c:set>
						<c:set var="pageEndNo" value="${ pageNo }"></c:set>
					</c:otherwise>
				</c:choose>

				<c:if test="${ pageStartNo ne 1 }">
					<i id="${ pageStartNo - 5 }" class="fa fa-chevron-left"
						aria-hidden="true" onclick="goPage(this)"></i>
				</c:if>

				<c:forEach begin="${pageStartNo}" end="${ pageEndNo }" var="no"
					varStatus="status">
					<c:choose>
						<c:when test="${ pageNo eq no }">
							<span id="${no}" class="paging-active" onclick="goPage(this)">${no}</span>
						</c:when>
						<c:otherwise>
							<span id="${no}" class="paging-disabled" onclick="goPage(this)">${no}</span>
						</c:otherwise>
					</c:choose>




				</c:forEach>

				<c:if test="${ pageEndNo + 1 < totalPageCnt }">
					<i id="${ pageEndNo + 1 }" class="fa fa-chevron-right"
						aria-hidden="true" onclick="goPage(this)"></i>
				</c:if>

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