package com.doto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doto.entity.UserList;

@Repository
public interface UserListRepository extends JpaRepository<UserList, Long>{

}
