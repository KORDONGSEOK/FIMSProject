package shop.fims.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.GoodsMapper;
import shop.fims.vo.GoodsVo;

@Service
public class GoodsService {
	
	@Autowired private GoodsMapper goodsMapper;
	
	public List<GoodsVo> getgoodslist(){
		return goodsMapper.getgoodslist();
	}

}
