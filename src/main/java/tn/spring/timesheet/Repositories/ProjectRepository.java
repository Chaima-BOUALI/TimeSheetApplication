package tn.spring.timesheet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.timesheet.entities.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
