package shop.fims.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Committee;

@Mapper
public interface CommitteeMapper {
	
	//모든 위원회 관리
	public List<Committee> selectAllCommitteeView();
	
	//위원회 등록
	public int insertAllCommittee(Committee committee);
	
	//위원회 삭제
	public int deleteAllCommittee(Committee committee);
	
	//위원회 수정화면. 위원회 코드로 조회
	public Committee selectByAllCommittee(String man_com_cd);

}
