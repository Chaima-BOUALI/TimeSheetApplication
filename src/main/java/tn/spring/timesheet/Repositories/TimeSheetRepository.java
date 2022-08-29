package tn.spring.timesheet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.timesheet.entities.TimeSheet;

@Repository
public interface TimeSheetRepository extends CrudRepository<TimeSheet, Integer> {

}
