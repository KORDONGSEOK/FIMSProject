package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstimateControllor {

	//전체심사
	@GetMapping("/estimatelist")
	public String estimatelist() {
		return "/estimate/estimatelist";		
	}
	//심사표 
	@GetMapping("/reviewindicater")
	public String insertindex(Model model) {
		return "/estimate/reviewindicater";
	
	}
	//완료심사	
	@GetMapping("/finalestimatelist")
	public String finalsetimatlist() {
		return "/estimate/finalestimatelist";
	}
}
