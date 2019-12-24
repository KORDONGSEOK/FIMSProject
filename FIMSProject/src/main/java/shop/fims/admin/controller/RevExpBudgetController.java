package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevExpBudgetController {

	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revExpBudgetView
	 * @brief 세입세출예산화면
	 * @author ksmart33 김동석
	 * @return adminisview/budget/revExpBudgetView
	 */
	@GetMapping("/adminisview/budget/revExpBudgetView")
	public String revExpBudgetView() {
		System.out.println("---세입세출예산화면 : revExpBudgetView 메서드 RevExpBudgetController.java---");
		return"adminisview/budget/revExpBudgetView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revExpBudgetList
	 * @brief 세입세출예산리스트
	 * @author ksmart33 김동석
	 * @return adminisview/budget/revExpBudgetList
	 */
	@GetMapping("/adminisview/budget/revExpBudgetList")
	public String revExpBudgetList() {
		System.out.println("---세입세출예산리스트 : revExpBudgetList 메서드 RevExpBudgetController.java---");
		return"adminisview/budget/revExpBudgetList";
	}
	
	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name ExpEntBudgetView
	 * @brief 세출현황 -> 사업 및 예산정보
	 * @author ksmart33 김동석
	 * @return adminisview/budget/expEntBudgetView
	 */
	@GetMapping("/adminisview/budget/expEntBudgetView")
	public String ExpEntBudgetView() {
		System.out.println("---세출현황 -> 사업 및 예산정보 : ExpEntBudgetView 메서드 RevExpBudgetController.java---");
		return"adminisview/budget/expEntBudgetView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revBudgetView
	 * @brief 세입현황
	 * @author ksmart33 김동석
	 * @return adminisview/budget/expEntBudgetView
	 */
	@GetMapping("/adminisview/budget/revBudgetView")
	public String revBudgetView() {
		System.out.println("---세입현황 : revBudgetView 메서드 RevExpBudgetController.java---");
		return"adminisview/budget/revBudgetView";
	}
}
