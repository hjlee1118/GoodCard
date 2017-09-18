몽고DB 스키마
데이터베이스 : hana
컬렉션 : checkCard, creditCard, hybridCard

{
    "brand" = "카드회사",
    "cardType" = "체크카드 / 신용카드 / 하이브리드카드",
    "cardName" = "카드 이름",
    "annotation" = "카드 한줄 설명",
    "imagePath" = "카드 이미지 경로",
    "annualFee" : [ #연회비
        {
            "brand" : "브랜드",
            "fee" : "연회비"
        }, ...
    ],
    "limitBenefit" : [ #통합할인한도
        {
            "prevPerformance" : "혜택을 받기 위한 지난 달 카드 사용 금액"
            "maxBenefit" : "demand 금액 이상 사용시 받을 수 있는 혜택 한도"
        }
    ],
    "specialService" : [ # 특별서비스
        {
            "category" : "항목",
            "detail" : [
                "detailCategory" : "세부 항목"
                "serviceList" : [
                    {
                        "service" : "서비스 이름",
                        "content" : "서비스의 자세한 사항들"
                    }, ...
                ]
            ]
        }, ...
    ],
    "benefits" : [ # 혜택정보
        {
            "category" : "항목",
            "benefitList" : [
                {
                    "shop" : "가게 이름",
                    "benefit" : "할인금액 또는 할인율 또는 적립율",
                    "prevPerformance" : "해당 혜택을 받기 위한 지난 달 카드 사용 금액"
                    "constraint" : "1일 한도, 1달 한도 등등"
                }, ...
            ]
        }, ...
    ]
    "viewCount" : 0 # 조회수
}