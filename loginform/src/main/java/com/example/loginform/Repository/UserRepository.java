package com.example.loginform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginform.Model.tatastrivemodel;


@Repository
public interface UserRepository extends JpaRepository<tatastrivemodel, Long> {
	
	

}
