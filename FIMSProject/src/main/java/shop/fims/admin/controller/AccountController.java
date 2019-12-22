package shop.fims.admin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AccountService;


@Controller
public class AccountController {

	@Autowired AccountService accountService;
	
	//거래처 회원 관리
	@GetMapping("/adminisview/account/accountMemberView")
	public String AccountMember() {
		return "adminisview/account/accountMemberView";
	}
	
	//거래처 회원 등록
	@GetMapping("/insertAccountMember")
	public String InsertAccountMember() {
		return "/account/insertAccountMember";
	}
	
	//거래처 회원 수정
	@GetMapping("/updateAccountMember")
	public String UpdateAccountMember() {
		return "/account/updateAccountMember";
	}
	
	//모든 거래처 관리
	@GetMapping("/adminisview/account/allAccountView")
	public String AllAccountView(Model model) {
		model.addAttribute("allAccountView", accountService.selectAllAccountView());
		return "adminisview/account/allAccountView";
	}
	
	//모든 거래처 등록
	@GetMapping("/insertAllAccount")
	public String InsertAllAccount() {
		return "/account/insertAllAccount";
	}
	
	//모든 거래처 수정
	@GetMapping("/updateAllAccount")
	public String UpdateAllAccount() {
		return "/account/updateAllAccount";
	}
	
	//승인된 거래처 관리
	@GetMapping("/approvalAccountView")
	public String ApprovalAccountView() {
		return "/account/approvalAccountView";
	}
	
	//승인된 거래처 등록
	@GetMapping("/insertApprovalAccount")
	public String InsertApprovalAccount() {
		return "/account/insertApprovalAccount";
	}
	
	//승인된 거래처 수정
	@GetMapping("/updateApprovalAccount")
	public String UpdateApprovalAccount() {
		return "/account/updateApprovalAccount";
	}	
}
