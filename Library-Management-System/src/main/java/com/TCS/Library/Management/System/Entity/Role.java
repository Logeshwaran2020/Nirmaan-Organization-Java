package com.TCS.Library.Management.System.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int roleId;
	    private String roleName;
	    
	    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
	    @JsonManagedReference("role-users")
	    private List<Users> user;
	   
		public List<Users> getUser() {
			return user;
		}
		public void setUser(List<Users> user) {
			this.user = user;
		}
		public int getRoleId() {
			return roleId;
		}
		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
		
		public Role(int roleId, String roleName,List<Users> user) {
			super();
			this.roleId = roleId;
			this.roleName = roleName;
			this.user=user;
		}
		public Role() {
			super();
		}
	    
}
