package com.cafe24.chas0301.fims.statistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalEvaluationAnalysisController {

	@GetMapping("/adminisview/statistics/festivalEvaluationAnalysisView")
	public String FestivalEvaluationAnalysisView() {
		return "adminisview/statistics/festivalEvaluationAnalysisView";
	}
}
