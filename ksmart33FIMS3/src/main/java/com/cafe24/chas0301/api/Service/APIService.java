package com.cafe24.chas0301.api.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.cafe24.chas0301.vo.ApiVo;

@Service
public class APIService {

	public JSONObject call(ApiVo apiVo) throws IOException, ParseException {

		String addr = "http://api.visitkorea.or.kr/openapi/service/rest/RusService/";
		String sevicekey = "?"
				+ "ServiceKey=ZHe7knpFjmDZZ%2B1WbSjdX6Tk2m3J62sy9nh4s0uObfESC7biJOnf3QyibxQPTIjTNfiOcA4MIzdSIkZmze96zg%3D%3D";
		String parameter = "";

		switch (apiVo.getType()) {
		case "detailCommon":// 공통정보조회

			
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows(); 
  			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo(); 
  			parameter = parameter + "&" +  "MobileOS=" + apiVo.getMobileOS(); 
  			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp(); 
  			parameter = parameter + "&" + "contentId=" + apiVo.getContentId(); 
  			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId(); 
  			parameter = parameter + "&" + "defaultYN=" + apiVo.getDefaultYN(); 
  			parameter = parameter + "&" + "firstImageYN=" + apiVo.getFirstImageYN(); 
			parameter = parameter + "&" + "areacodeYN=" + apiVo.getAreacodeYN(); 
  			parameter = parameter + "&" + "catcodeYN=" + apiVo.getCatcodeYN(); 
  			parameter = parameter + "&" + "addrinfoYN=" + apiVo.getAddrinfoYN(); 
  			parameter = parameter + "&" + "mapinfoYN=" + apiVo.getMapinfoYN(); 
  			parameter = parameter + "&" + "overviewYN=" + apiVo.getOverviewYN(); 
  			parameter = parameter + "&" + "transGuideYN=" + apiVo.getTransGuideYN(); 
  			parameter = parameter + "&" + "_type=json";
			 

			/*//TEST
			 * parameter = parameter + "&" + "numOfRows=" + "10"; parameter = parameter +
			 * "&" + "pageNo=" + "1"; parameter = parameter + "&" + "MobileOS=" + "ETC";
			 * parameter = parameter + "&" + "MobileApp=" + "AppTest"; parameter = parameter
			 * + "&" + "contentId=" + 336061; parameter = parameter + "&" + "contentTypeId="
			 * + 76; parameter = parameter + "&" + "defaultYN=" + "Y"; parameter = parameter
			 * + "&" + "firstImageYN=" + "Y"; parameter = parameter + "&" + "areacodeYN=" +
			 * "Y"; parameter = parameter + "&" + "catcodeYN=" + "Y"; parameter = parameter
			 * + "&" + "addrinfoYN=" + "Y"; parameter = parameter + "&" + "mapinfoYN=" +
			 * "Y"; parameter = parameter + "&" + "overviewYN=" + "Y"; parameter = parameter
			 * + "&" + "transGuideYN=" + "Y"; parameter = parameter + "&" + "_type=json";
			 */

			break;

		case "detailImage":// 이미지정보조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			parameter = parameter + "&" + "imageYN=" + apiVo.getImageYN();
			parameter = parameter + "&" + "subImageYN=" + apiVo.getSubImageYN();

			parameter = parameter + "&" + "_type=json";
			break;

		case "detailIntro":// 소개정보조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();

			parameter = parameter + "&" + "_type=json";
			break;

		case "detailInfo":// 반복정보조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "contentId=" + apiVo.getContentId();
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();

			parameter = parameter + "&" + "_type=json";
			break;

		case "locationBasedList":// 위치기반 관광정보조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "listYN=" + apiVo.getListYN();
			parameter = parameter + "&" + "arrange=" + apiVo.getArrange();
			if (apiVo.getContentTypeId() != null)
				parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			parameter = parameter + "&" + "mapX=" + apiVo.getMapX();
			parameter = parameter + "&" + "mapY=" + apiVo.getMapY();
			parameter = parameter + "&" + "radius=" + apiVo.getRadius();

			parameter = parameter + "&" + "_type=json";
			break;

		case "areaBasedList":// 지역기반 관광정보조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "listYN=" + apiVo.getListYN();
			parameter = parameter + "&" + "arrange=" + apiVo.getArrange();
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			if (apiVo.getCat1() != null) {
				parameter = parameter + "&" + "cat1=" + apiVo.getCat1();
				if (apiVo.getCat1() != null) {
					parameter = parameter + "&" + "cat2=" + apiVo.getCat2();
					if (apiVo.getCat1() != null)
						parameter = parameter + "&" + "cat3=" + apiVo.getCat3();
				}
			}
			parameter = parameter + "&" + "_type=json";
			break;

		case "searchStay":// 숙박정보조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "listYN=" + apiVo.getListYN();
			parameter = parameter + "&" + "arrange=" + apiVo.getArrange();
			if (apiVo.getAreaCode() != null)
				parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			if (apiVo.getSigunguCode() != null)
				parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			if (apiVo.getHanOk() != null)
				parameter = parameter + "&" + "hanOk=" + apiVo.getHanOk();
			if (apiVo.getBenikia() != null)
				parameter = parameter + "&" + "benikia=" + apiVo.getBenikia();
			if (apiVo.getGoodStay() != null)
				parameter = parameter + "&" + "goodStay=" + apiVo.getGoodStay();
			parameter = parameter + "&" + "_type=json";
			break;

		case "searchFestival":// 행사정보조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "listYN=" + apiVo.getListYN();
			parameter = parameter + "&" + "arrange=" + apiVo.getArrange();
			if (apiVo.getAreaCode() != null)
				parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			if (apiVo.getSigunguCode() != null)
				parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			parameter = parameter + "&" + "eventStartDate=" + apiVo.getEventStartDate();
			parameter = parameter + "&" + "eventEndDate=" + apiVo.getEventEndDate();
			parameter = parameter + "&" + "_type=json";
			break;

		case "searchKeyword":// 키워드조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "listYN=" + apiVo.getListYN();
			parameter = parameter + "&" + "arrange=" + apiVo.getArrange();
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			if (apiVo.getAreaCode() != null)
				parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			if (apiVo.getSigunguCode() != null)
				parameter = parameter + "&" + "sigunguCode=" + apiVo.getSigunguCode();
			if (apiVo.getCat1() != null) {
				parameter = parameter + "&" + "cat1=" + apiVo.getCat1();
				if (apiVo.getCat1() != null) {
					parameter = parameter + "&" + "cat2=" + apiVo.getCat2();
					if (apiVo.getCat1() != null)
						parameter = parameter + "&" + "cat3=" + apiVo.getCat3();
				}
			}
			parameter = parameter + "&" + "keyword=" + apiVo.getKeyword();
			parameter = parameter + "&" + "_type=json";
			break;

		case "categoryCode":// 서비스분류코드조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "contentTypeId=" + apiVo.getContentTypeId();
			if (apiVo.getCat1() != null) {
				parameter = parameter + "&" + "cat1=" + apiVo.getCat1();
				if (apiVo.getCat1() != null) {
					parameter = parameter + "&" + "cat2=" + apiVo.getCat2();
					if (apiVo.getCat1() != null)
						parameter = parameter + "&" + "cat3=" + apiVo.getCat3();
				}
			}
			parameter = parameter + "&" + "_type=json";
			break;

		case "areaCode":// 지역코드조회
			parameter = parameter + "&" + "numOfRows=" + apiVo.getNumOfRows();
			parameter = parameter + "&" + "pageNo=" + apiVo.getPageNo();
			parameter = parameter + "&" + "MobileOS=" + apiVo.getMobileOS();
			parameter = parameter + "&" + "MobileApp=" + apiVo.getMobileApp();
			parameter = parameter + "&" + "areaCode=" + apiVo.getAreaCode();
			parameter = parameter + "&" + "_type=json";
			break;

		default:
			break;
		}

		String line = "";
		String result = "";

		URL url = new URL(addr = addr + apiVo.getType() + sevicekey + parameter);
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		while ((line = br.readLine()) != null) {
			result = result.concat(line);
		}

		br.close();

		System.out.println(result);

		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(result);

		return obj;

	}

}
