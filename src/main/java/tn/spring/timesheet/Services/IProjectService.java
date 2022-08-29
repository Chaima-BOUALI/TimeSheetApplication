package tn.spring.timesheet.Services;

import java.util.List;

import tn.spring.timesheet.entities.Project;

public interface IProjectService {
	List<Project> retrieveAllProjects();

	Project addProject (Project p);

	void deleteProject (int id);

	Project updateProject(Project p);

	Project retrieveProject (int id);
	
	String BestProject(); 
	
	int CalculateSalary(); 
	
	String projectIn(Integer id);

}
