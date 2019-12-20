package com.cafe24.chas0301.fims.contract;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivateContractController {

	@GetMapping("/adminisview/festival_contract/privateContractView")
	public String PrivateContractView() {
		return "adminisview/festival_contract/privateContractView";
	}
}
