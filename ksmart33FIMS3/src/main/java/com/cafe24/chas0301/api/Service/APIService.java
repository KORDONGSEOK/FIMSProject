package com.cafe24.chas0301.api.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.cafe24.chas0301.vo.ApiVo;

@Service
public class APIService {

	
	public ApiVo call(ApiVo apiVo) throws IOException {
		String urlStr = "http://api.visitkorea.or.kr/openapi/service/rest/RusService/";
		String sevicekey = "ZHe7knpFjmDZZ%2B1WbSjdX6Tk2m3J62sy9nh4s0uObfESC7biJOnf3QyibxQPTIjTNfiOcA4MIzdSIkZmze96zg%3D%3D";
		String json = "&_type=json";
		BufferedReader bf;
		
		
		switch (apiVo.getType()) {
		case "detailCommon"://공통정보조회
			
			break;

		case "detailImage"://이미지정보조회
					
			break;
		
		case "detailIntro"://소개정보조회
			
			break;
		
		case "detailInfo"://반복정보조회
			
			break;
		
		case "locationBasedList"://	위치기반 관광정보조회
			
			break;
		
		case "areaBasedList"://지역기반 관광정보조회
			
			break;
		
		case "searchStay"://숙박정보조회
			
			break;
		
		case "searchFestival"://행사정보조회
			
			break;
		
		case "searchKeyword"://키워드조회
			
			break;
		
		case "categoryCode"://서비스분류코드조회
			
			break;
		
		case "areaCode"://지역코드조회
			
			break;
		
						
		default:
			break;
		}
		
		URL url = new URL(urlStr);
		
		bf = new BufferedReader(new InputStreamReader(url.openStream()));
		
		
		
		return apiVo;
		
	}
	
}
