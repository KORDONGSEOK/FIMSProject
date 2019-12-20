package com.cafe24.chas0301.fims.statistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalBudgetAnalysisController {

	@GetMapping("/adminisview/statistics/festivalBudgetAnalysisView")
	public String FestivalBudgetAnalysisView() {
		return "adminisview/statistics/festivalBudgetAnalysisView";
	}
}
