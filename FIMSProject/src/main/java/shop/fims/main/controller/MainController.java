package shop.fims.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name adminisdefault
	 * @brief 관리자초기화면
	 * @author ksmart33 김동석
	 * @return index
	 */
	@GetMapping("/")
	public String adminisdefault() {
		System.out.println("---관리자초기화면 : adminisdefault MainController.java-------");
		return "index";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name dashboard
	 * @brief 관리자메인화면
	 * @author ksmart33 김동석
	 * @return adminisview/dashboard
	 */
	@GetMapping("/adminisview/dashboard")
	public String dashboard() {
		System.out.println("---관리자메인화면 : dashboard MainController.java-------");
		return "adminisview/dashboard";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name gukmindefault
	 * @brief 국민초기화면
	 * @author ksmart33 김동석
	 * @return gukminview/gukminblank
	 */
	@GetMapping("/gukminview/gukminblank")
	public String gukmindefault() {
		System.out.println("---국민초기화면 : gukmindefault MainController.java-------");
		return "gukminview/gukminblank";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name gukminmainview
	 * @brief 국민메인화면
	 * @author ksmart33 김동석
	 * @return gukminview/index
	 */
	@GetMapping("/gukminview/index")
	public String gukminmainview() {
		System.out.println("---국민메인화면 : gukminmainview MainController.java-------");
		return "gukminview/index";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name projectintro
	 * @brief 축제통합관리시스템 프로젝트 및 팀원 소개 화면
	 * @author ksmart33 김동석
	 * @return fimsproject/projectintro
	 */
	@GetMapping("/fimsproject/projectintro")
	public String projectintro() {
		System.out.println("---프로젝트 및 팀원 소개 화면 : projectintro MainController.java-------");
		return "fimsproject/projectintro";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name commonlogin
	 * @brief 공통로그인화면(공무원/거래처/국민)
	 * @author ksmart33 김동석
	 * @return login/login
	 */
	@GetMapping("/login/login")
	public String commonlogin() {
		System.out.println("---공통로그인화면(공무원/거래처/국민) : commonlogin MainController.java-------");
		return "login/login";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name allprofile
	 * @brief 관리자모드로 로그인된 프로필화면(권한 : 공무원/거래처)
	 * @author ksmart33 김동석
	 * @return adminisview/adminisprofile/allprofile
	 */
	@GetMapping("/adminisview/adminisprofile/allprofile")
	public String allprofile() {
		System.out.println("---관리자모드로 로그인된 프로필화면(권한 : 공무원/거래처) : allprofile MainController.java-------");
		return "adminisview/adminisprofile/allprofile";
	}


}
