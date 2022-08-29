package tn.spring.timesheet.Services;

import java.util.List;

import tn.spring.timesheet.entities.TimeSheet;

public interface ITimeSheetService {
	List<TimeSheet> retrieveAllTimeSheets();

	TimeSheet addTimeSheet (TimeSheet t);

	void deleteTimeSheet (int id);

	TimeSheet updateTimeSheet(TimeSheet t);

	TimeSheet retrieveTimeSheet (int id);
}
