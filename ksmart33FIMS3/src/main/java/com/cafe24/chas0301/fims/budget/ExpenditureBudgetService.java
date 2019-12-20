package com.cafe24.chas0301.fims.budget;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.chas0301.fims.vo.RevExpBudget;

@Service
public class ExpenditureBudgetService {

	@Autowired ExpenditureBudgetMapper expenditurebudgetmapper;
	
	public List<RevExpBudget> selectExpenditureBudget(){
		
		return expenditurebudgetmapper.selectExpenditureBudget();
		
	}
}
