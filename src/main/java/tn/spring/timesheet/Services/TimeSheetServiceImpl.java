package tn.spring.timesheet.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.timesheet.Repositories.TimeSheetRepository;
import tn.spring.timesheet.entities.TimeSheet;
@Service
public class TimeSheetServiceImpl implements ITimeSheetService {

	@Autowired
	TimeSheetRepository timesheetRepo;
	@Override
	public List<TimeSheet> retrieveAllTimeSheets() {
		return  (List<TimeSheet>) timesheetRepo.findAll();		
	}

	@Override
	public TimeSheet addTimeSheet(TimeSheet t) {
		return timesheetRepo.save(t); 
	}

	@Override
	public void deleteTimeSheet(int id) {
		timesheetRepo.deleteById(id);

	}

	@Override
	public TimeSheet updateTimeSheet(TimeSheet t) {
		return timesheetRepo.save(t); 

	}

	@Override
	public TimeSheet retrieveTimeSheet(int id) {
		TimeSheet t = timesheetRepo.findById(id).get();
		return t;
	}

}
