package shop.fims.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Account;

@Mapper
public interface AccountMapper {

	public List<Account> selectAllAccountView();
}
