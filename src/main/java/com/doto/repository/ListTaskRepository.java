package com.doto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doto.entity.ListTask;

@Repository
public interface ListTaskRepository extends JpaRepository<ListTask, Long>{

}
