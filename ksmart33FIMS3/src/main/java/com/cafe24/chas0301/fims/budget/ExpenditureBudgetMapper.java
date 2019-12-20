package com.cafe24.chas0301.fims.budget;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.chas0301.fims.vo.RevExpBudget;


@Mapper
public interface ExpenditureBudgetMapper {
	
	public List<RevExpBudget> selectExpenditureBudget();

}
