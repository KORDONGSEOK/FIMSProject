package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodsRevenue {

	//모든 축제별 보유물품 대여관리 리스트 - 세입관리
	@GetMapping("revenuelist")
	public String revenuelist() {
		return "/goods/revenuelist";
	}
}
