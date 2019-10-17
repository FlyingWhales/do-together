package com.doto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doto.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Long countByEmail(String email);
}
