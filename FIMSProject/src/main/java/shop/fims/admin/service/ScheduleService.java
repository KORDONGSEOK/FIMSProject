package shop.fims.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.ScheduleMapper;
import shop.fims.vo.Schedule;

@Service
public class ScheduleService {
	
	@Autowired 
	private ScheduleMapper scheduleMapper;
	
	public List<Schedule> selectAllSchedule(){
		return scheduleMapper.selectAllSchedule();
		
	}

}
