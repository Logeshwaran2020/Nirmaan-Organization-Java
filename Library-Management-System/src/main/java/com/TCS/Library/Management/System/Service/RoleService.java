package com.TCS.Library.Management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCS.Library.Management.System.Entity.Role;
import com.TCS.Library.Management.System.Repository.IRoleRepository;

@Service
public class RoleService implements IRoleService {
	@Autowired
	IRoleRepository roleRepository;

	@Override
	public String addRole(Role role) {
        roleRepository.save(role);
		return "Role Added";
	}

	@Override
	public Role readRole(int id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> readAllRoles() {
		return roleRepository.findAll();
	}

	@Override
	public String updateRole(int id, Role role) {
		role.setRoleId(id);
		roleRepository.save(role);
		return "Role Id : "+id +" is Updated.";
	}

	@Override
	public String deleteRole(int id) {
        roleRepository.deleteById(id);
		return "Role Id : "+id+" is deleted.";
	}

	@Override
	public String deleteAllRoles() {
		
		roleRepository.deleteAll();
		return "Roles are deleted successfully.";
	}
	

}
