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

import com.TCS.Library.Management.System.Entity.Role;
import com.TCS.Library.Management.System.Service.RoleService;

@RestController
@RequestMapping("role")
public class RoleController {
	
	@Autowired
    RoleService roleService;
    
    @GetMapping
    public String getMethod() {
		return "...........Role..........  ";
	}
	
//create	
	@PostMapping ("create")
	public  String postRole(@RequestBody Role role) {
		
		return roleService.addRole(role) ;
	}
	
//read
	
	@GetMapping("readAll")                                        //to read all
	public List<Role> getMethod1() {
		
		return roleService.readAllRoles();
	}
	
	@GetMapping("read/{id}")                                 //to read by Id
	public Role getMethod2(@PathVariable int roleId) {
		
		return roleService.readRole(roleId);
	}
	
//update
	
	@PutMapping("update/{id}")
	public String putRole(@PathVariable int id,@RequestBody Role role) {
		
		return roleService.updateRole(id,role);
	}
	
//delete
	
	@DeleteMapping("delete/{id}")
	public String deleteRole(@PathVariable int id) {
		
		return roleService.deleteRole(id);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllRoles() {
		
		return roleService.deleteAllRoles();
	}
	
}
