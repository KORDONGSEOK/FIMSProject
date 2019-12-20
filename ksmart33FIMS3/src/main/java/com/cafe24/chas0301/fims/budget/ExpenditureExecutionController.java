package com.cafe24.chas0301.fims.budget;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpenditureExecutionController {
	
	@GetMapping("/adminisview/festival_budget/expenditureExecutionView")
	public String ExpenditureExecutionView() {
		return "adminisview/festival_budget/expenditureExecutionView";
	}
	
}
