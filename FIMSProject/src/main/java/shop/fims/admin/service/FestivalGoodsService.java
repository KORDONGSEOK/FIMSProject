package shop.fims.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.FestivalGoodsMapper;
import shop.fims.vo.FestivalGoodsIn;
import shop.fims.vo.FestivalGoodsOut;
import shop.fims.vo.GoodsLDiv;
import shop.fims.vo.GoodsMDiv;
import shop.fims.vo.GoodsSDiv;

@Service
public class FestivalGoodsService {
	
	@Autowired 
	private FestivalGoodsMapper festivalGoodsMapper;
	
	
	  public List<FestivalGoodsOut> selectAllGoodsOut(){ 
		  return festivalGoodsMapper.selectAllGoodsOut(); 
		  }
	  
	  public List<FestivalGoodsIn> selectAllGoodsIn(){ 
		  return festivalGoodsMapper.selectAllGoodsIn(); 
		  }
	 
	
	//축제물품대분류조회
	public List<GoodsLDiv> selectAllLDiv(){
		return festivalGoodsMapper.selectAllLDiv();
	}
	//축제물품중분류조회
	public List<GoodsMDiv> selectAllMDiv(){
		return festivalGoodsMapper.selectAllMDiv();
	}
	//축제물품소분류조회
	public List<GoodsSDiv> selectAllSDiv(){
		return festivalGoodsMapper.selectAllSDiv();
	}

}
