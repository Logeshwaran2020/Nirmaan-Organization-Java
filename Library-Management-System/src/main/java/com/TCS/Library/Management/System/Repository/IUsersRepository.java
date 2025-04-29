package com.TCS.Library.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TCS.Library.Management.System.Entity.Users;

@Repository
public interface IUsersRepository extends JpaRepository<Users, Integer>{

}
