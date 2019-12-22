package shop.fims.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.AccountMapper;
import shop.fims.vo.Account;


@Service
public class AccountService {

	@Autowired AccountMapper accountMapper;
	
	//모든 거래처 관리
	public List<Account> selectAllAccountView(){
		return accountMapper.selectAllAccountView();
	}
}
