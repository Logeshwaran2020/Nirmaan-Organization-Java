package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Users;
import com.TCS.Library.Management.System.Repository.IUsersRepository;

@Service
public class UserService implements IUsersService{
	@Autowired
	IUsersRepository usersRepository;

	@Override
	public String addUsers(Users users) {
		usersRepository.save(users);
		return "User Added ";
	}

	@Override
	public Users readUsers(int id) {
		return usersRepository.findById(null).get();
	}

	@Override
	public List<Users> readAllUsers() {
		return usersRepository.findAll();
	}

	@Override
	public String updateUsers(int id, Users users) {
		users.setUserId(id);
		usersRepository.save(users);
		return "User Id: "+id+ "  is Updated.";
	}

	@Override
	public String deleteUsers(int id) {
		usersRepository.deleteById(id);
		return "User Id: "+id+" is deleted.";
	}

	@Override
	public String deleteAllUsers() {
		usersRepository.deleteAll();
		return "All users are deleted successfully.";
	}
	
}
