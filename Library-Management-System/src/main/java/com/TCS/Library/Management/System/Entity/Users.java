package com.TCS.Library.Management.System.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Users {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int userId;
	    private String name;
	    private String email;
	    
	    @ManyToOne
	    @JsonBackReference("role-users")
	    @JoinColumn(name = "role_id")
	    private Role role;
	    
	    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	    @JsonManagedReference("borrow-user")
	    private List<Borrow> borrow;
	    
		public Role getRole() {
			return role;
		}
		public void setRole(Role role) {
			this.role = role;
		}
		public List<Borrow> getBorrow() {
			return borrow;
		}
		public void setBorrow(List<Borrow> borrow) {
			this.borrow = borrow;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Users(int userId, String name, String email, Role role, List<Borrow> borrow) {
			super();
			this.userId = userId;
			this.name = name;
			this.email = email;
			this.role = role;
			this.borrow = borrow;
		}
		public Users() {
			super();
		}

}
