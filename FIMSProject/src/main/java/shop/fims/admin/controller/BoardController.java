package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	//공지사항 관리
	@GetMapping("/boardList")
	public String BoardList() {
		return "board/boardList";
	}

}
