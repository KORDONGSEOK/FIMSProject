package com.cafe24.chas0301.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	/**
	 * @file MainController.java
	 * @name adminisdefault
	 * @brief 관리자초기화면
	 * @author ksmart33 김동석
	 * @return index
	 */
	@GetMapping("/")
	public String adminisdefault() {
		
		return "index";
	}
	
	/**
	 * @file MainController.java
	 * @name dashboard
	 * @brief 관리자 메인화면
	 * @author ksmart33 김동석
	 * @return adminisview/dashboard
	 */
	@GetMapping("/adminisview/dashboard")
	public String dashboard() {
		
		return "adminisview/dashboard";
	}
	
	/**
	 * @file MainController.java
	 * @name festivalmainview
	 * @brief 국민 메인화면
	 * @author ksmart33 김동석
	 * @return festivalview/index
	 */
	@GetMapping("/festivalview/index")
	public String festivalmainview() {
		
		return "festivalview/index";
	}
	
	/**
	 * @file MainController.java
	 * @name projectintro
	 * @brief 축제통합관리시스템 프로젝트 및 팀원 소개 화면
	 * @author ksmart33 김동석
	 * @return fimsproject/projectintro
	 */
	@GetMapping("/fimsproject/projectintro")
	public String projectintro() {
		
		return "fimsproject/projectintro";
	}
	
	/**
	 * @file MainController.java
	 * @name commonlogin
	 * @brief 공통 로그인화면(공무원/거래처/국민)
	 * @author ksmart33 김동석
	 * @return login/login
	 */
	@GetMapping("/login/login")
	public String commonlogin() {
		
		return "login/login";
	}
	
	/**
	 * @file MainController.java
	 * @name allprofile
	 * @brief 관리자모드로 로그인된 프로필화면(권한 : 공무원/거래처)
	 * @author ksmart33 김동석
	 * @return adminisview/adminisprofile/allprofile
	 */
	@GetMapping("/adminisview/adminisprofile/allprofile")
	public String allprofile() {
		
		return "adminisview/adminisprofile/allprofile";
	}


}
