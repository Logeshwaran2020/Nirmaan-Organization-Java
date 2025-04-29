package com.TCS.Library.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TCS.Library.Management.System.Entity.Users;
import com.TCS.Library.Management.System.Service.UserService;

@RestController
@RequestMapping( "user")
public class UserController {
	
	@Autowired
    UserService userService;
    
    @GetMapping
    public String getMethod() {
		return "...........User..........  ";
	}
	
//create	
	@PostMapping ("create")
	public  String postUsers(@RequestBody Users users) {
		
		return userService.addUsers(users) ;
	}
	
//read
	
	@GetMapping("readAll")                                        //to read all
	public List<Users> getMethod1() {
		
		return userService.readAllUsers();
	}
	
	@GetMapping("read/{id}")                                 //to read by Id
	public Users getMethod2(@PathVariable int UsersId) {
		
		return userService.readUsers(UsersId);
	}
	
//update
	
	@PutMapping("update/{id}")
	public String putUsers(@PathVariable int id,@RequestBody Users users) {
		
		return userService.updateUsers(id,users);
	}
	
//delete
	
	@DeleteMapping("delete/{id}")
	public String deleteUsers(@PathVariable int id) {
		
		return userService.deleteUsers(id);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllUsers() {
		
		return userService.deleteAllUsers();
	} 

}
