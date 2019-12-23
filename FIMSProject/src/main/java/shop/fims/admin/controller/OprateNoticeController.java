package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OprateNoticeController {

	@GetMapping("/oprateSelectNotice")
	public String oprateSystemManageView() {
		return "/oprate/oprateSelectNotice";
		
	}
}
