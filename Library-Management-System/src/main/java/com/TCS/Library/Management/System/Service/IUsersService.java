package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Users;

@Service
public interface IUsersService {
	//crud
    
	public String addUsers(Users users);           //Create
	
	public Users  readUsers(int id);                 //ReadById
	public List<Users> readAllUsers();                 //ReadAll
	
	public String updateUsers(int id,Users users);   //updateById in Table
	
	public String deleteUsers(int id);                   //deleteById
	public String deleteAllUsers();               //deleteAll


}
