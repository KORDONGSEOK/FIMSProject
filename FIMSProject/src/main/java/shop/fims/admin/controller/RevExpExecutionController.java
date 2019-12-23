package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevExpExecutionController {

	/**
	 * @param 없음
	 * @file RevExpBudgetController.java
	 * @name revExpBudgetList
	 * @brief 세입·세출집행 리스트
	 * @author ksmart33 김동석
	 * @return adminisview/budget/revExpExecutionList
	 */
	@GetMapping("/adminisview/budget/revExpExecutionList")
	public String revExpExecutionList() {
		System.out.println("---세입·세출집행리스트: revExpBudgetList 메서드 RevExpExecutionController.java---");
		return "adminisview/budget/revExpExecutionList";
	}
}
