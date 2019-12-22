package shop.fims.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.GoodsVo;

@Mapper
public interface GoodsMapper {
	
	//물품 전체 리스트
	public List<GoodsVo> getgoodslist();

}
