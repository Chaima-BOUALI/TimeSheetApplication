package tn.spring.timesheet.Services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.timesheet.Repositories.ProjectRepository;
import tn.spring.timesheet.entities.Project;
@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	ProjectRepository projectRepo;
	@Override
	public List<Project> retrieveAllProjects() {
		return  (List<Project>) projectRepo.findAll();		
	}

	@Override
	public Project addProject(Project p) {
		return projectRepo.save(p); 
	}

	@Override
	public void deleteProject(int id) {
		projectRepo.deleteById(id);

	}

	@Override
	public Project updateProject(Project p) {
		return projectRepo.save(p); 

	}

	@Override
	public Project retrieveProject(int id) {
		Project p = projectRepo.findById(id).get();
		return p;
	}

	@Override
	public String BestProject() {
		List<Project> projects = (List<Project>) projectRepo.findAll();
		Project Max = null;
		int max = -1;
		for (Project p : projects){
			if(p.getWorkHours() > max){
				max = p.getWorkHours();
				Max = p;
			}
		}
		return Max.getProjectName();
	}

	@Override
	public int CalculateSalary() {
		List<Project> projects = (List<Project>) projectRepo.findAll();
		Project Salary = null;
		int salary = -1;
		for (Project p : projects){
			salary=p.getPricePerHour()*p.getWorkHours(); 
			}
		
		return salary;
	}

	@Override
	public String projectIn(Integer id) {
			//int Days = Period.between(LocalDate.now(),)

			int nbDays = projectRepo.findById(id).get().getDate().getDate() - LocalDate.now().getDayOfMonth();
			System.out.println(Math.abs(nbDays));
			return ( Math.abs(nbDays) + " days");
	}
	
}
	


