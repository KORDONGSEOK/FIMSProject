package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {
	
	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name contractList
	 * @brief 모든계약리스트 화면
	 * @author ksmart33 김동석
	 * @return adminisview/contract/contractList
	 */
	@GetMapping("/adminisview/contract/contractList")
	public String contractList() {
		System.out.println("---모든계약리스트 화면 : contractList 메서드 ContractController.java---");
		return "adminisview/contract/contractList";
	}
	
	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name orderingPlanView
	 * @brief 수의계약->발주계획
	 * @author ksmart33 김동석
	 * @return adminisview/contract/orderingPlanView
	 */
	@GetMapping("/adminisview/contract/orderingPlanView")
	public String orderingPlanView() {
		System.out.println("---수의계약->발주계획 : orderingPlanView 메서드 ContractController.java---");
		return "adminisview/contract/orderingPlanView";
	}

	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name privateContractView
	 * @brief 수의계약현황
	 * @author ksmart33 김동석
	 * @return adminisview/contract/privateContractView
	 */
	@GetMapping("/adminisview/contract/privateContractView")
	public String privateContractView() {
		System.out.println("---수의계약현황 : privateContractView 메서드 ContractController.java---");
		return "adminisview/contract/privateContractView";
	}
	
	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name contractComReceipt
	 * @brief 수의계약->계약희망업체접수
	 * @author ksmart33 김동석
	 * @return adminisview/contract/contractComReceipt
	 */
	@GetMapping("/adminisview/contract/contractComReceipt")
	public String contractComReceipt() {
		System.out.println("---수의계약->계약희망업체접수 : contractComReceipt 메서드 ContractController.java---");
		return "adminisview/contract/contractComReceipt";
	}
	
	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name generalContractOrdPlan
	 * @brief 일반계약->발주계획
	 * @author ksmart33 김동석
	 * @return adminisview/contract/generalContractOrdPlan
	 */
	@GetMapping("/adminisview/contract/generalContractOrdPlan")
	public String generalContractOrdPlan() {
		System.out.println("---일반계약->발주계획 : generalContractOrdPlan 메서드 ContractController.java---");
		return "adminisview/contract/generalContractOrdPlan";
	}
	
	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name generalContractView
	 * @brief 일반계약현황
	 * @author ksmart33 김동석
	 * @return adminisview/contract/generalContractView
	 */
	@GetMapping("/adminisview/contract/generalContractView")
	public String generalContractView() {
		System.out.println("---일반계약현황 : generalContractView 메서드 ContractController.java---");
		return "adminisview/contract/generalContractView";
	}
}
