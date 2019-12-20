package com.cafe24.chas0301.fims.budget;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevenueExecutionController {

	@GetMapping("/adminisview/festival_budget/revenueExecutionView")
	public String RevenueExecutionView() {
		return "adminisview/festival_budget/revenueExecutionView";
	}
}
