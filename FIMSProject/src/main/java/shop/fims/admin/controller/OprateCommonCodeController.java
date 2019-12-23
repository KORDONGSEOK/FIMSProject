package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OprateCommonCodeController {

	@GetMapping("/oprateSelectCommonCode")
	public String oprateSystemManageView() {
		return "/oprate/oprateSelectCommonCode";
		
	}
}
