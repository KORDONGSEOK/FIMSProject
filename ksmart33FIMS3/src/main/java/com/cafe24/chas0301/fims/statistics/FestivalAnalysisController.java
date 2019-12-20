package com.cafe24.chas0301.fims.statistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalAnalysisController {

	@GetMapping("/adminisview/statistics/festivalAnalysisView")
	public String FestivalAnalysisView() {
		return "adminisview/statistics/festivalAnalysisView";
	}
}
