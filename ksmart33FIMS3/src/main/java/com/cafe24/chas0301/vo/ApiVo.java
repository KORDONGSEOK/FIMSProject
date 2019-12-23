package com.cafe24.chas0301.vo;

public class ApiVo {

	String type;
	
	// http://api.visitkorea.or.kr/openapi/service/rest/RusService/detailCommon
	//공통정보조회 detailCommon 
	String 	serviceKey; //공공데이터포털에서 발급받은 인증키
	
	String 	numOfRows; //한 페이지 결과 수
	
	String 	pageNo;	//현재 페이지 번호
	
	String 	mobileOS; //IOS(아이폰),AND(안드로이드),WIN(원도우폰),ETC
	
	String	mobileApp; //서비스명=어플명
	
	String	contentId; //콘텐츠 ID
	
	String	contentTypeId; //관광타입(관광지, 숙박 등) ID
	
	String	defaultYN; //기본정보 조회여부
	
	String	firstImageYN; //원본, 썸네일 대표이미지 조회여부
	
	String	areacodeYN; //지역코드,시군구코드 조회여부
	
	String	catcodeYN; //	대,중,소 분류코드 조회여부
	
	String	addrinfoYN; //주소, 상세주소 조회여부
	
	String	mapinfoYN; //좌표 X,Y 조회여부
	
	String	overviewYN; //콘텐츠 개요 조회여부
	
	String	transGuideYN; //길안내조회
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/detailImage
	//이미지정보조회 detailImage
	
	String imageYN; //Y=콘텐츠 이미지 조회, N='음식점'타입의 음식메뉴 이미지
	
	String subImageYN; //Y=원본,썸네일 이미지 조회 N=Null
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/detailIntro
	//소개정보조회 detailIntro
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/detailInfo
	//반복정보조회 detailInfo
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/locationBasedList
	//	위치기반 관광정보조회 locationBasedList
	String	listYN; //목록 구분(Y=목록, N=개수)
	
	String	arrange; //(A=제목순, B=조회순, C=수정일순, D=생성일순, E=거리순)
	
	String mapX; //GPS X좌표(WGS84 경도 좌표)
	
	String	mapY; //	GPS Y좌표(WGS84 위도 좌표)
	
	String radius; //거리반경(단위:m) Max값 20000m=20Km
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/areaBasedList
	//지역기반 관광정보조회 areaBasedList
	
	String areaCode; //지역코드
	
	String sigunguCode; //시군구코드(areaCode 필수)
	
	String cat1; //대분류 코드
	
	String cat2; //중분류 코드(cat1 필수)
	
	String cat3; //소분류 코드(cat1,cat2 필수)
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/searchStay
	//숙박정보조회 searchStay
	String hanOk; //한옥여부
	String benikia; //베니키아여부
	String goodStay; //굿스테이여부
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/searchFestival
	//행사정보조회 searchFestival
	
	String eventStartDate; //행사 시작일(형식:YYYYMMDD)
	String eventEndDate; //행사 종료일(형식:YYYYMMDD)
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/searchKeyword
	//키워드조회 searchKeyword
	String keyword; //검색 요청할 키워드
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/categoryCode
	//서비스분류코드조회 categoryCode
	
	//http://api.visitkorea.or.kr/openapi/service/rest/RusService/areaCode
	//지역코드조회 areaCode

	
	
	
	
}
