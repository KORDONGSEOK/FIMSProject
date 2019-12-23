package shop.fims.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.PrDiv;
import shop.fims.vo.PrPromotion;

@Mapper
public interface PublicrelationsMapper {
	
	// 홍보코드로 상세조회
	public List<PrPromotion> selectByPmcd(String festpr_pro_cd);
	
	// 홍보상세조회
	public List<PrPromotion> selectAllPromotion();
	
	
	// 홍보분류조회
	public List<PrDiv> seletAllPrDiv();

}
