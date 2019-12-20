package com.cafe24.chas0301.fims.statistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalExecutionAnalysisController {

	@GetMapping("/adminisview/statistics/festivalExecutionAnalysisView")
	public String FestivalExecutionAnalysisView() {
		return "adminisview/statistics/festivalExecutionAnalysisView";
	}
}
