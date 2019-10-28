package com.doto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doto.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	// @formatter:off
	@Query("Select task from Task task "
			+ "inner join List list on list.listId = task.listId "
			+ "where list.listId = ?1 and list.userId = ?2")
	// @formatter:on
	Iterable<Task> findTasksByListId(Long listId, Long userId);

}
