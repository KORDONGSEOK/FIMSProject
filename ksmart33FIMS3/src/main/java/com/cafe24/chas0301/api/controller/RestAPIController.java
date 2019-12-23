package com.cafe24.chas0301.api.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.chas0301.api.Service.APIService;
import com.cafe24.chas0301.vo.ApiVo;

@RestController
public class RestAPIController {
	
	@Autowired APIService apiService;
	
	
	@RequestMapping(value ="/api/{type}")
	public ApiVo apiCall(@PathVariable String type,@RequestBody ApiVo apiVo) throws IOException{
		
		return apiService.call(apiVo);		
	}
}
