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
import tn.spring.timesheet.Services.IProjectService;
import tn.spring.timesheet.entities.Project;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	
	@Autowired
	IProjectService projectservices; 
	
	
	@PostMapping("/add-project")
	@ResponseBody
	public Project addProject(@RequestBody Project p )
	{
		Project project= projectservices.addProject(p);
	return project;
	}

	@ResponseBody
	@GetMapping("/show-projects")
	public 	List<Project> retrieveAllProjects(){
		return projectservices.retrieveAllProjects();
	}
	@GetMapping("/show-project/{project-id}")
	@ResponseBody
	public Project retrieveProject(@PathVariable("project-id") int id) {
		return projectservices.retrieveProject(id);
	}

	@PutMapping("/modify-project")
	@ResponseBody
	public Project modifyProject(@RequestBody Project p) {
		return projectservices.updateProject(p);
	}

	
	@DeleteMapping("/removeProject/{project-id}")
	@ResponseBody
	public void removeProject(@PathVariable("project-id") int id) {
		projectservices.deleteProject(id);
	}
	
	
	@GetMapping("/bestProject")
	public String bestProject(){
		return projectservices.BestProject();
		}
	
	
	@GetMapping("/Calculate-Salary")
	public int CalculateSalary(){
		return projectservices.CalculateSalary();
		}
	@GetMapping("/{id}/remainingDays")
	public String remainingDays(@PathVariable Integer id){
		return projectservices.projectIn(id);
		}
	
	
}
