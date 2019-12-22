package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppFormController {

	//용역신청서 관리
	@GetMapping("/serviceAppFormView")
	public String ServiceAppFormView() {
		return "/applicationform/serviceAppFormView";
	}
	
	//용역신청서 등록
	@GetMapping("/insertServiceAppForm")
	public String InsertServiceAppForm() {
		return "/applicationform/serviceAppFormView";
	}
	
	//용역신청서 수정
	@GetMapping("/updateServiceAppForm")
	public String UpdateServiceAppForm() {
		return "/applicationform/updateServiceAppForm";
	}
	
	//부스신청서 관리
	@GetMapping("/boothAppFormView")
	public String BoothAppFormView() {
		return "/applicationform/boothAppFormView";
	}
	 
	//부스신청서 등록
	@GetMapping("/insertBoothAppForm")
	public String InsertBoothAppForm() {
		return "/applicationform/insertBoothAppForm";
	}
	
	//부스신청서 수정
	@GetMapping("/updateBoothAppForm")
	public String UpdateBoothAppForm() {
		return "/applicationform/updateBoothAppForm";
	}
	
	//자원봉사신청서 관리
	@GetMapping("/volunteerAppFormView")
	public String VolunteerAppFormView() {
		return "/applicationform/volunteerAppFormView";
	}
	
	//자원봉사신청서 등록
	@GetMapping("/insertVolunteerAppForm")
	public String InsertVolunteerAppForm() {
		return "/applicationform/insertVolunteerAppForm";
	}
	
	//자원봉사신청서 수정
	@GetMapping("/updateVolunteerAppForm")
	public String UpdateVolunteerAppForm() {
		return "/applicationform/updateVolunteerAppForm";
	}
	
	//위원회신청서 관리
	@GetMapping("/committeeAppFormView")
	public String CommitteeAppFormView() {
		return "/applicationform/committeeAppFormView";
	}
	
	//위원회신청서 등록
	@GetMapping("/insertCommitteeAppForm")
	public String InsertCommitteeAppForm() {
		return "/applicationform/insertCommitteeAppForm";
	}
	//위원회신청서 수정
	@GetMapping("/updateCommitteeAppForm")
	public String UpdateCommitteeAppForm() {
		return "/applicationform/updateCommitteeAppForm";
	}
}
