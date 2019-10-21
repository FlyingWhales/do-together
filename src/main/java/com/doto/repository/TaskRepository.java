package com.doto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doto.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	
	Optional<Task> findTaskByListId(Long listId);

}
