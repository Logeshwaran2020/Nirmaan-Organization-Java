package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Role;

@Service
public interface IRoleService {
	
	//crud
    
	public String addRole(Role role);           //Create
	
	public Role  readRole(int id);                 //ReadById
	public List<Role> readAllRoles();                 //ReadAll
	
	public String updateRole(int id,Role role);   //updateById in Table
	
	public String deleteRole(int id);                   //deleteById
	public String deleteAllRoles();               //deleteAll


}
