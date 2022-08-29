package tn.spring.timesheet.Services;

import java.util.List;

import tn.spring.timesheet.entities.User;

public interface IUserService {
	List<User> retrieveAllUsers();

	User addUsers (User u);

	void deleteUser (int id);

	User updateUser(User u);

	User retrieveUser (int id);
}
