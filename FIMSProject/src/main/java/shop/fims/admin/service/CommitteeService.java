package shop.fims.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.CommitteeMapper;
import shop.fims.vo.Committee;

@Service
public class CommitteeService {

	@Autowired CommitteeMapper committeeMapper;
	
	//위원회 조회
	public List<Committee> selectAllCommitteeView(){
		return committeeMapper.selectAllCommitteeView();
	}
	
	//위원회 등록
	public int insertAllCommittee(Committee committee) {
		return committeeMapper.insertAllCommittee(committee);
	}
	
	//위원회 삭제
	public int deleteAllCommittee(Committee committee) {
		return committeeMapper.deleteAllCommittee(committee);
	}
	
	//위원회 수정화면. 위원회 코드로 조회
	public Committee selectByAllCommittee(String man_com_cd) {
		return committeeMapper.selectByAllCommittee(man_com_cd);
	}
}
