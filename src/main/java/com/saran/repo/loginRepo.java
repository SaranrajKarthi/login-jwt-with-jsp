package com.saran.repo;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.saran.dto.AuthRequest;
import com.saran.entity.Register_User;

public interface loginRepo extends JpaRepository<Register_User, Integer> {

	Register_User findByUserName(String username);

}
