package com.cafe24.chas0301.fims.budget;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.chas0301.fims.vo.RevExpBudget;

@Controller
public class ExpenditureBudgetController {

	@Autowired ExpenditureBudgetService expenditurebudgetservice;
	
	@GetMapping("/adminisview/festival_budget/expenditureBudgetView")
	public String ExpenditureBudgetView(Model model) {
		List<RevExpBudget> list = expenditurebudgetservice.selectExpenditureBudget();
		
		model.addAttribute("budgetlist", list);
		
		return "adminisview/festival_budget/expenditureBudgetView";
	}
	

}
