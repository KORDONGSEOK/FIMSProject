package com.cafe24.chas0301.fims.budget;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevenueBudgetController {

	@GetMapping("/adminisview/festival_budget/revenueBudgetView")
	public String ExpenditureBudgetView() {
		return "adminisview/festival_budget/revenueBudgetView";
	}
}
