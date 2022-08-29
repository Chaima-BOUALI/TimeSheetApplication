package tn.spring.timesheet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.timesheet.Services.ITimeSheetService;
import tn.spring.timesheet.entities.TimeSheet;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/timesheet")
public class TimeSheetController {

	@Autowired 
	ITimeSheetService timesheetservices; 

	@PostMapping("/add-timesheet")
	@ResponseBody
	public TimeSheet addTimeSheet (@RequestBody TimeSheet t )
	{
		TimeSheet timesheet= timesheetservices.addTimeSheet(t);
	return timesheet;
	}

	@ResponseBody
	@GetMapping("/show-timesheet")
	public 	List<TimeSheet> retrieveAllTimeSheets(){
		return timesheetservices.retrieveAllTimeSheets();
	}
	@GetMapping("/show-timesheet/{timesheet-id}")
	@ResponseBody
	public TimeSheet retrieveTimeSheet(@PathVariable("timesheet-id") int id) {
		return timesheetservices.retrieveTimeSheet(id);
	}

	@PutMapping("/modify-timesheet")
	@ResponseBody
	public TimeSheet modifyTimeSheet(@RequestBody TimeSheet t) {
		return timesheetservices.updateTimeSheet(t);
	}

	
	@DeleteMapping("/removeTimeSheet/{timesheet-id}")
	@ResponseBody
	public void removeTimeSheet(@PathVariable("timesheet-id") int id) {
		timesheetservices.deleteTimeSheet(id);
	}
	
}
