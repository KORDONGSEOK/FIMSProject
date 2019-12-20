package com.cafe24.chas0301.fims.statistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountAnalysisController {

	@GetMapping("/adminisview/statistics/accountAnalysisView")
	public String AccountAnalysisView() {
		return "adminisview/statistics/accountAnalysisView";
	}
}
